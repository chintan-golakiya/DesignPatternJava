package builderpattern.Item;

public class Coke extends ColdDrink {
	
	Coke() {
		super("Coke", 20);
	}
	@Override
	void prepare() {
		System.out.println("prepare "+this.name);
	}

}
