package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Bir string giriniz : ");
    	String girilen = scan.nextLine();
    	
    	boolean kk = kontrol(girilen);
    	
    	System.out.println(kk);
    	
    	scan.close();
    }

	private static boolean kontrol(String girilen) {
		boolean ktrl = false;
		if (girilen.contains("xyz")) {
			ktrl = true;
		} 
		
		return ktrl;	
	}
}
