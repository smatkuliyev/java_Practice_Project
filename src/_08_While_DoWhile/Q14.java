package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		  /*  Problem Tanýmý
        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.
        Örnek Ekran Çýktýlarý
        Bir sayi giriniz: 6
        Faktöriyeli: 720
        Bir sayý giriniz: 3
        Faktöriyeli 6
     */
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scan.nextInt();
		
		int factorial = 1;
		System.out.print(sayi + " sayisini faktoriyali : " + sayi);
		
		while (sayi>1) {
			factorial*=sayi;
			sayi--;
			System.out.print("*" + sayi);
		}
		System.out.print(" = " +factorial);
		
	}

}
