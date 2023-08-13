package ShapeDecorator;

public abstract class ShapeDecorator implements Shape {

	Shape shapeInstance;
	
	public ShapeDecorator(Shape shape) {
		shapeInstance = shape;
	}
	
	@Override
	public abstract void draw();

}
