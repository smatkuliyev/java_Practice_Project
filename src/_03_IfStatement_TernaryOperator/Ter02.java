package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii degeri

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1 karakter giriniz : ");
        char krktr = scan.next().charAt(0);

        String sonuc = (krktr >= 'a' && krktr <= 'z') ? ("Kucuk Harf") :
                ((krktr >= 'A' && krktr <= 'Z') ? ("Buyuk Harf") : ("Harf degil"));

        System.out.println(sonuc);

        scan.close();
    }
}
