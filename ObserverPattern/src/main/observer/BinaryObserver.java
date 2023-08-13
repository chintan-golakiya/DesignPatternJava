package main.observer;

public class BinaryObserver extends Observer {
	boolean state;
	public BinaryObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		state = this.subject.getState()%2 == 0;
		System.out.println("Binary Observer :"+state);
	}

}
