package main;

import proxy.Image;
import proxy.ProxyImage;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("readme.md");
		image.display();
		
		image.display();

	}

}
