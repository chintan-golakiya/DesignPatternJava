package filter;

import java.util.List;

import person.Person;

public class OrCriteria implements Criteria {
	
	private Criteria c1;
	private Criteria c2;
	
	public OrCriteria(Criteria c1, Criteria c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> f1 = c1.meetCriteria(persons);
		List<Person> f2 = c2.meetCriteria(persons);
		
		for(Person p:f2) {
			if(f1.contains(p) == false) {
				f1.add(p);
			}
		}
		return f1;
	}

}
