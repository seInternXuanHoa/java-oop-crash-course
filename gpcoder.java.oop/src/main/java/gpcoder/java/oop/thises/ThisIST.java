package gpcoder.java.oop.thises;

public class ThisIST {
	public static void main(String[] args) {
		Volvo volvo = new Volvo("Volvo", 200, "V001");
		volvo.run(200);
		System.out.println(volvo.toString());
	}
}
