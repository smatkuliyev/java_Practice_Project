package javaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

    static List<String> urunler = new ArrayList<>(Arrays.asList("00 Domates", "01 Patates", "02 Biber", "03 Sogan", "04 Havu�", "05 Elma",
            "06 Muz", "07 �ilek", "08 Kavun", "09 �z�m", "10 Limon"));
    static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

		/* Basarili Market alis-veris programi.
		 *
		 * 1. Adim: urunler ve fiyatlari iceren listeleri olusturunuz.
		 * 			No 	   urun 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Sogan      	 2.30 TL
					04	 Havuc     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Cilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Uzum      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adim: Kullanicinin urun nosuna gore listeden urun secmesini isteyiniz.
		 * 3. Adim: Kac kg satin almak istedigini sorunuz.
		 * 4. Adim: Alinacak bu urunu sepete ekleyiniz ve Sepeti yazdiriniz.
		 * 5. Başka bir urun alip almak istemedigini sorunuz.
		 * 6. Eger devam etmek istiyorsa yeniden urun secme kismina yonlendiriniz.
		 * 7. Eger bitirmek istiyorsa odemeyi kontrol edip para ustu hesaplayarak  programi bitirinzi.
		 */

        String devam = "";
        double toplamFiyat = 0;

        do {
            urunlistesi();
            System.out.print("sectiginiz urun kodunu giriniz : ");
            int UrunNo = scan.nextInt();
            System.out.print("kac kilo : ");
            double kg = scan.nextDouble();
            sepeteEkle(UrunNo, kg);
            toplamFiyat = sepetTutar();
            System.out.println("devam edamke ise e, degilse h : ");
            devam = scan.next();


        } while (devam.equalsIgnoreCase("e"));

        odeme(toplamFiyat);


    }


    private static double sepetTutar() {
        double septTutar = 0;
        for (int i = 0; i < sepetUrunler.size(); i++) {
            septTutar += sepetFiyatlar.get(i);
        }
        int sepTutar = (int) septTutar;
        return sepTutar;
    }


    private static void odeme(double toplamFiyat) {
        System.out.println("odemeniz gerek mikter : " + toplamFiyat);

        double nakit = 0;


        do {
            System.out.print("Lutfen nakit odemenizi giriniz : ");
            nakit += scan.nextDouble();
            if (nakit < toplamFiyat) {
                System.out.println("eksik odeme yaptiniz, " + (toplamFiyat - nakit) + "daha odeme yapiniz");
            }


        } while (nakit < toplamFiyat);


        double paraUstu = nakit - toplamFiyat;

        if (paraUstu > 0) {
            System.out.println("Para ustu : " + paraUstu);
        }

        System.out.println("Yine bekleriz");

    }


    private static void sepeteEkle(int urunNo, double kg) {
        sepetUrunler.add(urunler.get(urunNo));
        sepetKg.add(kg);
        sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);


    }


    private static void urunlistesi() {

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(" " + i + " \t" + urunler.get(i) + "  \t" + fiyatlar.get(i));
        }


    }
}
