package zadatak2SaTemperaturama;

import java.util.Arrays;
import java.util.Scanner;

public class Zd2 {

	public static void main(String[] args) {
		System.out.println("Unesite broj izmjerenih temperatura: ");	
		prosjekTemperatura(null);
		/*
		 *  Ne računa veće/manje od prosjeka!
		 */
		
		
	}
	
	public static int unosClanovaNiza(int[] brClanova) {
		Scanner unos = new Scanner(System.in);
		int brojClanova = unos.nextInt();
		return brojClanova;
	}

	public static String[] unosTemperatura(int brojEl) {
		Scanner unos = new Scanner(System.in);
		String[] temperature = new String[brojEl];
		int brojac = 0;
		while (brojac < brojEl) {
			System.out.println("Unesite temperaturu: ");
			String unosTemperature = unos.nextLine();
			temperature[brojac] = unosTemperature;
			
			brojac++;
		}
		return temperature;
		
	}
	
	public static String[] listaSTemperaturama(String[] elListe) {
		String[] lista = unosTemperatura(unosClanovaNiza(null));
		System.out.println(Arrays.toString(lista));
		
		return lista;
	}
	
	public static int prosjekTemperatura(String[] prosjekEl) {
		int br = 0;
		int sumTemp = 0;

		for(String i: listaSTemperaturama(null)) {
			int intTemperature = Integer.parseInt(i);
			sumTemp += intTemperature;
			br++;
		}
		int prosjekTemp = sumTemp / br;
		System.out.println("Prosjek unesenih temperatura je: "+ prosjekTemp);
		
		return prosjekTemp;
	}
	
	
}
