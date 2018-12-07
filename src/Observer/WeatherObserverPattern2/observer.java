package Observer.WeatherObserverPattern2;

public interface observer {
	
	public void update(WeatherSubject subject);
	
	public void setOberserName(String observerName);
	
	public String getOberserName();
}
