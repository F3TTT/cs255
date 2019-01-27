/**
 * 
 */
package AthleteExample;

/**
 * @author Dan Doughty 
 *
 */
public class PersonTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person jacob = new Person("Jacob", "Adams");
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName());
		jacob.setFirstName("Joseph");
		jacob.setLastName("Mein");
		System.out.println(jacob.getFirstName() + " " + jacob.getLastName());

	}

}
