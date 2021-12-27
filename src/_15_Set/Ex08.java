package _15_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Ex08 {
    public static void main(String[] args) {
        // Soru 1 : bir metod olusturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu islemi generateSet() metodunda yapiniz. mainden yazdiriniz.

        HashSet<Integer> hs=generateSet();
        System.out.println("hs = " + hs); //hs = [1, 2, 3, 4, 5, 6, 7, 8]

        // AddElements seklinde bir metodla 1 veya 1 den fazla sayi eklenebilen metodu
        // yaziniz.
        AddElements(hs, 12,14);
        AddElements(hs, 1,2,3,4,5,101,102,103);
        AddElements(hs, 65);

        System.out.println("hs = " + hs);
    }

    // Dizi tipindeki dizi, arraylist, set ler i fonktsiyona gönderdiğinizde
    // fonksiyona kendisi gittiği için yapilan değisiklikler kendisinde yapildiği için
    // bu değiskenleri RETURN etmenize gerek yoktur.
    public static void AddElements(HashSet<Integer> hs, Integer... sayilar)
    {
        //1.Yontem
        hs.addAll(Arrays.asList(sayilar));

        //2.Yontem
        for(int i=0;i< sayilar.length;i++)
            hs.add(sayilar[i]);
    }

    public static HashSet<Integer> generateSet()
    {
        Integer[] dizi={1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        HashSet<Integer> hs=new HashSet<>(Arrays.asList(dizi));
        return hs;
    }
}
