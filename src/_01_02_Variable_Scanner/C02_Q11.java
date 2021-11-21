package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q11 {

	public static void main(String[] args) {
	    /*  TechProEd spor salonu için kullanýcýdan isim soyisim, yaþ, kilo, boy, salona devam edeceði ay süresini
        bilgilerini alýp aylýk $20 olarak toplam ücretini yazdýrýnýz.        */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen kullanici bilgilerinizi giriniz...");
        System.out.print("Isminiz : ");
        String fname = scan.nextLine();
        
        System.out.print("Soyisminiz : ");
        String sname = scan.nextLine();
        
        System.out.print("Boyunuz : ");
        int boy = scan.nextInt();
        
        System.out.print("Yasiniz : ");
        int yas = scan.nextInt();
        
        System.out.print("Kilonuz : ");
        int kilo = scan.nextInt();
        
        System.out.print("Devam edeceðiniz süre (ay) : ");
        int ay = scan.nextInt();
        
        int ucret = ay * 20;
        
        System.out.println("Kullanici bilgileri : " + "\n" + "Isminiz : " + fname + "\n" + "Soyisminiz : " + sname + "\n" + "Boyunuz : " + boy + "\n" + "Yasiniz : " + yas + "\n" + "Kilonuz : " + kilo + "\n" + ay + " ay devam edecek olan aboneliginizin toplam ucreti " + ucret + "$ tutar.");
        
        
        scan.close();

	}

}
