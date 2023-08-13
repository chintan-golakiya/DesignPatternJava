package com.abstractshapefactorypattern.main;

import com.abstractshapefactorypattern.factory.AbstractFactory;
import com.abstractshapefactorypattern.factory.FactoryProducer;
import com.abstractshapefactorypattern.factory.Shape;

public class Main {
	public static void main(String[] args) {
		AbstractFactory normalFactory = FactoryProducer.getFactory("normal");
		Shape shape = normalFactory.getShape("rectangle");
		shape.draw();
		AbstractFactory roundedFactory = FactoryProducer.getFactory("rounded");
		shape = roundedFactory.getShape("rectangle");
		shape.draw();
	}
}
