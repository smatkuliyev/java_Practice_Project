package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q09 {

    public static void main(String[] args) {
    /*  Problem Tan�m�
        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        �rnek Ekran ��kt�s�
        a say�s�n� giriniz: 5
        b say�s�n� giriniz: 3
        c say�s�n� giriniz: 1
        sonu� : 5.333333333333333        */


        Scanner scan = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        double sayi1 = scan.nextDouble();

        System.out.print("2. sayiyi giriniz : ");
        double sayi2 = scan.nextDouble();

        System.out.print("3. sayiyi giriniz : ");
        double sayi3 = scan.nextDouble();

        double sonuc = (Math.pow(sayi1, 2) - Math.pow(sayi2, 2)) / (sayi3 * 3);

        System.out.println("Sonuc : " + sonuc);


        scan.close();
    }

}
