package builderpattern.Item;

import builderpattern.Packing.Wrapper;

public abstract class Burger extends Item {
	
	
	
	Burger(String name, int price) {
		super(name, price);
	}

	@Override
	void setPacking() {
		this.packing = new Wrapper();
	}
}
