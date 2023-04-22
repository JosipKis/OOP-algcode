package vjezba2;

import java.util.Arrays;

public class Zadatak1Main {
	/*
	 * Sadrži zadatke 1, 2, 3 i 4.
	 */

	public static void main(String[] args) {

		int[] Lista = Zadatak1Aux.rndLista(5, 1, 25);
		System.out.println(Arrays.toString(Lista));
		int[] novaLis = Zadatak1Aux.briseClana(Lista, 2);
		System.out.println("Lista nakon brisanja s zadanog indeksa: ");
		System.out.println(Arrays.toString(novaLis));
		int[] swapLista = Zadatak1Aux.swapClanova(novaLis, 1);
		System.out.println("Lista nakon sto zamjenimo posljendnji i neki određeni član: ");
		System.out.println(Arrays.toString(swapLista));
		int[] copyOfLista = Arrays.copyOf(swapLista, swapLista.length-1);
		System.out.println("Lista nakon korištenja copyOf metode: ");
		System.out.println(Arrays.toString(copyOfLista));
		int[] listaSnovimClanom = Zadatak1Aux.promjenaClana(copyOfLista, 0, 1000);
		System.out.println("Lista nakon sto smo ubacili zeljeni clan na zeljeno mjesto: ");
		System.out.println(Arrays.toString(listaSnovimClanom));
		int[] listaSciljanimUbacivanjem = Zadatak1Aux.ubacivanjeClanaNaZeljenoMjesto(listaSnovimClanom, 1, 69);
		System.out.println("Lista: ");
		System.out.println(Arrays.toString(listaSciljanimUbacivanjem));
	}

}
