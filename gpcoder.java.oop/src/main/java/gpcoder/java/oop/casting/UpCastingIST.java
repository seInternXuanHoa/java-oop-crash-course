package gpcoder.java.oop.casting;

public class UpCastingIST {
	public static void main(String[] args) {
		// Upcasting
		Vehicle vehicle = new Volvo("Volvo", 200, "V001");
		vehicle.run();
		
		// Downcasting
		Volvo otherVehicle = (Volvo) vehicle;
		otherVehicle.run(100);
	}
}
