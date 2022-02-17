package _05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Mailinizi giriniz : ");
        String mail = scan.next();

        if (!mail.contains("@")) {
            System.out.print("gecerli bir email girin");
            //	} else if (mail.endsWith("@gmail.com")) {
        } else if (mail.substring(mail.indexOf('@') + 1).equals("gmail.com")) {
            System.out.print("email onaylandi");
        } else {
            System.out.print("Lutfen gmail hesabinizi girin");
        }

        scan.close();
    }

}
