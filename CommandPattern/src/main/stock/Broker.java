package main.stock;

import java.util.*;

public class Broker {
	List<Order> orders;
	
	public Broker() {
		orders = new ArrayList<>();
	}
	
	public void takeOrder(Order o) {
		orders.add(o);
	}
	
	public void executeOrders() {
		for(Order o:orders) {
			o.execute();
		}
		orders.clear();
	}
}
