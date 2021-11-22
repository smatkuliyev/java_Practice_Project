package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {
	
	 //Bir top belirli  yükseklikten atýlmaktadýr.
    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulunuz.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Topun birakildigi ilk yuksekligi giriniz : ");
		double yukseklik = scan.nextDouble();
		double toplamYol = 0;
		int yereVurmaSayisi = 0;
		
		do {
			yereVurmaSayisi++;
			toplamYol+=yukseklik;
			yukseklik*=(0.75);
			toplamYol+=yukseklik;
		} while (yukseklik>=1);
		
		System.out.println("Topun yere vurma sayisi : " + yereVurmaSayisi);
		System.out.println("topun gectidi toplam yol : " + toplamYol);
		
		scan.close();
	}

}
