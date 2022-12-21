package gpcoder.java.oop.interfaces;

public class InterfaceIST {
	public static void main(String[] args) {
		Vehicle volvo = new Volvo();
		Vehicle bwm = new BWM();
	
		volvo.run();
		bwm.run();
	}
}
