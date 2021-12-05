package _10_List;

import java.util.Scanner;

public class QTasKagitMakas {

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        // kagit >tas
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int kullanici_puani = 0;
    	int bilgisayar_puani = 0;
    	String cevap = "EVET";
    	int secim = 0;
    	int count = 1;
    	
    	while (cevap.equalsIgnoreCase("EVET")) {
			
    		if (count == 1) {
    			 System.out.println("1-Tas 2-Kagit 3-Makas");
			}
    		
    		System.out.println("Seciniz : ");
    		count = 0;
    		secim = scan.nextInt();
    		int bilgisayar_secimi = (int) (Math.random()*3);
    		
    		if (secim == 1) {
    			
        		if (bilgisayar_secimi == 1) {
        			System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Berabere");
        			System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
        			
    			} else if(bilgisayar_secimi == 2) {
    				System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kaybettiniz");
                    bilgisayar_puani++;
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
                    
    			} else {
    				System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kazandiniz");
                    kullanici_puani++;
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
    			}
				
        		
			} else if (secim == 2){
				
				if (bilgisayar_secimi == 1) {
        			System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kazandiniz");
        			kullanici_puani++;
        			System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
        			
    			} else if(bilgisayar_secimi == 2) {
    				System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Berabere");
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
                    
    			} else {
    				System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kaybettiniz");
    				bilgisayar_puani++;
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
    			}
				
			} else if (secim == 3) {
				if (bilgisayar_secimi == 1) {
        			System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kaybettiniz");
        			bilgisayar_puani++;
        			System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
        			
    			} else if(bilgisayar_secimi == 2) {
    				System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kazandiniz");
    				kullanici_puani++;
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
                    
    			} else {
    				System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Berabere");
                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);
    			}
			} else {
				System.out.println("Hatali giris yaptiniz, lutfen tekrar deneyiniz");
                continue;
			}
    		
    		if (kullanici_puani == 3) {
    			 System.out.println("Oyunu " + kullanici_puani + "-" + bilgisayar_puani + " kazandiniz");
    			 
    			 System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");
    			 cevap = scan.next();
    			 
    			 if (cevap.equalsIgnoreCase("Evet")) {
                     kullanici_puani = 0;
                     bilgisayar_puani = 0;
                     count = 1;
                 }
    			 
			} else if(bilgisayar_puani == 3){
				System.out.println("Oyunu " + bilgisayar_puani + "-" + kullanici_puani + " kaybettiniz");
				
				System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");
				cevap = scan.next();
   			 
				
				if (cevap.equalsIgnoreCase("Evet")) {
                    kullanici_puani = 0;
                    bilgisayar_puani = 0;
                    count = 1;
                }
				
			}
    		
		}
    	scan.close();

    }

}
