package AthleteExample;

public class AthleteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Athlete jacob = new Athlete ("Jacob", "Adams", "Running");
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained());
		jacob.setFirstName("Joseph");
		jacob.setLastName("Mein");
		jacob.train(3);
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained());

		
	}

}
