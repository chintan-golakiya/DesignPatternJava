package Employee;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {
	
	int id;
	String name;
	List<Employee> reporteeList;
	
	public BankManager(int id, String name) {
		this.id = id;
		this.name = name;
		reporteeList = new ArrayList<>();
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
		reporteeList.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		reporteeList.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		if(i<reporteeList.size()) {
			return reporteeList.get(i);
		}
		return null;
	}

}
