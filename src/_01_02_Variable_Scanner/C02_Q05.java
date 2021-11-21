package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q05 {

	public static void main(String[] args) {

    /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ucgenin 1. kenar uzunlugunu giriniz : ");
		
		double kenar1 = scan.nextDouble();
		
		System.out.print("ucgenin 1. kenar uzunlugunu giriniz : ");
		
		double kenar2 = scan.nextDouble();
		
		double hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
		
		System.out.println("Ucgrnin hipotenus uzunlugu : " + hipotenus);
		
		scan.close();
				
		
		
	}

}
