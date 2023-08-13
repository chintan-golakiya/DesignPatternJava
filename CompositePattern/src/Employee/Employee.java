package Employee;

public interface Employee {
	public int getId();
	public String getName();
	public void add(Employee employee);
	public void remove(Employee employee);
	public Employee getChild(int i);
}
