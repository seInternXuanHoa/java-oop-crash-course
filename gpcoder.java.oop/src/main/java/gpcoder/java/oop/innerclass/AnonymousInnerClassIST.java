package gpcoder.java.oop.innerclass;

public class AnonymousInnerClassIST {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle() {
			@Override
			void run() {
				System.out.println("Vehicle is running...");
			}
		};
		vehicle.run();
	}
}
