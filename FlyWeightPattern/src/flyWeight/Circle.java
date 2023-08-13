package flyWeight;

public class Circle implements Shape{
	int x,y,r;
	String color;
	
	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int r) {
		this.r = r;
	}


	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + r);
	}
	
	
}
