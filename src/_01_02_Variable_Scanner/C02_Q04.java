package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q04 {

	public static void main(String[] args) {
		
		/*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen 5 basamakli sayi giriniz : ");
		
		int num1 = scan.nextInt();
		
		int birler = num1 % 10;
		int onlar = (num1 / 10) % 10;
		int binler = (num1 / 1000) % 10;
		int onBinler = num1 / 10000;
		
		System.out.println(birler + onlar + binler + onBinler );
		
		scan.close();

	}

}
