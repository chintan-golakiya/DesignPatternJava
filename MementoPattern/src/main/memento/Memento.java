package main.memento;

public class Memento {
	private String state;
	
	public Memento(String s) {
		state = s;
	}
	
	public String getState() {
		return state;
	}
}
