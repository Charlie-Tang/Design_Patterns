package Proxy;

//使用聚合方式实现
public class CarTimeProxy implements Moveable{
	
	private Moveable m;
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车行驶开始");
		m.move();
		long endtime =  System.currentTimeMillis();
		System.out.println("汽车行驶结束");
		System.out.println("汽车行驶时间"+(endtime-starttime)+"毫秒");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Moveable m = new CarTimeProxy(car);
		m.move();
	}
	
}
