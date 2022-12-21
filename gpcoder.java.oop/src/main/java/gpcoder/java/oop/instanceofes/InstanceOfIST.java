package gpcoder.java.oop.instanceofes;

public class InstanceOfIST {
	public static void main(String[] args) {
		Integer iNumber = 20;
		if (iNumber instanceof Integer) {
			System.out.println("iNumber is Integer!");
		} else {
			System.out.println("iNumber is not Integer!");
		}

		Volvo volvo = new Volvo();
		if (volvo instanceof Vehicle) {
			System.out.println("volvo is vehicle!");
		} else {
			System.out.println("volvo is not vehicle!");
		}
		
		Volvo otherVolvo = null;
		if (otherVolvo instanceof Vehicle) {
			System.out.println("otherVolvo is vehicle!");
		} else {
			System.out.println("otherVolvo is not vehicle!");
		}
		
		Volvo newVolvo = (Volvo) new Vehicle();
	}
}
