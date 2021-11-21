package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q06 {

	public static void main(String[] args) {
    /*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.                 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mesafeyi giriniz : ");
		double mesafe = scan.nextInt();
		
		System.out.print("Hizi giriniz : ");
		int hiz = scan.nextInt();
		
		double sure = mesafe / hiz ;
		
		System.out.println("Sure " + sure + " saattir.");
		
		scan.close();

	}

}
