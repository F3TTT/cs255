package AthleteExample;

public class Athlete extends Person {

	private String sport;
	private Double hoursTrained;
	
	public Athlete(String firstName, String lastName, String sport) {
		super(firstName, lastName);
		this.sport = sport;
		this.hoursTrained = 0.0;
	}

	public String getSport() {
		return sport;
	}

	public Double getHoursTrained() {
		return hoursTrained;
	}

	protected void setSport(String sport) {
		this.sport = sport;
	}

	protected void setHoursTrained(double hoursTrained) {
		this.hoursTrained = hoursTrained;
	}

	public void train (double hoursTrained) {
		setHoursTrained(getHoursTrained() + hoursTrained);
	}
	
	
}
