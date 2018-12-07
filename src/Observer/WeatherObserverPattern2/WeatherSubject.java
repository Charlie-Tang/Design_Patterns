package Observer.WeatherObserverPattern2;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	
	public List<observer> observers = new ArrayList<observer>();
	
	public void attach(observer observer)
	{
		observers.add(observer);
	}
	
	public void detach(observer observer)
	{
		observers.remove(observer);
	}
	
	protected abstract void notifyObservers();
}
