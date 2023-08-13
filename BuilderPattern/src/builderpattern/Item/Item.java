package builderpattern.Item;

import builderpattern.Packing.Packing;

public abstract class Item {
	String name;
	int price;
	Packing packing;
	
	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	abstract void setPacking();
	
	abstract void prepare();
	
	public int getPrice() {
		return price;
	}
}
