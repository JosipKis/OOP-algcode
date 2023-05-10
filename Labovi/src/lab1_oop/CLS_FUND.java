package lab1_oop;

public class CLS_FUND {

	private int id;
	private String userName;
	
	public CLS_FUND(String name, int idd) {
		userName = name;
		
		id = idd;
		for (int i = 0; i < 9999999; i++) {
			idd += i;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "[CLS_FUND | userName=" + userName + ", id=" + id + "]";
	}
	
static public void clsData() {
	System.out.println("Cnt id is: 102");
}

static public boolean checkEquality( CLS_FUND ime1,  CLS_FUND ime2) {
	if (ime1 == ime2) {
		return true;
	}else {
		return false;
	}
}

}
