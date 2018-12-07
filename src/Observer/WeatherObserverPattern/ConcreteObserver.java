package Observer.WeatherObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
	
	private String observerName;
	
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(observerName+"收到了信息，目标推送过来的是："+arg);
		
		System.out.println(observerName+"收到了信息，主动到目标对象中去拉，拉的内容是："+((ConcreteWeatherSubject)o).getWeatherContent());
	}

}
