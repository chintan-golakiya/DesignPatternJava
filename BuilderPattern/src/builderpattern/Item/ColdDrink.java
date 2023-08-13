package builderpattern.Item;

import builderpattern.Packing.Bottle;

public abstract class ColdDrink extends Item {
	
	
	
	ColdDrink(String name, int price) {
		super(name, price);
	}

	@Override
	void setPacking() {
		this.packing = new Bottle();
	}
}
