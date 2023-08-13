package builderpattern.Item;

public class VegBurger extends Burger {
	
	public VegBurger() {
		super("Veg Burger", 80);
	}

	@Override
	void prepare() {
		System.out.println("Prepare "+ this.name);
	}

}
