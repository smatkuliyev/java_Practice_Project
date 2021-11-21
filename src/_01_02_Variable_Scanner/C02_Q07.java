package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q07 {

	public static void main(String[] args) {
		
	/*	 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		            : Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23	 	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kilonuzu girin : ");
		double kilo = scan.nextDouble();
		
		System.out.print("Boyunuzu girin : ");
		double boy = scan.nextDouble();
		boy /= 100;
		double vki = kilo / Math.pow(boy, 2) ;
		
		System.out.println("Vucut Kitle Indeksiniz : " + vki);
		
		
		
		scan.close();
		
	}

}
