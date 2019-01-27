package AthleteExample;

/**
 * @author Dan Doughty
 * @class  CS255 - Spring 2019 - taught by Professor Weaver at JCCC
 * @labNumber U1Lab2
 * @classDefinition BicyclistTester is used to test functions of Bicyclist.  It should set and get all variables and use all functions.
 */

public class BicyclistTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicyclist jacob = new Bicyclist("Jacob", "Adams");
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained());
		jacob.setFirstName("Joseph");
		jacob.setLastName("Mein");
		jacob.train(3);
		jacob.raceOnroad(25.0);
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained() + " " + jacob.getMilesRacedOnroad());
		jacob.raceOnroad(20.0);
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName() + " " + jacob.getSport() + " " + jacob.getHoursTrained() + " " + jacob.getMilesRacedOnroad());
		System.out.println(jacob);

		
	}

}
