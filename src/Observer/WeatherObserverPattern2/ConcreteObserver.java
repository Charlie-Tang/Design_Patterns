package Observer.WeatherObserverPattern2;

public class ConcreteObserver implements observer {
	
	public String observerName;
	public String weatherContent;
	public String rimindThing;
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRimindThing() {
		return rimindThing;
	}

	public void setRimindThing(String rimindThing) {
		this.rimindThing = rimindThing;
	}

	@Override
	public void update(WeatherSubject subject) {
		
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName  +  weatherContent  + rimindThing);
	}

	@Override
	public void setOberserName(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public String getOberserName() {
		return observerName;
	}

}
