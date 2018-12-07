package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	//把订阅天气的人添加到订阅者列表中
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	//删除集合中指定订阅天气的人
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	//通知所有已经订阅了天气的人
	protected void notifyObservers(String content) {
		
//		for(Observer observer:observers)
//		{
//			observer.update(this);
//		}
		
		for(Observer observer:observers)
		{
			observer.update(content);
		}
	}
}
