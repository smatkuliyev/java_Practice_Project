package _07_ForLoop;

import java.util.Scanner;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazdiriniz.  65=A'nin ascii degeri
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tablo boyutunu giriniz : ");
        int boyut = scan.nextInt();
        int harf = 65;

        for (int baba = 0; baba < boyut; baba++) {
            for (int evlat = 0; evlat <= baba; evlat++) {
                System.out.print((char) (harf + evlat) + " ");
            }

            System.out.println();
        }

        scan.close();

    }
}
