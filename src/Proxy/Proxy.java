package Proxy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;


public class Proxy {
	//测试类
	@SuppressWarnings("rawtypes")
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception {
		
		String rt = "\r\n";
		String methodStr = "";
		for (Method m : infce.getMethods()) {
			methodStr += "@Override"+ rt +
			"public void "+ m.getName()+"(){"+ rt +
			"try{" + rt +
			"Method md = " + infce.getSimpleName() + ".class.getMethod(\"" 
					+ m.getName() + "\");" + rt +
			" h.invoker(this,md);" + rt +
			"}catch(Exception e){e.printStackTrace();}" + rt +
			"}";
		}
		String str =
		"package Proxy;"+ rt +
		"import Proxy.InvocationHandler;" + rt +
		"import java.lang.reflect.Method;" + rt +
		//使用聚合方式实现
		"public class $Proxy0 implements "+infce.getSimpleName()+ "{"+ rt +
		"	 public $Proxy0(InvocationHandler h) {"+ rt +
		"		super();"+ rt +
		"	 	this.h = h;"+ rt +
		"	 }"+ rt +
		"	 private InvocationHandler h;"+ rt +
			methodStr + rt +
		"}";
		//产生代理类的java文件
		String filename = System.getProperty("user.dir")+"/bin/Proxy/$Proxy0.java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str,"UTF-8");
		
		//编译 拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units = fileManager.getJavaFileObjects(filename);
		//编译任务
		@SuppressWarnings("unchecked")
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		//进行编译
		task.call();
		fileManager.close();
		
		//load到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
			Class c = cl.loadClass("Proxy.$Proxy0");
			System.out.println(c.getName());
		
		@SuppressWarnings("unchecked")
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		return ctr.newInstance(h);
		
	}
	
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
		m.move();
	}
}
