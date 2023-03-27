package zd2;

public class Zd2_2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		float x = 13.078f;
		float y = -3.1304f;
		
		int zbroj = a+b;
		int razlika = a-b;
		int umnozak = a*b;
		int kolicnik = a/b;
		int ostatak = a%b;
		
		float korijenX = (float)Math.sqrt(x);
		float korijenY = (float)Math.sqrt(y);
		float absX = Math.abs(x);
		float absY = Math.abs(y);
		
		System.out.println("Zbroj iznosi "+ zbroj);
		System.out.println("Razlika iznosi "+ razlika);
		System.out.println("Umnozak iznosi "+ umnozak);
		System.out.println("Kolicnik iznosi "+ kolicnik);
		System.out.println("Ostatak iznosi "+ ostatak);
		System.out.println("Korijen od x iznosi "+ korijenX);
		System.out.println("Korijen od y iznosi "+ korijenY);
		System.out.println("Apsolutna vrijednost od x iznosi "+ absX);
		System.out.println("Apsolutna vrijednost od y iznosi "+ absY);
		

	}

}
