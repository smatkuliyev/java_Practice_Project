package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    //Bir top belirli  y�kseklikten at�lmaktad�r.
    // At�ld�ktan sonra, at�ld��� y�ksekli�in 3/4 u kadar yerden yukar� do�ru z�plamaktad�r
    // Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde durmaktad�r.
    // Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulunuz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Topun birakildigi ilk yuksekligi giriniz : ");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0;
        int yereVurmaSayisi = 0;

        do {
            yereVurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik *= (0.75);
            toplamYol += yukseklik;
        } while (yukseklik >= 1);

        System.out.println("Topun yere vurma sayisi : " + yereVurmaSayisi);
        System.out.println("topun gectidi toplam yol : " + toplamYol);

        scan.close();
    }

}
