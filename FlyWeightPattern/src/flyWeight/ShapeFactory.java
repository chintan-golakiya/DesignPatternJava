package flyWeight;

import java.util.HashMap;

public class ShapeFactory {

	static final HashMap<String, Shape> map = new HashMap<>();
	
	public Shape getCircle(String color) {
		Circle circle = (Circle)map.get(color);
		if(circle==null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("creating new circle with color "+color);
		}
		return circle;
	}
}
