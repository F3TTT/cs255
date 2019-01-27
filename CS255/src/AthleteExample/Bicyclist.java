package AthleteExample;

/**
 * @author Dan Doughty
 * @class  CS255 - Spring 2019 - taught by Professor Weaver at JCCC
 * @labNumber U1Lab2
 * @classDefinition Bicyclist is a sublass of athlete.  Bicycle racers tend to travel at different speeds whether onroad or 
 *   offroad.  It’s useless to include those metrics together so I’m renaming them to be more specific.  Variables will 
 *   track road miles and number of road races participated in.  Functions exist to get and set those values and also a 
 *   toString function which will make the code more readable.
 */

public class Bicyclist extends Athlete {

	
	private double milesRacedOnroad;
	private int numberOfRacesOnroad;
	
	public Bicyclist (String firstName, String lastName) {
		super(firstName,lastName,"Bicycling");
		this.milesRacedOnroad = 0.0;
		this.numberOfRacesOnroad = 0;
	}

	
	/**
	 * Basic getter method
	 * @return The miles raced onroad
	 */
	public double getMilesRacedOnroad() {
		return milesRacedOnroad;
	}

	/**
	 * Basic getter method
	 * @return The number of races completed onroad
	 */
	public int getnumberOfRacesOnroad() {
		return numberOfRacesOnroad;
	}

	/**
	 * Basic setter method
	 * @param milesRacedOnroad The number of miles raced onroad 
	 */
	private void setmilesRacedOnroad(double milesRacedOnroad) {
		this.milesRacedOnroad = milesRacedOnroad;
	}

	/**
	 * Basic setter method
	 * @param numberOfRacesOnroad The number of races completed onroad
	 */
	private void setnumberOfRacesOnroad(int numberOfRacesOnroad) {
		this.numberOfRacesOnroad = numberOfRacesOnroad;
	}
	
	/**
	 * This method increments the number of races completed by 1 and increases the miles raced by how length of the race.
	 * @param milesRacedOnroad The number of miles raced onroad
	 */
	public void raceOnroad(double milesRacedOnroad) {
		setnumberOfRacesOnroad(getnumberOfRacesOnroad() + 1);
		setmilesRacedOnroad(getMilesRacedOnroad() + milesRacedOnroad);
	}
	
	/* (non-Javadoc)
	 * This method increases the readability of the code
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String retString = "Bicyclist: ";
		retString += getFirstName() + " " + getLastName() + " " + getSport() + " " + getHoursTrained() + " " + getMilesRacedOnroad() + " " + getnumberOfRacesOnroad();
		return retString;
	}
}
