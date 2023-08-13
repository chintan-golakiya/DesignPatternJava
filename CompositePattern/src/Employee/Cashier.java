package Employee;

public class Cashier implements Employee {
	int id;
	String name;
	
	
	public Cashier(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void add(Employee employee) {
	}

	@Override
	public void remove(Employee employee) {
	}

	@Override
	public Employee getChild(int i) {
		return null;
	}

}
