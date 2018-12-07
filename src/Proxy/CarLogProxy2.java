package Proxy;

//使用聚合方式实现
public class CarLogProxy2 implements Moveable{
	
	private Moveable m;
	
	public CarLogProxy2(Moveable m) {
		super();
		this.m = m;
	}
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("日志开始");
		m.move();
		long endtime =  System.currentTimeMillis();
		System.out.println("日志结束");
		System.out.println("日志时间"+(endtime-starttime)+"毫秒");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Moveable m = new CarLogProxy2(car);
		m.move();
	}
	
}
