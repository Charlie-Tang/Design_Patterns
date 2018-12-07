package Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import Proxy.Car;
import Proxy.Moveable;

public class Test {
	
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h1 = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 *loader 类加载器
		 *interface 实现接口
		 *h InvocationHandler
		 *
		 *动态代理实现思路
		 *实现功能：通过Proxy的newProxyInstance返回代理对象
		 *1.声明一段源码(动态产生代理)
		 *2.编译源码(JDK Compiler API),产生新的类(代理类)
		 *3.将这个类load内存当中，产生了一个新的对象(代理对象)
		 *4.return 代理对象
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader()
				, cls.getInterfaces(), h1);
		
		//在这里要记得m到底是什么
		InvocationHandler h2 = new LogHandler(m);
		Class<?> cls2 = m.getClass();
	    Moveable m2 = (Moveable)Proxy.newProxyInstance(cls2.getClassLoader(), cls2.getInterfaces(), h2);
	    m2.move();
	    
	}
}
