package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// --------GÝRÝLEN SAYININ BASAMAKLARINDAKÝ RAKAMLARIN TOPLAMINI BULUNUZ.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scan.nextInt();
		int rakam = 0;
		int rakamlarToplami = 0;
		
		while (sayi > 0) {
			rakam =sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;			
		}
		
		System.out.println("Rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
