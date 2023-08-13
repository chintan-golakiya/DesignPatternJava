package main;

import person.*;
import filter.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	      List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));

	      Criteria male = new CirteriaMale();
	      Criteria female = new CirteriaFemale();
	      Criteria maleAndfemale = new AndCriteria(female, male);
	      Criteria maleorfemale = new OrCriteria(male, female);

	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));

	      System.out.println("\nMales And Females: ");
	      printPersons(maleAndfemale.meetCriteria(persons));

	      System.out.println("\nMales Or Females: ");
	      printPersons(maleorfemale.meetCriteria(persons));
	   }

	   public static void printPersons(List<Person> persons){
	   
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
	      }
	   }   

}
