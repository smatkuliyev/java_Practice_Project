package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayisini bulunuz.
        ama  c harfine  gelirse donguden cikilsin

        Bugun hava oldukca guzel.-> 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String giriniz : ");
        String str = scan.nextLine();
        int aMiktar = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                aMiktar++;
            } else if (str.toLowerCase().charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("Girdiginiz string'deki a sayisi : " + aMiktar);
        scan.close();
    }

}
