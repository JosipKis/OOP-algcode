package pckg01;

public class User {

	

	private String userName;
	private String describeUser;
	private int id;
	private static int cntID = 10;
		
	public User(String name, String desc) {
		this.userName = name;
		this.describeUser = desc;
		this.id = cntID;
		cntID++;
		
	}
	
	public void instantMsgFromUser(String msg) {
		
		System.out.println("This is a message: ");
		System.out.println(msg);
		
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", describeUser=" + describeUser + ", id=" + id + "]";
	}
	
	
}


