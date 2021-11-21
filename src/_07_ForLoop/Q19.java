package _07_ForLoop;

public class Q19 {
    /*
     Yildizlar (*) ile piramit olusturabileceginiz bir kod yaziniz.
            Sonuc boyle olmalidir;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
               
               
               seklini konsola yazdiriniz.
     */

    public static void main(String[] args) {
    	
    	for (int satir = 0; satir < 6; satir++) {
    		
    		for (int bosluk = 6-satir; bosluk > 1; bosluk--) {
				System.out.print(" ");
			}
    		
    		for (int yildiz = 1; yildiz <= satir; yildiz++) {
				System.out.print("* ");
			}
    		
			
    		System.out.println();
		}
    	
    	
    }
}

