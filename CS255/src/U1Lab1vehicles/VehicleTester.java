package U1Lab1vehicles;

public class VehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle dansKia = new Vehicle("Kia","Optima",2013);
		System.out.println(dansKia.getMake() + " " + dansKia.getModel() + " " + dansKia.getYear());
		dansKia.setMake("Ford");
		dansKia.setModel("F150");
		dansKia.setYear(1965);
		System.out.println(dansKia.getMake() + " " + dansKia.getModel() + " " + dansKia.getYear());

	}

}
