package AthleteExample;

import java.util.Arrays;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Athlete jacob = new Athlete("Jacob","Adams","Running");
		Runner susan = new Runner("Susan","Davis");
		Trainer amanda = new Trainer("Amanda", "Lewis", "Running");
		Runner luke = new Runner("Luke","Johnson");
		Trainer charles = new Trainer("Charles", "Yomey", "Running");

		//Sue is now an alias for susan
//		Runner sue = susan;
//		System.out.println(susan);
//		sue.race(10);
//		System.out.println(susan);
//		System.out.println(sue);
		
		System.out.println();
		
		Person[] people = new Person[5];
		/*
		System.out.println(jacob);
		System.out.println(susan);
		System.out.println(amanda);
		
		displayPersonalInfo(jacob);
		displayPersonalInfo(susan);
		displayPersonalInfo(amanda);
		*/
		people[0] = jacob;
		people[1] = susan;
		people[2] = amanda;
		people[3] = luke;
		people[4] = charles;
		
		System.out.println(Arrays.toString(people));
		Arrays.sort(people);
		
	}

	public static void displayPersonalInfo(Person aPerson) {
		System.out.println("First Name: " + aPerson.getFirstName() + "\n" + "Last Name: " + aPerson.getLastName());
	}
}
