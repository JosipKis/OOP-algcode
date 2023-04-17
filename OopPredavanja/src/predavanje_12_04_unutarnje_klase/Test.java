package predavanje_12_04_unutarnje_klase;

public class Test {

	public static void main(String[] args) {

		OUTER ot = new OUTER("Simple outer cls...");
		ot.outerInfo();
		OUTER.INNER inr1 = ot.new INNER(); // manje cool konstruktor za obj inner klase; koristi drugi
		inr1.innerInfo();
		OUTER.INNER inr2 = ot.createInnerObj();
		inr2.innerInfo();
		OUTER.InnerOnArrays.addElementToArray(100);
		OUTER.InnerOnArrays.addElementToArray(1000);
	}

}
