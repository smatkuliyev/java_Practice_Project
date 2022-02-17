package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugune gore 100 gun sonra hangi gun oldugunuz yazdiriniz.
        // pazartesi haftanin ilk gunu olarak aliniz..

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun hangi gun : ");
        String gunIsmi = scan.next().toUpperCase();

        switch (gunIsmi) {
            case "PAZARTESI":
                System.out.println("CARSAMBA");
                break;
            case "SALI":
                System.out.println("PERSEMBE");
                break;
            case "CARSAMBA":
                System.out.println("CUMA");
                break;
            case "PERSEMBE":
                System.out.println("CUMARTESI");
                break;
            case "CUMA":
                System.out.println("PAZAR");
                break;
            case "CUMARTESI":
                System.out.println("PAZARTESI");
                break;
            case "PAZAR":
                System.out.println("SALI");
                break;

            default:
                System.out.println("Gecerli bir gun ismi giriniz!");
                break;
        }

        scan.close();
    }
}

