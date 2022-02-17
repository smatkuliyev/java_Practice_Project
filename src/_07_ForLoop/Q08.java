package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String'in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz : ");
        String str = scan.nextLine();

        String ters = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ters += str.charAt(i);
        }

        System.out.println(ters);

        if (str.equals(ters)) {
            System.out.println("Bu string bir palindromedir.");
        } else {
            System.out.println("Bu string bir palindrome degildir.");
        }

        scan.close();
    }

}

