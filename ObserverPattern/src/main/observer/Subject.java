package main.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observers;
	
	int state;
	
	public Subject() {
		observers = new ArrayList<>();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer obj : observers) {
			obj.update();
		}
	}
}
