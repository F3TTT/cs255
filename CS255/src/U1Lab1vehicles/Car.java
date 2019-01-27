/**
 * 
 */
package U1Lab1vehicles;

/**
 * @author Dan Doughty
 *
 */
public class Car extends Vehicle{
	
	private int numberOfWheels;
	private int numberOfDoors;
	
	public Car(String make, String model, int year, int numberOfWheels, int numberOfDoors) {
		super(make,model,year);
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	

}
