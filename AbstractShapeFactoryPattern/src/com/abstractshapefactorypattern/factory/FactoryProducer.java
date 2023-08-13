package com.abstractshapefactorypattern.factory;


public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if(factory.equalsIgnoreCase("normal")) {
			return new ShapeFactory();
		} else if(factory.equalsIgnoreCase("rounded")) {
			return new RoundedShapeFactory();
		}
		return null;
	}
}
