package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir isim giriniz : ");
        String isim = scan.nextLine();

        System.out.println("\n ***** if ile *****\n");

        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        if (isim.length() == 3) {
            if (c1 != c2 && c1 != c3 && c3 != c2) {
                System.out.println("Girilen isim 3 harfli ve unique");
            } else {
                System.out.println("Girilen isim 3 harfli ama unique degil");
            }
        } else {
            System.out.println("Girilen isim 3 harfli degildir");
        }

        System.out.println("\n ***** ternary ile *****\n");

        String sonuc = (isim.length() == 3) ? ((c1 != c2 && c1 != c3 && c3 != c2) ? ("Girilen isim 3 harfli ve unique") : ("Girilen isim 3 harfli ama unique degil")) : ("Girilen isim 3 harfli degildir");
        System.out.println(sonuc);
        scan.close();
    }
}