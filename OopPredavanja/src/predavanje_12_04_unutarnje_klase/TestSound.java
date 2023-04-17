package predavanje_12_04_unutarnje_klase;

public class TestSound {

	public static void main(String[] args) {

		SimpleInterface sound = new SimpleInterface() {
			// anonimna klasa
			@Override
			public void produceSomeSound() {

				System.out.println("The sound is produced...");
			}
		};
		sound.produceSomeSound();
	}

}
