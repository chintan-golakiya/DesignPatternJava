package main.stock;

public class BuyStock implements Order {

	Stock stock;
	
	public BuyStock(Stock s) {
		this.stock = s;
	}
	
	@Override
	public void execute() {
		stock.buy(2);
	}

}
