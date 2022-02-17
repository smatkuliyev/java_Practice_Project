package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q12 {

    public static void main(String[] args) {
        /*  Problem Tan�m�
        Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n� alarak, i�in bitme s�resini
        hesaplayan kodu yaz�n�z.
        �rne�in, Bir i��i bir i�i 10 g�nde yapabilmektedir.
        Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?
        �rnek Ekran ��kt�s�
        Bir i��i i�i ka� g�nde bitirmektedir? 10
        Toplam ka� i��i �al��acak? 2
        ��in bitme s�resi 5 g�nd�r.                                   */

        Scanner scan = new Scanner(System.in);

        System.out.print("Is adamsaat suresini giriniz : ");
        double adamsaat = scan.nextDouble();

        System.out.print("Isci sayisini giriniz : ");
        int isci = scan.nextInt();

        System.out.println("Isin bitme suresi " + (adamsaat / isci) + " saatttir");


        scan.close();

    }

}
