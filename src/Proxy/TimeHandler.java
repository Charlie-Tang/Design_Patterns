package Proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	
	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public void invoker(Object o, Method m) {
		try {
			long starttime = System.currentTimeMillis();
			System.out.println("汽车行驶开始");
			
			m.invoke(target);
			
			long endtime =  System.currentTimeMillis();
			System.out.println("汽车行驶结束");
			System.out.println("汽车行驶时间"+(endtime-starttime)+"毫秒");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
