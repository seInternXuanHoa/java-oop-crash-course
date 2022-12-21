package gpcoder.java.oop.innerclass;

public class LocalInnerClassIST {
	void whoAmI() {
		class User {
			void whoAmI() {
				System.out.println("seInternXuanHoa");
			}
		}
		
		User user = new User();
		user.whoAmI();
	}
	
	public static void main(String[] args) {
		LocalInnerClassIST classIST = new LocalInnerClassIST();
		classIST.whoAmI();
	}
}
