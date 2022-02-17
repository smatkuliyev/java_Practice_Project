package kutuphaneOtomasyon;


import java.util.ArrayList;
import java.util.List;

public class KitapIslemleri {

    static List<Kitap> kitaplar = new ArrayList<>();


    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapSil(String isbnNo) {
        //kitaplar.removeIf(t->t.getKitapIsbnNo().contains(isbnNo));

        //Optional<Kitap> silinecekEleman = kitaplar.stream().filter(t -> t.getKitapIsbnNo().equals(isbnNo)).findFirst();
        //kitaplar.remove(silinecekEleman);
        for (Kitap oAnkiKitap : kitaplar) {
            if (oAnkiKitap.getKitapIsbnNo().equals(isbnNo)) {
                kitaplar.remove(oAnkiKitap);
            }
        }
    }

    public void kitapBul(String kitapAdi) {
        //kitaplar.stream().filter(t->t.getKitapAdi().equals(kitapAdi)).forEach(Kitap::kitapBilgileri);
        for (Kitap oAnkiKitap : kitaplar) {
            if (oAnkiKitap.getKitapAdi().equals(kitapAdi)) {
                System.out.println("==Kitap Bulundu-Kitap Bilgileri==");
                oAnkiKitap.kitapBilgileri();
                break;
            } else {
                System.out.println("Kitap Bulunamadi.");
            }
        }
    }

    public void tumKitaplariGoster() {
        kitaplar.stream().forEach(Kitap::kitapBilgileri);
    }
}
