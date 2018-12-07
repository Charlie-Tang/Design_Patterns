package Observer;
public class Client {
	public static void main(String[] args) {
		//1.创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		
		//2.创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("黄明的女朋友");
		observerGirl.setRimindThing("我们的第一次约会，地点街心公园");
		
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("黄明的老娘");
		observerMum.setRimindThing("是一个购物的好日子 明天去逛街");
		
		//3.注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		
		//4.目标发布天气
		weather.setWeatherContent("明天天气晴朗，28度");
	}
}
