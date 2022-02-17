package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q06 {

    public static void main(String[] args) {
    /*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.                 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz : ");
        double mesafe = scan.nextInt();

        System.out.print("Hizi giriniz : ");
        int hiz = scan.nextInt();

        double sure = mesafe / hiz;

        System.out.println("Sure " + sure + " saattir.");

        scan.close();

    }

}
