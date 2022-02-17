package _07_ForLoop;

import java.util.Scanner;

public class Q11 {
    /*
        Bir sayinin mukemmel olup olmadigini bulan bir method yaziniz.
        Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami, kendisine esitse o sayi mukemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mukemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        boolean check;
        check = mukemmel(sayi);

        if (check) {
            System.out.println("Girilen sayi mukemmel sayidir.");
        } else {
            System.out.println("Girilen sayi mukemmel sayi degildir.");
        }

        scan.close();
    }

    private static boolean mukemmel(int sayi) {
        boolean kk = false;
        //	String bolen = "";
        int bolenToplami = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                //			bolen+=(i+ " ");
                bolenToplami += i;
                //			System.out.println("Bolen : " + i);
            }
            //			System.out.println("Bolen toplami : " + bolenToplami);
        }

        if (sayi == bolenToplami) {
            kk = true;
        }
        return kk;
    }
}
