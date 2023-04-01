package zadatak5;

public class Zd5Main {
	
	static int[]  prihodi = {125855, 284569, 324152, 204563, 452198, 471326, 505169, 498569, 367163, 289568, 115255, 98544};
	static int[] rashodi = {105625, 155748, 198455, 195251, 257654, 322188, 355748, 315782, 389455, 302369, 109854, 85223};
	static int brojac = 1;
	
	public static void main(String[] args) {
		prihodiRashodi();
		prosjekPrihoda();
		
	}

	public static void prihodiRashodi() {
		int razlikaPrihodaRashoda = 0;
		while (brojac < 13) {
			System.out.println(brojac +" mjesec:");
			System.out.print("Razlika iznosi: ");
			System.out.print(prihodi[brojac-1]-rashodi[brojac-1]);
			System.out.print(" kuna.");
			System.out.println("");
			brojac++;
		}
		brojac = 1;
	}
	
	public static void prosjekPrihoda() {
		int temp = 0;
		int prosjek = 0;
		while (brojac < 13) {
			temp += prihodi[brojac-1]-rashodi[brojac-1];
			brojac++;
		}
		brojac++;
		prosjek = temp/12;
		System.out.println ("Prosjecni profit u ovoj godini je "+ prosjek +" kuna.");
	}
}
