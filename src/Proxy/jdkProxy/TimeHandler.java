package Proxy.jdkProxy;

//JDK的动态代理只能代理实现了接口的类，没有实现的类是无法使用jdk的动态代理的
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	
	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	/*
	 * proxy 被代理对象
	 * method 被代理对象的方法
	 * args 方法参数
	 * 
	 * 返回值
	 * Object 方法的返回值
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		long starttime = System.currentTimeMillis();
		System.out.println("汽车行驶开始");
		
		method.invoke(target);
		
		long endtime =  System.currentTimeMillis();
		System.out.println("汽车行驶结束");
		System.out.println("汽车行驶时间"+(endtime-starttime)+"毫秒");
		
		return null;
	}

}
