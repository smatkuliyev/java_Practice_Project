package _10_List;

import java.util.Scanner;

public class QAtm_ {

    static String kartNumaram = "123456";
    static String sifrem = "1234";
    static double bakiye;

    public static void main(String[] args) {
		 /*      ATM 
        Kullaniciya giri� i�in kart numarasi ve �ifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda bo�luk ile girerse de eger do�ruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilece�i i�lemleri ekrana yazdirin,
        
        Bakiye sorgula, para yatirma, para �ekme, para g�nderme, sifre de�i�tirme ve cikis.
        
        Para �ekme ve para gonderme i�leminde mevcut bakiyeden buyuk para �ekilemez,
        Para g�nderme i�leminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger de�ilse men� ekranina geri donsun.
        Sifre de�i�tirme i�leminde mevcut �ifreyi teyit ettikten sonra, sifre de�i�iklik i�lemini yapmali,       */

        Scanner scan = new Scanner(System.in);
        System.out.println("~~JAVA BANKA HOSGELDINIZ~~");


        String kart = "";
        String sifre = "";


        do {

            System.out.println("Kart numaranizi giriniz.");

            kart = scan.nextLine();

            System.out.println("Lutfen sifrenizi giriniz.");

            sifre = scan.nextLine();


            if (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram)) {

                System.out.println("Hatali giris yaptiniz");

            }


        } while (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram));


        ekran();

        scan.close();
    }

    private static void ekran() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sifreniz dogrulandi");

        char secim = ' ';

        do {

            System.out.println("Lutfen yapmak istediginiz islemi giriniz\nA->Bakiye sorgulama\nB->Para cekme\nC->Para yatirma\nD->Para gonderme\n"
                    + "E->Sifre degistirme\nF->Cikis");

            secim = scan.next().toUpperCase().charAt(0);


            switch (secim) {

                case 'A':
                    bakiyeSorgula();
                    break;
                case 'B':
                    paraCekme();
                    break;

                case 'C':
                    paraYatirma();
                    break;

                case 'D':
                    paraGonderme();
                    break;

                case 'E':
                    sifreDegistir();
                    break;

                case 'F':
                    System.out.println("Cikis basarili.");
                    break;

                default:
                    System.out.println("Lutfen gecerli islem seciniz.");
                    break;
            }


        } while (secim != 'F');


        scan.close();


    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz->" + bakiye + "tl");
    }

    private static void paraCekme() {
        Scanner scan = new Scanner(System.in);

        double cekilenTutar;

        System.out.println("Cekmek istediginiz tutari giriniz.");

        cekilenTutar = scan.nextDouble();

        if (cekilenTutar <= bakiye) {

            bakiye -= cekilenTutar;
            System.out.println("Islem basarili.\n Mevcut bakiyeniz:" + bakiye);

        } else {
            System.out.println("Bakiye yetersiz");
        }


        scan.close();

    }

    private static void paraYatirma() {

        Scanner scan = new Scanner(System.in);
        double yatirilanTutar;

        System.out.println("Yatirmak istediginiz tutari giriniz.");

        yatirilanTutar = scan.nextDouble();

        bakiye += yatirilanTutar;

        System.out.println("Islem basarili paraniz hesabiniza yatirildi.\nMevcut bakiyeniz:" + bakiye);

        scan.close();
    }

    private static void paraGonderme() {
        Scanner scan = new Scanner(System.in);
        String Iban;
        double gonderilecekTutar;

        System.out.println("Lutfen para gondereceginiz IBAN numarasini giriniz"); // TR    26 karakterli

        Iban = scan.nextLine().toUpperCase(); //tr TR Tr tR = TR

        if (Iban.startsWith("TR") && Iban.replaceAll("\\s", "").length() == 26) {

            System.out.println("Gonderilecek tutari giriniz");

            gonderilecekTutar = scan.nextDouble();

            if (gonderilecekTutar <= bakiye) {

                bakiye -= gonderilecekTutar;
                System.out.println("Paraniz gonderildi\nMevcut bakiyeniz:" + bakiye);


            } else {
                System.out.println("Bakiyeniz yetersiz");
            }


        } else {

            System.out.println("Gecersiz IBAN girdiniz.");

        }

        scan.close();
    }


    private static void sifreDegistir() {
        Scanner scan = new Scanner(System.in);

        String mevcutSifre;

        System.out.println("Mevcut sifrenizi giriniz");

        mevcutSifre = scan.next();


        if (mevcutSifre.equals(sifrem)) {

            System.out.println("Yeni sifreyi giriniz");
            sifrem = scan.next();
            System.out.println("Sifreniz degistirildi.");

        } else {

            System.out.println("Sifreler uyusmuyor");
        }

        scan.close();
    }

}
