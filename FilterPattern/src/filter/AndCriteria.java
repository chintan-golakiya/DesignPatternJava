package filter;

import java.util.List;

import person.Person;

public class AndCriteria implements Criteria {
	private Criteria c1;
	private Criteria c2;
	
	public AndCriteria(Criteria c1, Criteria c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredList = c1.meetCriteria(persons);
		return c2.meetCriteria(filteredList);
	}

}
