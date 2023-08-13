package ShapeDecorator;

public class RedBorderShapeDecorator extends ShapeDecorator {

	
	public RedBorderShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		this.shapeInstance.draw();
		System.out.println("add decoration Red border");

	}

}
