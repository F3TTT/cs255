package AthleteExample;

public class Runner extends Athlete {

	
	private double milesRaced;
	private int numberOfRaces;
	
	public Runner (String firstName, String lastName) {
		super(firstName,lastName,"Running");
		this.milesRaced = 0.0;
		this.numberOfRaces = 0;
	}

	public double getMilesRaced() {
		return milesRaced;
	}

	public int getNumberOfRaces() {
		return numberOfRaces;
	}

	private void setMilesRaced(double milesRaced) {
		this.milesRaced = milesRaced;
	}

	private void setNumberOfRaces(int numberOfRaces) {
		this.numberOfRaces = numberOfRaces;
	}
	
	public void race(double milesRaced) {
		setNumberOfRaces(getNumberOfRaces() + 1);
		setMilesRaced(getMilesRaced() + milesRaced);
	}
	
	public String toString() {
		String retString = "Runner: ";
		retString += getFirstName() + " " + getLastName() + " " + getSport() + " " + getHoursTrained() + " " + getMilesRaced() + " " + getNumberOfRaces();
		return retString;
	}
}
