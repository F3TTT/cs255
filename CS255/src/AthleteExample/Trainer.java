package AthleteExample;

public class Trainer extends Person {

	private String sport;
	private int yearsOfExperience;
	
	public Trainer(String firstName, String lastName, String sport) {
		 super(firstName, lastName);
		 this.sport = sport;
		 this.yearsOfExperience = 0;
		 
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String toString() {
		String retString = "Trainer: ";
		retString += getFirstName() + " " + getLastName() + " " + getSport() + " " + getYearsOfExperience();
		return retString;
	}
}
