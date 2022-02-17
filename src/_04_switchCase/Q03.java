package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        // Girilen bir ay numarasina gore , ayin kac gun oldugunu sayi ile yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ay numarasini giriniz : ");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu ay 31 gun");
                break;
            case 2:
                System.out.println("Bu ay 28 gun");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ay 30 gun");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz !!!");
                break;
        }

        scan.close();
    }
}

