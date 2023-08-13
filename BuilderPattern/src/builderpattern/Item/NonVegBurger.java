package builderpattern.Item;

public class NonVegBurger extends Burger {

	
	public NonVegBurger() {
		super("Non-Veg Burger", 120);
	}

	@Override
	void prepare() {
		System.out.println("Prepare "+ this.name);
	}

}
