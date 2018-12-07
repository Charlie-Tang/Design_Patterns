package Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler{

private Object target;
	
	public LogHandler(Object target) {
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
		System.out.println("日志开始");
		
		method.invoke(target);
		
		long endtime =  System.currentTimeMillis();
		System.out.println("日志结束");
		System.out.println("日志时间"+(endtime-starttime)+"毫秒");
		
		return null;
	}
}
