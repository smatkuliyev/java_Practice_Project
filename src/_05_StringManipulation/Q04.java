package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("4 harfli bir kelime giriniz : ");
    	String str = scan.nextLine();
    	
    	char h1 = str.charAt(0);
    	char h2 = str.charAt(1);
    	char h3 = str.charAt(2);
    	char h4 = str.charAt(3);
    	
    	System.out.println("Girilen " +str+ " keliminin tersten yazilisi : " + h4+h3+h2+h1);
    	
    	scan.close();
    }
}
