package proxy;

public class ProxyImage implements Image {

	RealImage realImage;
	String filename;
	
	public ProxyImage(String f) {
		this.filename = f;
	}
	
	@Override
	public void display() {
		if(realImage==null) {
			realImage = new RealImage(this.filename);
		}
		realImage.display();
	}

}
