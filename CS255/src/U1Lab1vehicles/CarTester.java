/**
 * 
 */
package U1Lab1vehicles;

/**
 * @author Dan Doughty
 *
 */
public class CarTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car dansKia = new Car("Kia","Optima",2013,4,4);
		System.out.println(dansKia.getMake() + " " + dansKia.getModel() + " " + dansKia.getYear() + " " + dansKia.getNumberOfWheels() + " " + dansKia.getNumberOfDoors());
		dansKia.setMake("Ford");
		dansKia.setModel("F150");
		dansKia.setYear(1965);
		dansKia.setNumberOfWheels(4);
		dansKia.setNumberOfDoors(2);
		System.out.println(dansKia.getMake() + " " + dansKia.getModel() + " " + dansKia.getYear() + " " + dansKia.getNumberOfWheels() + " " + dansKia.getNumberOfDoors());


	}

}
