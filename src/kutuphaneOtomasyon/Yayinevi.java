package kutuphaneOtomasyon;

public class Yayinevi {
    private String yayineviAdi;
    private String yayineviAdresi;


    public String yayineviBilgileri() {
        return "Yayinevi\n" +
                "yayineviAdi = " + yayineviAdi + '\n' +
                "yayineviAdresi = " + yayineviAdresi + '\n' +
                '}';
    }

    public Yayinevi(String yayineviAdi, String yayineviAdresi) {
        super();
        this.yayineviAdi = yayineviAdi;
        this.yayineviAdresi = yayineviAdresi;
    }

    public String getYayineviAdi() {
        return yayineviAdi;
    }

    public void setYayineviAdi(String yayineviAdi) {
        this.yayineviAdi = yayineviAdi;
    }

    public String getYayineviAdresi() {
        return yayineviAdresi;
    }

    public void setYayineviAdresi(String yayineviAdresi) {
        this.yayineviAdresi = yayineviAdresi;
    }
}
