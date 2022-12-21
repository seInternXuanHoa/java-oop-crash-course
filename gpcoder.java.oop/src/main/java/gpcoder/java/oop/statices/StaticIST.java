package gpcoder.java.oop.statices;

import static gpcoder.java.oop.statices.*;

public class StaticIST {
	public static final String AUTHOR = "seInternXuanHoa";
	public static final int VERSION;
	static {
		VERSION = 1;
		System.out.println("Static Block!");
	}

	public static void whoAmI() {
		System.out.println(AUTHOR);
	}

	public static void main(String[] args) {
		System.out.println("Author: " + StaticIST.AUTHOR);
		StaticIST.whoAmI();
		StaticIST.Hepler.whoAmI();
	}

	public static class Hepler {
		public static void whoAmI() {
			System.out.println("Helper...");
		}
	}
}
