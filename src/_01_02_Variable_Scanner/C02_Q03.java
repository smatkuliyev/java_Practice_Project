package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q03 {

    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("Girilen sayilarin toplami : " + (sayi1 + sayi2));
        System.out.println("Girilen sayilarin farki : " + (sayi1 - sayi2));
        System.out.println("Girilen sayilarin carpimi : " + (sayi1 * sayi2));
        System.out.println("Girilen sayilarin b�l�m� : " + (sayi1 / sayi2));

        scan.close();
    }

}
