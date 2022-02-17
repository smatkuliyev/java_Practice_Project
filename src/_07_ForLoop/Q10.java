package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*Kullanicidan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldugunu,
    degilse sessiz harf oldugunu ekrana yazdirsin. Girdigi deger harf degilse yada
            1 karakterden fazla ise hata mesaji gostersin. (Test girilen harfi buyuk yada kucuklugune duyarlidir.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen cikti:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen cikti:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen cikti:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        String girilenHarf = scan.nextLine();
        String sesliHarfler = "aeiuoAEIOU";
        String sessizHarfler = "bcdfghjklmnprstvyxzwqBCDFGJKLMNPRSTVYZXWQ";


        if (girilenHarf.length() == 1) { //tek harf control

            for (int i = 0; i < sessizHarfler.length(); /* i++ */) {

                if (sesliHarfler.contains(girilenHarf)) {
                    System.out.println("Girilen harf seslidir.");
                    break;

                } else if (sessizHarfler.contains(girilenHarf)) {
                    System.out.println("Girilen harf sessizdir.");
                    break;

                } else {
                    System.out.println("Ozel karakter girdiniz");
                    break;
                }
            }

        } else {
            System.out.println("Fazla karakter girdiniz");
        }

        scan.close();
    }
}

