package Main;

import Bridge.Circle;
import Bridge.GreenCircle;
import Bridge.RedCircle;
import Bridge.Shape;

public class Main {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
	    Shape greenCircle = new Circle(0,0, 8, new GreenCircle());
	    redCircle.draw();
	    greenCircle.draw();
	}
}
