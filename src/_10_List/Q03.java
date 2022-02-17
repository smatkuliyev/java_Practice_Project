package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin
   toplamini bulunuz. Sonucu ekrana yazdiriniz.
    */
        List<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Listeye atamak icin sayi giriniz : ");
        System.out.println("Yeterli sayiya ulastiginizda 'q' giriniz ");

        int toplam = 0;
        String islem = "";

        while (!islem.equalsIgnoreCase("q")) {
            System.out.print("Sayi giriniz : ");
            islem = scan.next();

            if (islem.equalsIgnoreCase("q")) {
                break;
            }

            list.add(islem);
        }

        for (String each : list) {
            int a = Integer.parseInt(each);
            toplam += a * a;
        }
        System.out.println("girilen sayilarin karelerin toplami : " + toplam);
        scan.close();
    }
}
