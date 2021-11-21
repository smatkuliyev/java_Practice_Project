package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("bir kelime giriniz : ");
    	String klm = scan.next();
    	
    	char h1 = klm.charAt(klm.length()-2);
    	char h2 = klm.charAt(klm.length()-1);
    	
    	
    	if (klm.length()>=3) {
			System.out.println(""+h1+h2+h1+h2+h1+h2);
		} else {
			System.out.println(klm);
		}
    	
    	scan.close();
    }
}
