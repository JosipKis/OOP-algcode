package pckg01;

public class SuperUser extends User {

	public SuperUser(String name, String desc) {
		super(name, desc);
		
	}

	@Override
	public void instantMsgFromUser(String msg) {
		  super.instantMsgFromUser(msg);
		  System.out.println("Always is SUPER!");
	}
	
	
}
