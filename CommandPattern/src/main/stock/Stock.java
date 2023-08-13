package main.stock;

public class Stock {
	protected String name;
	protected int quantity;
	public Stock(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	protected void buy(int q) {
		System.out.println("Buy "+q+" number of stock of "+name);
		this.quantity+=q;
	}
	
	protected void sell(int q) {
		System.out.println("Sell "+Math.min(q, this.quantity)+" number of stock of "+name);
		this.quantity = Math.max(this.quantity-q,0);
	}
}
