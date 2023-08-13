package Main;

import ShapeDecorator.*;

public class Main {

	public static void main(String[] args) {
		Shape normalCircle = new Circle();
		normalCircle.draw();
		
		Shape decoratedCircle = new RedBorderShapeDecorator(new Circle());
		decoratedCircle.draw();
		
		Shape decoratedRectangle = new RedBorderShapeDecorator(new Rectangle());
		decoratedRectangle.draw();

	}

}
