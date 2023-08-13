package facadePattern;

public class ShapeMaker {
	
	Shape circle, rectangle, triangle;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}

}
