package gpcoder.java.oop.polymorphism;

public class PolymorphismIST {
	public static void main(String[] args) {
		Vehicle volvo = new Volvo("Volvo", 200, "V001");
		volvo.run();
		volvo.run(100);
		
		System.out.println("Version: " + volvo.version);
	}
}
