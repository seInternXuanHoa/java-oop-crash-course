package gpcoder.java.oop.encapsulation;

public class EncapsulationIST {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Vehicle", 200);
		System.out.println("Vehicle name: " + vehicle.getName());
		System.out.println("Vehicle speed: " + vehicle.getSpeed());
	}
}
