package builderpattern.Item;

public class Pepsi extends ColdDrink {
	public Pepsi() {
		super("Pepsi",30);
	}

	@Override
	void prepare() {
		System.out.println("prepare "+this.name);
	}
	
}
