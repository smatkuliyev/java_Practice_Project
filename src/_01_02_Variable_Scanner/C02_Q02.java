package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen 3 basamaklý sayi giriniz : ");
		
		int num1 = scan.nextInt();
		
		int birler = num1 % 10;
		int onlar = (num1 / 10) % 10;
		int yuzler = (num1 / 100);
		
		System.out.println("Girdiginiz sayinin birler basamagi : " + birler + "\n" + "Girdiginiz sayinin onlar basamagi : " + onlar + "\n" + "Girdiginiz sayinin yuzler basamagi : " + yuzler);
		
		scan.close();
		
	}

}
