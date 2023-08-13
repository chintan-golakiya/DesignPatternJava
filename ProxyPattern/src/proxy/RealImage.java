package proxy;

public class RealImage implements Image { 

	private String filename;
	
	public RealImage(String f) {
		filename = f;
		loadFromDisk(filename);
	}
	
	@Override
	public void display() {
		System.out.println("displaying "+filename);
	}
	
	public void loadFromDisk(String filename) {
		System.out.println("loading file "+filename);
	}
}
