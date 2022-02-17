package ajanda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Etkinlik {

    String etkinlikAdi;
    String etkinlikTarihi;
    double etkinlikSaati;
    String etkinlikKimIle;
    String etkinlikNotu;

    static List<Etkinlik> etkinlikListesi = new ArrayList<>();

    public Etkinlik() {

    }

    public Etkinlik(String etkAdi, String etkTarihi, double etkSaati, String etkKimIle, String etkNotu) {
        super();
        this.etkinlikAdi = etkAdi;
        this.etkinlikTarihi = etkTarihi;
        this.etkinlikSaati = etkSaati;
        this.etkinlikKimIle = etkKimIle;
        this.etkinlikNotu = etkNotu;
    }

    public void etkinlikMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "â•”â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•—\r\n"
                        + "â•‘  ETKINLIK(RANDEVU) MENUSU  â•‘\r\n"
                        + "â• â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•£\r\n"
                        + "â•‘ 1- Etkinlik Ekle           â•‘\r\n"
                        + "â•‘ 2- Etkinlik Sil            â•‘\r\n"
                        + "â•‘ 3- Etkinlik Duzenle        â•‘\r\n"
                        + "â•‘ 4- Etkinlik Durumu         â•‘\r\n"
                        + "â•‘ 5- Cikis (Ana Menuye Don)  â•‘\r\n"
                        + "â•šâ•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�\r\n"
                        + "Lutfen yapmak istenilen islem numarasini giriniz");

        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                etkinlikEkle();
                break;

            case 2:
                etkinlikSil();
                break;

            case 3:

                etkinlikDuzenlemeMenu();

                break;

            case 4:

                for (int i = 0; i < etkinlikListesi.size(); i++) {

                    System.out.println((i + 1) + ". " + etkinlikListesi.get(i).toString());
                }
                etkinlikMenu();

                break;

            case 5:
                Ajanda.ajandaMenu();
                break;

            default:
                break;
        }

        scan.close();
    }

    private void etkinlikEkle() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < Data.etkinlikler.size(); i++) {
            System.out.println((i + 1) + "- " + Data.etkinlikler.get(i));
        }
        System.out.println("Lutfen bir etkinlik seciniz");
        int secim = scan.nextInt();

        if (secim == 7) {
            System.out.println("yeni etkinlik Adi giriniz");
            Data.etkinlikler.set(secim - 1, scan.nextLine());
            Data.etkinlikler.set(secim - 1, scan.nextLine());
        }

        etkinlikAdi = Data.etkinlikler.get(secim - 1);

        System.out.println("Lutfen etkinlik tarihini giriniz [gg/aa/yyyy]");
        etkinlikTarihi = scan.next();

        System.out.println("Lutfen etkinlik saatini giriniz [ss.dd]");
        etkinlikSaati = scan.nextDouble();

        System.out.println("Lutfen etkinlik Kim ile oldugunu giriniz");
        etkinlikKimIle = scan.nextLine();
        etkinlikKimIle = scan.nextLine();

        System.out.println("Lutfen varsa etkinlik notunu giriniz.");
        etkinlikNotu = scan.nextLine();

        Etkinlik etkinlikobj = new Etkinlik(etkinlikAdi, etkinlikTarihi, etkinlikSaati, etkinlikKimIle, etkinlikNotu);

        etkinlikListesi.add(etkinlikobj);

        System.out.println(new String(new char[70]).replace("\0", "\r\n"));

        System.out.println("************** ETKINLIKLERE BASARI ILE EKLENMISTIR **************");

        for (int i = 0; i < etkinlikListesi.size(); i++) {

            System.out.println((i + 1) + ". " + etkinlikListesi.get(i).toString());
        }

        etkinlikMenu();

        scan.close();
    }

    @SuppressWarnings("resource")
    private void etkinlikSil() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < etkinlikListesi.size(); i++) {

            System.out.println((i + 1) + ". " + etkinlikListesi.get(i).toString());
        }

        System.out.println("Silmek istediginiz etkinligin nosunu giriniz ");
        int secim = scan.nextInt();

        if (secim > etkinlikListesi.size() || secim <= 0) {
            System.out.println("Lutfen Listeden birini secin");
            etkinlikSil();
        } else {
            System.out.println(etkinlikListesi.remove(secim - 1).toString() + "\n" + "Basari ile silinmistir.");
            System.out.println(new String(new char[70]).replace("\0", "\r\n"));    //Ekrani temizleme
            etkinlikMenu();
        }

    }

    public void etkinlikDuzenlemeMenu() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < etkinlikListesi.size(); i++) {

            System.out.println((i + 1) + ". " + etkinlikListesi.get(i).toString());
        }

        System.out.println("Lutfen duzenlemek istediginiz etkinligin nosunu giriniz \nCikis icin Sifir (0) basiniz");

        int secim1 = scan.nextInt();

        if (secim1 == 0) {
            etkinlikMenu();
        }

        if (secim1 > etkinlikListesi.size() || secim1 < 0) {
            System.out.println("Lutfen Listeden birini secin");
            etkinlikDuzenlemeMenu();
        }

        System.out.println(""
                + "â•”â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•—\r\n"
                + "â•‘ ETKINLIK DUZENLEME MENUSU  â•‘\r\n"
                + "â• â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•£\r\n"
                + "â•‘ 1- Etkinlik Adi            â•‘\r\n"
                + "â•‘ 2- Etkinlik Tarihi         â•‘\r\n"
                + "â•‘ 3- Etkinlik Saati          â•‘\r\n"
                + "â•‘ 4- Etkinligin Kim ile      â•‘\r\n"
                + "â•‘ 5- Aciklama Notu           â•‘\r\n"
                + "â•‘ 6- Etkinlik Menusune Git   â•‘\r\n"
                + "â•šâ•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�\r\n"
                + "Lutfen yapmak istenilen islem numarasini giriniz");

        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Yeni etkinligin adini girin");
                etkinlikListesi.get(secim1 - 1).etkinlikAdi = scan.nextLine();
                etkinlikListesi.get(secim1 - 1).etkinlikAdi = scan.nextLine();
                etkinlikDuzenlemeMenu();
                break;

            case 2:
                System.out.println("Yeni etkinligin tarihini girin");
                etkinlikListesi.get(secim1 - 1).etkinlikTarihi = scan.next();
                etkinlikDuzenlemeMenu();

                break;

            case 3:
                System.out.println("Yeni etkinligin saatini girin");
                etkinlikListesi.get(secim1 - 1).etkinlikSaati = scan.nextDouble();

                etkinlikDuzenlemeMenu();

                break;

            case 4:
                System.out.println("Yeni etkinligin Kim ile oldugunu girin");
                etkinlikListesi.get(secim1 - 1).etkinlikKimIle = scan.nextLine();
                etkinlikListesi.get(secim1 - 1).etkinlikKimIle = scan.nextLine();
                etkinlikDuzenlemeMenu();

                break;

            case 5:
                System.out.println("Yeni etkinligin Aciklama notunu girin");
                etkinlikListesi.get(secim1 - 1).etkinlikNotu = scan.nextLine();
                etkinlikListesi.get(secim1 - 1).etkinlikNotu = scan.nextLine();
                etkinlikDuzenlemeMenu();

                break;

            case 6:
                etkinlikMenu();
                break;

            default:
                break;
        }

        scan.close();
    }

    @Override
    public String toString() {
        return "Etkinlik [etkinlikAdi=" + etkinlikAdi + ", etkinlikTarihi=" + etkinlikTarihi + ", etkinlikSaati="
                + etkinlikSaati + ", etkinlikKimIle=" + etkinlikKimIle + ", etkinlikNotu=" + etkinlikNotu + "]";
    }

    public String toString1() {
        return " " + etkinlikTarihi + " " + etkinlikSaati + " " + etkinlikAdi + " etkiligini yapilacaktir.";
    }

}
