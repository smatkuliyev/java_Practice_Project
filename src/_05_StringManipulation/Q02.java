package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        // ad ayri soyad ayri sekilde ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("bir bosluk birakarak isim soyisim giriniz : ");
        String str = scan.nextLine();
        String isim = str.substring(0, str.indexOf(" "));
        String soyisim = str.substring(str.indexOf(" ") + 1);

        System.out.println(isim + "\n" + soyisim);

        scan.close();
    }
}
