package kutuphaneOtomasyon;

public class Kitap {
    private String kitapAdi;
    private String kitapIsbnNo;
    private String kitapAciklama;
    private Yazar yazar;
    private Yayinevi yayinevi;

    public Kitap(String kitapAdi, String kitapIsbnNo, String kitapAciklama,Yazar yazar,Yayinevi yayinevi) {
        this.kitapAdi = kitapAdi;
        this.kitapIsbnNo = kitapIsbnNo;
        this.kitapAciklama = kitapAciklama;
        this.yazar=yazar;
        this.yayinevi=yayinevi;
    }


    public void kitapBilgileri() {
        System.out.println("Kitap\n" +
                "kitapAdi = " + kitapAdi + '\n' +
                "kitapIsbnNo = " + kitapIsbnNo + '\n' +
                "kitapAciklama = " + kitapAciklama + '\n' +
                "yazar = " + yazar.yazarBilgileri() +
                "yayinevi = " + yayinevi.yayineviBilgileri() +
                '}');
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public Yayinevi getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(Yayinevi yayinevi) {
        this.yayinevi = yayinevi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapIsbnNo() {
        return kitapIsbnNo;
    }

    public void setKitapIsbnNo(String kitapIsbnNo) {
        this.kitapIsbnNo = kitapIsbnNo;
    }

    public String getKitapAciklama() {
        return kitapAciklama;
    }

    public void setKitapAciklama(String kitapAciklama) {
        this.kitapAciklama = kitapAciklama;
    }
}
