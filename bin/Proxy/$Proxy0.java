package Proxy;
import Proxy.InvocationHandler;
import java.lang.reflect.Method;
public class $Proxy0 implements Moveable{
	 public $Proxy0(InvocationHandler h) {
		super();
	 	this.h = h;
	 }
	 private InvocationHandler h;
@Override
public void move(){
try{
Method md = Moveable.class.getMethod("move");
 h.invoker(this,md);
}catch(Exception e){e.printStackTrace();}
}
}