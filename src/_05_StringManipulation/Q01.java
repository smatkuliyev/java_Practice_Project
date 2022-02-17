package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanicidan alacagini bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str = scan.nextLine();

        boolean varMi = str.contains(" ");

        System.out.println("Girilen string'de bosluk var mi ? : " + varMi);


        // Kullanicidan alacagini bir stringin bos olup olmadigini kontrol ediniz.

        System.out.println("Girilen string bos mu ? : " + str.isEmpty());

        scan.close();
    }
}

