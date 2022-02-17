package _07_ForLoop;

import java.util.Scanner;

public class Q07 {


     /*  Problem Tanimi
            Matrisin boyutunu kullanicidan okuyup.
            Sadece diyagonu (kosegeni) 1 olan ve
            diger elemanlari 0 olan bir kare matrisi ekrana bastirin.

           Ekran ciktisi
            Bir sayi giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("carpim tablosunun boyutunu giriniz : ");
        int boyut = scan.nextInt();

        for (int baba = 1; baba <= boyut; baba++) {
            for (int evlat = 1; evlat <= boyut; evlat++) {
                if (baba == evlat) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }

            }
            System.out.println();
        }


        scan.close();
    }
}
