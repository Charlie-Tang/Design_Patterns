package Proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {
	
	public void invoker(Object o,Method m);
}
