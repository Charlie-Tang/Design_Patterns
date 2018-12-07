package Observer.WeatherObserverPattern2;

public class ConcreteWeatherSubject extends WeatherSubject {
	
	private String WeatherContent;
	
	public String getWeatherContent() {
		return WeatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		WeatherContent = weatherContent;
		this.notifyObservers();
	}

	@Override
	protected void notifyObservers() {
		
		for(observer observer: observers)
		{
			if ("下雨".equals(WeatherContent)) {
				if ("黄明的女朋友".equals(observer.getOberserName())) {
					observer.update(this);
				}
			}
			if ("黄明的妈妈".equals(observer.getOberserName())) {
					observer.update(this);
			}
			
			
			if ("下雪".equals(WeatherContent)) {
				if ("黄明的母亲".equals(observer.getOberserName())) {
					{
						observer.update(this);
					}
					
				}
				
			}
			
		}
	}

}
