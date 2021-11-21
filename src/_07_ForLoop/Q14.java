package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanimi
        Girilen bir sayi kadar satir ve sutunu olan ve
        sag kenara dayali ucgeni basan kodu yaziniz.

        Ekran ciktisi
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) { 
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    seklini yazdiriniz
             */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz : ");
        int sayi = scan.nextInt();
    	
    	for (int i = 1; i <= sayi; i++) {
			
    		for (int j = sayi-i ; j >= 0; j--) {
				System.out.print(" ");
			}
    		
    		for (int k = 1; k <= i; k++) {
    			System.out.print("*");
			}
    		System.out.println();
		}
        
    	System.out.println();
    	
    	for (int m = 1; m <= sayi; m++) {
			
    		for (int n = 1; n <= m; n++) {
				System.out.print("*");
			}
    		System.out.println();
		}
    	
    	
        scan.close();
    }
}
