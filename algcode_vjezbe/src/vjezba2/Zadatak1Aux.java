package vjezba2;

import java.util.concurrent.ThreadLocalRandom;

public class Zadatak1Aux {

	/* metoda ta generiranje liste; korisnik određuje veličinu, i minimalnu i maksimalnu
	* granicu za generiranje nasumičnih brojeva
	*/
	public static int[] rndLista(int size, int min, int maks) {
		int[] lista = new int[size];
		for (int c = 0; c < size; c++) {
			lista[c] = ThreadLocalRandom.current().nextInt(min, maks);
		}
		return lista;
	}
	
	/*
	 *  metoda za brisanje odabranog elementa
	 */
	public static int[] briseClana(int[] lista, int idx) {
		int[] novaLista = new int[lista.length-1];
		int br = 0;
		
		for (int c = 0; c < lista.length; c++) {
			if (c == idx) {
//				br++;
				continue;
			}else {
				novaLista[br] = lista[c];
				br++;
				}	
			}
		return novaLista;
	}
	/*
	 * metoda koja zamjenjuje određeni element, s posljednjim članom
	 */
	public static int[] swapClanova(int[] lista, int clan) {
		int temp = 0;
		if (clan == lista.length-1) {
			return lista;
		}else {
			temp = lista[lista.length-1];
			lista[lista.length-1] = lista[clan];
			lista[clan] = temp;
			return lista;
		}
	}
	
	/*
	 * 
	 */
	public static int[] promjenaClana(int[] lista, int clan, int noviClan) {
		int temp;
		if (clan > lista.length-1) {
			return lista;
		}else {
			temp = noviClan;
			lista[clan] = temp;
			return lista;
		}
	}
	
	public static int[] ubacivanjeClanaNaZeljenoMjesto(int[] lista, int clan, int noviClan) {
		int temp;
		int[] boljaLista = new int[lista.length+1];
		if (clan > lista.length) {
			return lista;
		}else {
			for (int c = 0; c < boljaLista.length; c++) {
				if (c == clan) {	
					boljaLista[c] = noviClan;
				}else if(c < clan){
					boljaLista[c] = lista[c];
				}else { 
					boljaLista[c] = lista[c-1];
				}
			}
	}
		return boljaLista;
	}
}
