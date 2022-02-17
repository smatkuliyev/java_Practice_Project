package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanicidan bir pozitif tamsayi girmesini isteyin, o pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli" yazdirin.
        // 3 basamakli degilse cift olup olmadigini kontrol edin. cift ise "3 basamakli olmayan cift sayi" yazdirin.
        // cift sayi degilse "3 basamakli olmayan tek sayi yazdirin."

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1 pozitif tamsayi giriniz : ");
        int sayi = scan.nextInt();

        String sonuc = (sayi >= 100 && sayi < 1000) ? ("3 Basamakli") :
                ((sayi % 2 == 0) ? ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi yazdirin"));

        System.out.println(sonuc);

        scan.close();
    }
}