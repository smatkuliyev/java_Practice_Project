package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q12 {

	public static void main(String[] args) {
        /*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        Örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?
        Örnek Ekran Çýktýsý
        Bir iþçi iþi kaç günde bitirmektedir? 10
        Toplam kaç iþçi çalýþacak? 2
        Ýþin bitme süresi 5 gündür.                                   */
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Is adamsaat suresini giriniz : ");
    double adamsaat = scan.nextDouble();
    
    System.out.print("Isci sayisini giriniz : ");
    int isci = scan.nextInt();
    
    System.out.println("Isin bitme suresi " + (adamsaat / isci) + " saatttir");
    
    
    scan.close();

	}

}
