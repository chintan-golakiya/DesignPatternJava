package builderpattern.Meal;

import java.util.ArrayList;

import builderpattern.Item.Item;

public class Meal {
	ArrayList<Item> items;
	
	public Meal() {
		items = new ArrayList<>();
	}
	
	public void AddItem(Item item) {
		if(item!=null) {
			items.add(item);
		}
	}
	
	public int getPrice() {
		int amount = 0;
		for(Item i:items) {
			amount += i.getPrice();
		}
		return amount;
	}
}
