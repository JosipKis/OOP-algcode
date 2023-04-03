package zd1;

public class Zadatak1 {

	public static void main(String[] args) {

		long sumN = Zd1Aux.calSumFirstNInt(3);
		System.out.println("Sum is: "+ sumN);
		long sumNRec = Zd1Aux.recursiveSumFirstNInt(4);
		System.out.println("Recursive sum: "+ sumNRec);
		long iterNPot = Zd1Aux.iterativePotFirstnInt(2, 5);
		System.out.println("Iterative potential: "+ iterNPot);
		long recursivePot = Zd1Aux.iterativePotFirstnInt(2, 5);
		System.out.println("Recursive potential: "+ recursivePot);
		long faktroijelaN = Zd1Aux.faktorijela(1, 3);
		System.out.println("Faktorijela broja n je: "+ faktroijelaN);
		long recursiveFakt = Zd1Aux.recursiveFaktorijel(3);
		System.out.println("Faktroijel rekurizijom= "+ recursiveFakt);
	}

}

// riješiti kući slučaj s negativnim potencijama!
