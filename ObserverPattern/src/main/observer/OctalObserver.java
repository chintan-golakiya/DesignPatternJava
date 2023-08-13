package main.observer;

public class OctalObserver extends Observer {
	int state;
	public OctalObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		state = this.subject.getState()%8;
		System.out.println("Octal state : "+state);
	}

}
