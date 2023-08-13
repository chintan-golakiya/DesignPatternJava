package Main;

import Employee.*;

public class Main {

	public static void main(String[] args) {
		Employee manager = new BankManager(1,"manager name");
		
		Employee accountant = new Accountant(2,"accountant");
		Employee cashier = new Cashier(3,"cashier");
		
		manager.add(accountant);
		manager.add(cashier);
		
		Employee e = manager.getChild(0);
		System.out.println(e.getName());
		manager.remove(e);
		e = manager.getChild(0);
		System.out.println(e.getName());
	}

}
