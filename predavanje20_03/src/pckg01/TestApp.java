package pckg01;

public class TestApp {

	public static void main(String[] args) {

		User usr = new User("User-01", "Simple user");
		User newUser = new User("User-02", "Again simple user");
		usr.instantMsgFromUser("Simple msg..");
		System.out.println(usr);
		System.out.println(newUser);
		SuperUser sup1 = new SuperUser("Super-01", "Super user...");
		sup1.instantMsgFromUser("Msg from super..");
		System.out.println(sup1);
		
	}

}
