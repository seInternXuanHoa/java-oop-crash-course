package gpcoder.java.oop.makerintarface;

public class MakerInterfaceIST {
	public static void delete(Object object) {
		if (object instanceof Deleteable) {
			System.out.println("Delete success!");
		} else {
			System.out.println("Access Denied!");
		}
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Volvo volvo = new Volvo();
		
		delete(vehicle);
		delete(volvo);
	}
}
