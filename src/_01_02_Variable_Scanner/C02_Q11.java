package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q11 {

    public static void main(String[] args) {
	    /*  TechProEd spor salonu i�in kullan�c�dan isim soyisim, ya�, kilo, boy, salona devam edece�i ay s�resini
        bilgilerini al�p ayl�k $20 olarak toplam �cretini yazd�r�n�z.        */

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

        System.out.print("Devam edece�iniz s�re (ay) : ");
        int ay = scan.nextInt();

        int ucret = ay * 20;

        System.out.println("Kullanici bilgileri : " + "\n" + "Isminiz : " + fname + "\n" + "Soyisminiz : " + sname + "\n" + "Boyunuz : " + boy + "\n" + "Yasiniz : " + yas + "\n" + "Kilonuz : " + kilo + "\n" + ay + " ay devam edecek olan aboneliginizin toplam ucreti " + ucret + "$ tutar.");


        scan.close();

    }

}
