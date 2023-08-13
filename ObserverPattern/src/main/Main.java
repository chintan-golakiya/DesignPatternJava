package main;

import main.observer.BinaryObserver;
import main.observer.OctalObserver;
import main.observer.Subject;

public class Main {

	public static void main(String[] args) {
		Subject sub = new Subject();
		
		new BinaryObserver(sub);
		new OctalObserver(sub);
		sub.setState(13);
		sub.setState(68);
	}

}
