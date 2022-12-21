package gpcoder.java.oop.innerclass;

public class StaticNestedClassIST {
	static class Helper {
		public void whoAmI() {
			System.out.println("seInternXuanHoa");
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClassIST.Helper helper = new StaticNestedClassIST.Helper();
		helper.whoAmI();
	}
}
