package birdApdaterPattern.Main;

import birdApdaterPattern.adapter.*;

public class Main {
	public static void main(String[] args) {
		TargetDuck toyDuck = new ToyDuck();
		toyDuck.squeak();
		
		TargetDuck adapterObjDuck = new ToyDuckAdapter(new Bird());
		adapterObjDuck.squeak();
	}
}
