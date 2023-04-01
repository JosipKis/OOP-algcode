package lab1;

import lab1.CLS_FUND;

public class Test {
	
	
	public static void main(String[] args) {
        // kreirajte jedna objekt s korisničkim imenom Ivana
		CLS_FUND ime1 = new CLS_FUND("Ivana", 100);
        // kreirajte drugi objekt isto s korisničkim imenom Ivana
		CLS_FUND ime2 = new CLS_FUND("Ivana", 101);
        // kreirajte novu referencu clsFund3 koja pokazuje na isti objekt kao prva referenca
        CLS_FUND cls_fund3 = ime1;
        // ispis prvog objekta
        System.out.println(ime1);
        // ispis drugog objekta
        System.out.println(ime2);
        
        // pozovite metodu na nivou klase da pokaže vrijednost zajedničkog atributa
        CLS_FUND.clsData();
        // postavite novo ime prvom objektu na "Ivana-2"
        ime1.setUserName("Ivana-2");
        // ispis tog objekta
        System.out.println(ime1);
        // testirajte jesu li objekti 1 i 2 jednaki
        System.out.println("Object are equal or not: " +  CLS_FUND.checkEquality(ime1, ime2)                                         );
        // testirajte jesu li objekti na koji pokazuju treća i prva referenca jednaki
        System.out.println("Object are equal or not: " +    ime1.equals(cls_fund3)                                      );
		
	}

}
