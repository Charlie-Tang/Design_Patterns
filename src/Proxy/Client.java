package Proxy;

public class Client {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy2 clp = new CarLogProxy2(ctp);
		clp.move();
		
	}
}
