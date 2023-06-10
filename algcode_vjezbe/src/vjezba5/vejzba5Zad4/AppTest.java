package vejzba5Zad4;

import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class AppTest {

	private static final int CAPACITY = 8;
	private static LinkedList<Person> overflow = new LinkedList<>();

	public static void main(String[] args) {
		LinkedBlockingQueue<Person> wait = new LinkedBlockingQueue<>(CAPACITY);
		Person p1 = new Person(genPersonName(CAPACITY));
		Person p2 = new Person(genPersonName(CAPACITY));
		Person p3 = new Person(genPersonName(CAPACITY));
		wait = add2Queue(p1, wait);
		wait = add2Queue(p2, wait);
		wait = add2Queue(p3, wait);
		status(wait);
		processing(wait);
		Person p4 = new Person(genPersonName(CAPACITY));
		Person p5 = new Person(genPersonName(CAPACITY));
		Person p6 = new Person(genPersonName(CAPACITY));
		Person p7 = new Person(genPersonName(CAPACITY));
		Person p8 = new Person(genPersonName(CAPACITY));
		wait = add2Queue(p4, wait);
		wait = add2Queue(p5, wait);
		wait = add2Queue(p6, wait);
		wait = add2Queue(p7, wait);
		wait = add2Queue(p8, wait);
		status(wait);
		processing(wait);
		Person p9 = new Person(genPersonName(CAPACITY));
		Person p10 = new Person(genPersonName(CAPACITY));
		Person p11 = new Person(genPersonName(CAPACITY));
		Person p12 = new Person(genPersonName(CAPACITY));
		wait = add2Queue(p9, wait);
		wait = add2Queue(p10, wait);
		wait = add2Queue(p11, wait);
		wait = add2Queue(p12, wait);
		status(wait);
		overflowStatus();

	}

	private static String genPersonName(int lngth) {
		byte[] ar = new byte[lngth];
		Random rnd = new Random();
		rnd.nextBytes(ar);
		String genName = new String(ar, Charset.forName("UTF-8"));
		return genName;
	}
	private static void status(LinkedBlockingQueue<Person> wts) {

		for(Person prs : wts) {
			System.out.println("In the queue -> " + prs.getId());
		}
		System.out.println("Status -> empty " + wts.remainingCapacity());
	}

	private static void processing(LinkedBlockingQueue<Person> wts) {
		try {
			Person prs = wts.take();
			System.out.println("Processing -> " + prs.getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static LinkedBlockingQueue<Person> add2Queue(Person prs, LinkedBlockingQueue<Person> wts) {

		if(wts.remainingCapacity() > 0) {

			if(!overflow.isEmpty()) {
				// first add from the overflow
				wts.add(overflow.getFirst());
			}else {
				wts.add(prs);
			}

		} else {
			overflow.add(prs);
		}

		return wts;

	}

	private static void overflowStatus() {
		for(Person prs: overflow) {
			System.out.println("Person out from the queue -> " + prs.getId());
		}
	}		
}