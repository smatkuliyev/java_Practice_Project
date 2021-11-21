package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q01_Scanner {

	public static void main(String[] args) {
		
		/*
	     * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("isminizi yazin : ");
		String isim = scan.nextLine();
		
		System.out.print("soyisminizi yazin : ");
		String soyisim = scan.nextLine() ;
		
		System.out.print("yasinizi yazin : ");
		int yas = scan.nextInt();
		
		System.out.print("boyunuzu yazin : ");
		int boy = scan.nextInt();
		
		System.out.print("kilonuzu yazin : ");
		int kilo = scan.nextInt();
		
		System.out.print("isminiz : " + isim +"\n" 
						+ "soyisminiz : " + soyisim + "\n" 
						+ "yasiniz : " + yas + "\n" 
						+ "boyunuz : " + boy + "\n" 
						+ "kilonuz : " + kilo);
		scan.close();		
	}

}
