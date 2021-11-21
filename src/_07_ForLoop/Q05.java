package _07_ForLoop;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
			// Asagidaki sekilde cikti veren programi print icerisinde
			// sadece bir tane # kullanarak yazidiriniz
			
			//            #####
			//            #####
			//            #####
			//            #####
			//            #####
    	
		Scanner scan= new Scanner(System.in);
		System.out.print("Kaca kac sekil istiyorsun: ");
		int sayi = scan.nextInt();
    	
    	
       for (int satir = 1; satir <=sayi; satir++) {
    	   
		for (int sutun = 0; sutun < sayi; sutun++) {
			System.out.print("# ");
		}
		
		System.out.println();
       }
    	scan.close();
    }
}
