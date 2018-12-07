package Observer.com.ObserverPatternCommon;
/*
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * */

import java.util.ArrayList;
import java.util.List;

public class Subject {
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	
	protected void notifyObservers() {
		
		for(Observer observer:observers)
		{
			observer.update(this);
		}
	}
}
