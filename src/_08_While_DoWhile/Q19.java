package _08_While_DoWhile;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		/*
        Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýný ekrana yazdýrýnýz.
         girilen sayý dahil
        */
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scan.nextInt();
		int toplam = 0;
		int basla = 0;
		
		
		do {
			if (basla%2!=0) {
				toplam+=basla;
				System.out.println(basla);
			}
			
			basla++;
		} while (basla<=sayi);
		System.out.println("Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýnýn toplami : " + toplam);
		
		
		
		scan.close();
	}

}
