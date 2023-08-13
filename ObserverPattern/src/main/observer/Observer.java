package main.observer;

public abstract class Observer {
	Subject subject;
	
	public Observer(Subject sub) {
		this.subject = sub;
	}
	
	public abstract void update();
}
