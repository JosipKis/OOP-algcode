package zd1;

public class Zd1Aux {

	public static long calSumFirstNInt(int numInt) {
		long sum = 0;
		for (int i = 0; i <= numInt; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static long recursiveSumFirstNInt(int n) {
		if (n == 0) {
			return 0;
		}else {
			return n + recursiveSumFirstNInt(n-1);
		}
	}
	
	public static long iterativePotFirstnInt(int n, int m){
		long itPot = 1;
		for (int c = 1; c <= m; c++) {
			itPot *= n;
		}
		return itPot;
	}
	
	public static long recursivePot(int b, int e) {
		if (e == 0) {
			return 1;
		}else {
			return b * recursivePot(b, e-1);
		}
		
	}
	public static long faktorijela(int i, int fakt) {
		long faktN = i;
		for (int c = i; c <= fakt; c++) {
			faktN *= fakt;
		}
		return faktN;
	}
	public static long recursiveFaktorijel(int num) {
		if (num == 0) {
			return 1;
		}else {
			return recursiveFaktorijel(num-1);
		}
	}
}
