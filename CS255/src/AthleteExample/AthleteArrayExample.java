package AthleteExample;

/**
 * @author Dan Doughty
 * @class  CS255 - Spring 2019 - taught by Professor Weaver at JCCC
 * @labNumber U3Lab1
 * @classDefinition AthleteArrayExample is used to display understanding of arrays, building an array with multiple classtypes in it and show looping through an array.
 */

public class AthleteArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Athlete jacob = new Athlete("Jacob","Adams","Running");
		Runner susan = new Runner("Susan","Davis");
		Bicyclist roberta = new Bicyclist("Roberta", "Legsly");
		Runner luke = new Runner("Luke","Johnson");
		Bicyclist chuck = new Bicyclist("Chuck", "Armsly");
		Athlete kyle = new Athlete("Kyle","Neckly","Running");
		Runner sara = new Runner("Sara","Elbowly");
		Bicyclist ruita = new Bicyclist("Ruita", "Kneesly");
		Runner lyle = new Runner("Lyle","Anklely");
		Bicyclist caio = new Bicyclist("Caio", "Early");
		
		Athlete[] athletes = new Athlete[10];
		
		athletes[0] = jacob;
		athletes[1] = susan;
		athletes[2] = roberta;
		athletes[3] = luke;
		athletes[4] = chuck;
		athletes[5] = kyle;
		athletes[6] = sara;
		athletes[7] = ruita;
		athletes[8] = lyle;
		athletes[9] = caio;
		
//		System.out.println(Arrays.toString(athletes));
		
		for (Athlete athleteTemp : athletes) {
			displayAthleteInfo(athleteTemp);

		}
	}
		public static void displayAthleteInfo(Athlete aAthlete) {
			System.out.println("First Name: " + aAthlete.getFirstName() + "\n" + "Last Name: " + aAthlete.getLastName());
		}

		

}
