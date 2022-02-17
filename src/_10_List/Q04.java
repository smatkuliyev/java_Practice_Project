package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu aliniz, ve
        // ortalamayi gecen ogrenci sayisini bulunuz.


        Scanner scan = new Scanner(System.in);

        List<Integer> listNotlar = new ArrayList<>();
        String devamke = "";

        do {
            System.out.print("Not giriniz : ");
            int ogrenciNotu = scan.nextInt();
            listNotlar.add(ogrenciNotu);
            System.out.println("Devam mi : E/H");
            devamke = scan.next();

        } while (devamke.equalsIgnoreCase("E"));

        int toplam = 0;
        for (int i = 0; i < listNotlar.size(); i++) {

            toplam += listNotlar.get(i);

        }

        double ortalama = toplam / listNotlar.size();

        int ortalamayiGecenSayisi = 0;

        for (int i = 0; i < listNotlar.size(); i++) {
            if (listNotlar.get(i) > ortalama) {
                ortalamayiGecenSayisi++;
            }
        }
        System.out.println("Ortalama : " + ortalama);
        System.out.println("Ortalamayi gecen ogrenci sayisi : " + ortalamayiGecenSayisi);
        scan.close();
    }
}
