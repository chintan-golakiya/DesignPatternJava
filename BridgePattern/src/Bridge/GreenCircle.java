package Bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("draw Green circle at ("+x+","+y+") with radius "+radius);
	}

}
