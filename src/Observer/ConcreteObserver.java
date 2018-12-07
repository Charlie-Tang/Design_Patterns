package Observer;

public class ConcreteObserver implements Observer {
	//观察者姓名
	private String observerName;
	
	//天气内容的情况
	private String WeatherContent;
	
	//提醒的内容
	private String rimindThing;
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	public String getWeatherContent() {
		return WeatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		WeatherContent = weatherContent;
	}
	public String getRimindThing() {
		return rimindThing;
	}
	public void setRimindThing(String rimindThing) {
		this.rimindThing = rimindThing;
	}
	@Override
	public void update(String content) {
		
//		WeatherContent=((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
		WeatherContent = content;
		System.out.println(observerName+"收到了"+WeatherContent+","+rimindThing);
		
		
	}

}
