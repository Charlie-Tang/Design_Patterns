package Observer.WeatherObserverPattern;

public class Client {
	
	public static void main(String[] args) {
		
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		ConcreteObserver gril = new ConcreteObserver();
		gril.setObserverName("黄明的女友");
		
		ConcreteObserver mom = new ConcreteObserver();
		mom.setObserverName("黄明的老妈");
		
		subject.addObserver(gril);
		subject.addObserver(mom);
		
		subject.setWeatherContent("下雨了");
	}
}
