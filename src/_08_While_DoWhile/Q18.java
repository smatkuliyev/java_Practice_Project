package _08_While_DoWhile;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yaz�n�z.

        Scanner scan = new Scanner(System.in);

        String systemPin = "Javacanlara selam olsun";
        int girisHakki = 3;

        while (true) {
            System.out.print("pin code giriniz : ");
            String userPin = scan.nextLine();
            if (userPin.equals(systemPin)) {
                System.out.println("Gayet basarili");
                break;
            } else {
                System.out.println("Hatali giris yapildi ");
                girisHakki--;
                System.out.println("kalan deneme hakkini : " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi :-(");
                break;
            }

        }

        scan.close();
    }

}
