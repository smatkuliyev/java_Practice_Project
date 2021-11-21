package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q09 {

	public static void main(String[] args) {
    /*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333        */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ilk sayiyi giriniz : ");
		double sayi1 = scan.nextDouble();
		
		System.out.print("2. sayiyi giriniz : ");
		double sayi2 = scan.nextDouble();
		
		System.out.print("3. sayiyi giriniz : ");
		double sayi3 = scan.nextDouble();
		
		double sonuc = ( Math.pow(sayi1, 2) - Math.pow(sayi2, 2) ) / (sayi3 * 3);
		
		System.out.println("Sonuc : " + sonuc);
		
		
		
		scan.close();
	}

}
