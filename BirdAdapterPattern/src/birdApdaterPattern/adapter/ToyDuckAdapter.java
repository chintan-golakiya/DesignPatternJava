package birdApdaterPattern.adapter;

public class ToyDuckAdapter implements TargetDuck{
	
	Bird bird;
	
	public ToyDuckAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void squeak() {
		bird.makeSound();
	}
}
