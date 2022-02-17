package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
		 /*  Problem Tan�m�
        Verilen iki say�n�n kombinasyonunu bulan kodu yaz�n�z.
        Hat�rlatma C(n,r) = n! / (r!(n-r)!)
        Ekran ��kt�s�
        Birinci say�y� giriniz: 15
        Ikinci say�y� giriniz: 4
        Kombinasyon: 1365
        Birinci say�y� giriniz: 5
        Ikinci say�y� giriniz: 3
        Kombinasyon: 10
      */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        long sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        long sayi2 = scan.nextInt();

        long sayi3 = sayi1 - sayi2;

        long fac1 = 1;
        do {
            fac1 *= sayi1;
            sayi1--;
        } while (sayi1 > 0);
        System.out.println(fac1);

        long fac2 = 1;
        do {
            fac2 *= sayi2;
            sayi2--;
        } while (sayi2 > 0);
        System.out.println(fac2);

        long fac3 = 1;

        do {
            fac3 *= sayi3;
            sayi3--;
        } while (sayi3 > 0);
        System.out.println(fac3);

        System.out.println("Kombinasyon : " + (fac1 / (fac2 * fac3)));


        scan.close();
    }

}
