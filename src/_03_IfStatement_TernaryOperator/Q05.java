package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.print("Lutfen kilonuzu kg olarak giriniz :");
        int kilo = scan.nextInt();

        if (yas < 18 || kilo < 50) {
            System.out.println("Kan bagisi yapamaz");
        } else {
            System.out.println("Kan bagisi yapabilir");
        }

        scan.close();
    }

}
