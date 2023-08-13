package birdApdaterPattern.adapter;

public class ToyDuck implements TargetDuck {
	
	@Override
	public void squeak() {
		System.out.println("Squeak");
	}
}
