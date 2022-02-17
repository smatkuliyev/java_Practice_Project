package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q08 {

    public static void main(String[] args) {
		
   	/*	Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
    	vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz           */

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz : ");
        double vizeNot = scan.nextInt();

        System.out.print("Final notunuzu giriniz : ");
        double finalNot = scan.nextInt();

        double gecmeNot = (vizeNot * 0.3) + (finalNot * 0.7);

        System.out.println("Dersi gecmek i�in alman�z gereken not ortalaman�z : 60");
        System.out.println("Sizin not ortalaman�z ise : " + gecmeNot);

        if (gecmeNot >= 60) {
            System.out.println("Succesful");
        } else {
            System.out.println("Failed");
        }

        scan.close();

    }

}
