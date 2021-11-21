package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullanýcýya    "Vize sýnav sonucunuzu giriniz :"
        2.vize notu double deðerinde girilecek.

        3. Kullanýcýya  "Vize sýnavý yüzdesini giriniz". ->> double olmalý ->> 0,40 etkiliyor   !!Yüzde kaç etkilediðini Sisteme siz giriyorsunuz.!!

        4.Kullanýcýya    "Final sýnav sonucunuzu giriniz.

        5. final notu double deðerinde olmalý. (örn: 65,5)

        6.Kullanýcýya    "Final sýnavý yüzdesini giriniz"-->> double olmalý ->> 0,60 etkiliyor.

        7. Vize gecme ortalamasýný bulmak için, vize nin yüzde40 ý, finalin yüzde60 ý alýnmalý ve çýkan sonuçlar toplanmalýdýr.

        8. Çýkan sonucu (dersin not ortalamasýný)   double toplam  ' a eþitleyebilirsiniz.

        todo  :  Koþul kýsmý
 			eðer ortalamasý 90(90 dahil) 'dan büyük ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasýnda ise  
 			BA, 70(70 dahil)   ile 80 arasýnda ise 
 			BB, 60(60dahil) ile 70 arasýnda ise 
 			CB, 50(50 dahil) ile 60 arasýnda ise 
 			CC, 40(40 dahil) ile 50 arasýnda ise 
 			DC, 30(30 dahil) ile 40 arasýnda ise 
 			DD, 30 'dan düþük ise FF  gelmeli.
 			
         */
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Vize sýnav sonucunuzu giriniz :");
    	double vizeNotu = scan.nextDouble();
    	
    	System.out.print("Vize sýnavý yüzdesini giriniz :");
    	double vizeYuzdesi = scan.nextDouble();
    	
    	System.out.print("Final sýnav sonucunuzu giriniz :");
    	double finalNotu = scan.nextDouble();
    	
    	System.out.print("Final sýnavý yüzdesini giriniz :");
    	double finalYuzdesi = scan.nextDouble(); 
    	
    	double ortalama = (vizeNotu*vizeYuzdesi/100) + (finalNotu*finalYuzdesi/100); 
    	
    	System.out.println("Ortalamanýz : " + ortalama);
    	
    	if (ortalama>=90) {
			System.out.println("Geçme notunuz : AA");
		} else if(ortalama>=80) {
			System.out.println("Geçme notunuz : BA");
		} else if(ortalama>=70) {
			System.out.println("Geçme notunuz : BB");
		} else if(ortalama>=60) {
			System.out.println("Geçme notunuz : CB");
		} else if(ortalama>=50) {
			System.out.println("Geçme notunuz : CC");
		} else if(ortalama>=40) {
			System.out.println("Geçme notunuz : DC");
		} else if(ortalama>=30) {
			System.out.println("Geçme notunuz : DD");
		} else {
			System.out.println("Geçme notunuz : FF");
		}
    	
    	scan.close();
    }
}
