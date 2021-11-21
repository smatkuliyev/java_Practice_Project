package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz : ");
		int sayi = scan.nextInt();
		
	//	System.out.println("Mutlak deðeri : " + Math.abs(sayi));
		
		if (sayi >= 0) {
			System.out.println("Mutlak deðeri : " + sayi);
		} else {
			System.out.println("Mutlak deðeri : " + (-1)*sayi);
		}
	
		scan.close();
		
	}

}
