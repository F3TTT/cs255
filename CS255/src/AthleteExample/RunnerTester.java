package AthleteExample;

public class RunnerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner jacob = new Runner("Jacob", "Adams");
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained());
		jacob.setFirstName("Joseph");
		jacob.setLastName("Mein");
		jacob.train(3);
		jacob.race(25.0);
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained() + " " + jacob.getMilesRaced());
		jacob.race(20.0);
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained() + " " + jacob.getMilesRaced());
		System.out.println(jacob);

		
	}

}
