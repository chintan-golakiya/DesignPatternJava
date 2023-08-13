package Main;

import facadePattern.ShapeMaker;

public class Main {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawTriangle();
	}

}
