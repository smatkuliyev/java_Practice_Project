package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("ATM'ye Hosgeldiniz...");

        String islemler = "1.Islem : Bakiye Ogrenme\n2.Islem : Para Yatirma\n"
                + "3.Islem : Para cekme\n"
                + "4.Islem : cikis";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapmak istediginiz islemi seciniz: ");
        String islem = scanner.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz: " + bakiye);
                break;

            case "2":
                System.out.print("Yatirmak istediginiz tutari girin: ");

                int tutar = scanner.nextInt();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;


            case "3":
                System.out.print("cekmek istediginiz tutari girin: ");
                int tutar2 = scanner.nextInt();


                if (tutar2 <= bakiye) {
                    bakiye -= tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                } else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
                break;

            case "4":
                System.out.println("cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz islem...");
                break;
        }
        scanner.close();

    }
}

