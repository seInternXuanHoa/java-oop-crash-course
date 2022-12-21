package gpcoder.java.oop.innerclass;

public class MemberInnerClassIST {

	public class Hepler {
		public void whoAmI() {
			System.out.println("seInternXuanHoa");
		}
	}

	public static void main(String[] args) {
		MemberInnerClassIST innerClassIST = new MemberInnerClassIST();
		MemberInnerClassIST.Hepler hepler = innerClassIST.new Hepler();

		hepler.whoAmI();
	}
}
