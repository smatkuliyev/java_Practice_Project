package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz, 3 kelimeden olusan ismi
        // orn. Ahmet Emin Yilmaz -> A.E.Y.  formatiyla yazdiriniz.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("3 kelimeden olusan bir isim giriniz : ");
    	String adSoyad = scan.nextLine();
    	adSoyad = adSoyad.toUpperCase();
    	
    	char ilkHarf = adSoyad.charAt(0);
    	char ikiHarf = adSoyad.charAt(adSoyad.indexOf(" ") + 1);
    	char ucHarf = adSoyad.charAt(adSoyad.lastIndexOf(" ") + 1);
    	
    	System.out.println("Isminizin bas harfleri : " + ilkHarf + "." + ikiHarf + "." + ucHarf + ".");
    	
    	scan.close();
    }       
}
