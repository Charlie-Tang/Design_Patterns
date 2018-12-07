package Observer.WeatherObserverPattern;

import java.util.Observable;

public class ConcreteWeatherSubject extends Observable {
	
	public String getWeatherContent() {
		return WeatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.WeatherContent = weatherContent;
		//注意在通知之前，该语句不可少
		this.setChanged();
		
		this.notifyObservers(weatherContent);
	}

	private String WeatherContent;
}
