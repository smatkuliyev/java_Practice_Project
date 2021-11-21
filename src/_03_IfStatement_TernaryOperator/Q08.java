package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Kac adet aldiniz? : ");
		int ad = scan.nextInt();
		
		System.out.print("liste fiyatini giriniz? : ");
		double fiyat = scan.nextDouble();
		
		System.out.print("\nMusteri kartiniz var mi? : \nEvet için 1 i , \nHayir için 0 i \ntuslayiniz : ");
		int mKart = scan.nextInt();
		
		if (mKart == 1) {
			
			if (ad >= 10) {
				System.out.println("Toplam tutarınız " + (ad*fiyat) + "$. Yuzde 20 iskonta uygulandıktan sonra ise : " + (ad*fiyat*80/100) + "$ dir.");
			} else {
				System.out.println("Toplam tutarınız " + (ad*fiyat) + "$. Yuzde 15 iskonta uygulandıktan sonra ise : " + (ad*fiyat*85/100) + "$ dir.");
			}
			
		} else {
			
			if (ad >= 10) {
				System.out.println("Toplam tutarınız " + (ad*fiyat) + "$. Yuzde 15 iskonta uygulandıktan sonra ise : " + (ad*fiyat*85/100) + "$ dir.");
			} else {
				System.out.println("Toplam tutarınız " + (ad*fiyat) + "$. Yuzde 10 iskonta uygulandıktan sonra ise : " + (ad*fiyat*90/100) + "$ dir.");
			}
		}
		
		scan.close();
		
	}

}
