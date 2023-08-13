package com.abstractshapefactorypattern.factory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("rectangle")) {
			return new RoundedRectangle();
		}
		else if(shape.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}
		return null;
	}

}
