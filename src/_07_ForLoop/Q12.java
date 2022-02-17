package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullanicidan 1'den buyuk bir tam sayi girmesini isteyin
         ve 1'den girilen tam sayiya kadar olan sayilarin karelerinin toplamini
         hesaplayan kodu yaziniz.

         Ornek Ekran Ciktisi
        Girilen sayi=4
        Kareler toplami=30
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("1'den buyuk bir tam sayi giriniz : ");
        int sayi = scan.nextInt();
        int kareTopla = 0;

        for (int i = 1; i <= sayi; i++) {
            kareTopla += (i * i);
        }

        System.out.println(sayi + " sayisindan 1'e kadar olan sayilarin karelerinin toplami : " + kareTopla);

        scan.close();
    }
}
