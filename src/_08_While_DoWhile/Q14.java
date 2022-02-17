package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
		  /*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.
        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6
        Fakt�riyeli: 720
        Bir say� giriniz: 3
        Fakt�riyeli 6
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int factorial = 1;
        System.out.print(sayi + " sayisini faktoriyali : " + sayi);

        while (sayi > 1) {
            factorial *= sayi;
            sayi--;
            System.out.print("*" + sayi);
        }
        System.out.print(" = " + factorial);

        scan.close();
    }

}
