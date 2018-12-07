package Proxy;

public class Car2 extends Car{
	
	//使用继承的方式进行代理
	@Override
	public void move() {
		
		long starttime = System.currentTimeMillis();
		System.out.println("汽车行驶开始");
		super.move();
		long endtime =  System.currentTimeMillis();
		System.out.println("汽车行驶结束");
		System.out.println("汽车行驶时间"+(endtime-starttime)+"毫秒");
	}
	
	public static void main(String[] args) {
		
		Moveable m = new Car2();
		m.move();
	}
	
	
}
