package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        // Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac elemanli array olusturmak istiyorsunuz : ");
        int eleman = scan.nextInt();

        int arr[] = new int[eleman];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index'teki elemani giriniz : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elemanlari : " + Arrays.toString(arr));

        int sayac = 0;
        System.out.print("3'e bolunebilen array elemanlari : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + ", ");
                sayac++;
            }
        }
        System.out.println();
        System.out.println("Array icinde " + sayac + " tane 3'e bolunebilen sayi vardir.");

        scan.close();
    }

}
