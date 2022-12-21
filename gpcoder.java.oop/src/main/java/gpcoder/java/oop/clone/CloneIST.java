package gpcoder.java.oop.clone;

public class CloneIST {
	public static void main(String[] args) {
		Vehicle volvo = new Vehicle("Volvo", 250);
		Vehicle cloneVolvo = null;
		Vehicle otherVolvo = volvo;
		try {
			cloneVolvo = (Vehicle) volvo.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Reference Copy
		System.out.println("BEFORE:");
		System.out.println(volvo);
		System.out.println(otherVolvo);

		System.out.println("AFTER: ");
		otherVolvo.setName("Volvo Extreme");
		System.out.println(volvo);
		System.out.println(otherVolvo);

		// Object Copy

		// Shadow Clone
		System.out.println("BEFORE:");
		System.out.println(volvo);
		System.out.println(cloneVolvo);

		System.out.println("AFTER: ");
		cloneVolvo.setName("Volvo Extreme Max");
		System.out.println(volvo);
		System.out.println(cloneVolvo);

		// Deep Clone
		Address address = new Address("Ho Chi Minh City");
		Vehicle vehicle = new Vehicle("Vehicle", 200, address);
		Vehicle otherVehicle = null;
		try {
			otherVehicle = (Vehicle) vehicle.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("BEFORE");
		System.out.println(vehicle);
		System.out.println(otherVehicle);
		
		System.out.println("AFTER");
		otherVehicle.setAddress(new Address("Ha Noi"));
		System.out.println(vehicle);
		System.out.println(otherVehicle);
	}
}
