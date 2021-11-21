package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 1 harf giriniz : ");
		char harf = scan.next().charAt(0);
		
		if ((harf >='A' && harf <='Z') || (harf >='a' && harf <='z')) {
			
			if (harf >='A' && harf <='Z') {
				System.out.println("Buyuk harf");
			} else {
				System.out.println("Kucuk harf");
			}
			
		} else {
			System.out.println("Hatali giris");
		}
		
		scan.close();

	}

}
