package main.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> list;
	
	public CareTaker() {
		list = new ArrayList<>();
	}
	
	public void add(Memento m) {
		list.add(m);
	}
	
	public Memento get(int i) {
		if(i<list.size()) {
			return list.get(i);
		}
		return null;
	}
}
