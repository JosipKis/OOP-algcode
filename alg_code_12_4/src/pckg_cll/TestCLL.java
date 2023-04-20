package pckg_cll;

public class TestCLL {

	public static void main(String[] args) {

		CLL<Integer> clli = new CLL<>();
		System.out.println("Size after init: "+ clli.size());
		clli.addFirst(100);
		System.out.println(clli);
		clli.addLast(1000);
		clli.addLast(-200);
		clli.addLast(250);
		System.out.println("contains -2525: "+ clli.containsElement(-2525));
		System.out.println("contains 250: "+ clli.containsElement(250));
	}

}
