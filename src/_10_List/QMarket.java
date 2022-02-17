package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QMarket {
    /*
     * Bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program yaziniz.
     * Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir method yaziniz.
     * Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini gosteren bir method yaziniz.
     * Ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir method yaziniz.
     *
     * 1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler)
     * 2. Adim : Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)
     * 3. Adim : While dongusu ile kullanicidan 7 gunluk kazanclari tekek teker alip gunlukKazanclar ArrayList'e ekle.
     * 4. Adim : getOrtalamaKazanc() adli method ile ortalama kazanci alin.
     * 5. Adim : getOrtalamaninUstundeKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan yuksekse o gunleri return yap.
     * 6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan asagiysa o gunleri return yap.
     * */
    static List<String> gunler = new ArrayList<>();
    static List<Double> gunlukKazanclar = new ArrayList<>();


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");


        int gun = 1;

        while (8 > gun) {
            System.out.print(gun + ". gun kazancinizi giriniz : ");
            double gelir = scan.nextDouble();
            gunlukKazanclar.add(gelir);

            gun++;
        }

        double ortalama = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Gunluk ortalama kazanc: " + ortalama);


        getOrtalamaninUstundeKazancGunleri(ortalama);
        System.out.println("Gunluk ortalamadan fazla kalanilan gunler: " + getOrtalamaninUstundeKazancGunleri(ortalama));

        getOrtalamaninAltindaKazancG�nleri(ortalama);
        System.out.println("Gunluk ortalamadan az kalanilan gunler: " + getOrtalamaninAltindaKazancG�nleri(ortalama));

        scan.close();
    }

    private static List<String> getOrtalamaninAltindaKazancG�

    nleri(double ortalama) {

        List<String> ortamaAtliGunler = new ArrayList<>();

        for (int i = 0; i < gunler.size(); i++) {

            if (gunlukKazanclar.get(i) < ortalama) {
                ortamaAtliGunler.add(gunler.get(i));
            }

        }

        return ortamaAtliGunler;

    }

    private static List<String> getOrtalamaninUstundeKazancGunleri(double ortalama) {

        List<String> ortamaUstuGunler = new ArrayList<>();

        for (int i = 0; i < gunler.size(); i++) {

            if (gunlukKazanclar.get(i) > ortalama) {
                ortamaUstuGunler.add(gunler.get(i));
            }

        }

        return ortamaUstuGunler;

    }

    private static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
        double toplam = 0;
        double ortalama = 0;

        for (Double each : gunlukKazanclar) {
            toplam += each;
        }
        ortalama = toplam / 7;

        return ortalama;
    }
}