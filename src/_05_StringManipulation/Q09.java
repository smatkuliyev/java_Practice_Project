package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz : ");
        String cift = scan.next();


        if (cift.length() % 2 == 0) {
            System.out.println("Girilen kelimenin ilk  yarisi : " + cift.substring(0, cift.length() / 2));
        } else {
            System.out.println("Girilen string cift uzunlukta degildir");
        }
        scan.close();
    }
}
