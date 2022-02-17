package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
    /*
        Problem Tanimi:
        addDigits isminde bir method olusturun.
        Parametresi int
        Return tipi de int
        Pozitif int degerler ver ve en son sonuc tek basamakli cikana kadar basamaklari birbiriyle topla.
        Tek basamakli ciktiginda, dondurun

        Ornek1:
        Girdi 38
        Çikti: 2
        Aciklama: Islemler soyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamakli oldugundan, bunu dondurun.
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int num = scan.nextInt();

        addDigit(num);
        scan.close();
    }

    private static int addDigit(int num) {

        for (int i = 0; i < num; i++) {
            num = sum(num);

            if (num < 10)
                break;
        }

        return num;
    }

    private static int sum(int num) {
        int toplam = 0;
        int rakam = 0;

        while (num > 0) {

            rakam = num % 10;
            toplam += rakam;
            num /= 10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplami: " + toplam);
        return toplam;
    }

}