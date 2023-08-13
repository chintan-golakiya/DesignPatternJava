package Bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("draw Red circle at ("+x+","+y+") with radius "+radius);
	}

}
