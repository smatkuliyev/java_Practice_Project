package kutuphaneOtomasyon;

import java.util.*;

public class Main {

    static KitapIslemleri kitapislemleri = new KitapIslemleri();

    public static void main(String[] args) {
       acilisMenu();
    }

    @SuppressWarnings("resource")
	public static void acilisMenu(){
        Scanner input = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kutuphaneye Hosgeldiniz");
        System.out.println("Yapmak istediginiz islemi seciniz.");
        System.out.println("1-Kitap Ekle");
        System.out.println("2-Kitap Sil");
        System.out.println("3-Kitap Bul");
        System.out.println("4-Tum Kitaplari Goster");
        System.out.println("5-cikis yap");
        int tercih = scan.nextInt();

        switch (tercih){
            case 1:
                //kitap ekle
                System.out.print("Kitap ismini giriniz ");
                String kitapAdi=input.nextLine();
                System.out.print("Kitap ISBN no giriniz ");
                String kitapIsbn = input.nextLine();
                System.out.print("Kitap aciklamasini giriniz ");
                String kitapAciklama =input.nextLine();
                //yazar bilgileri
                System.out.print("Yazar ismini giriniz ");
                String yazarAdi=input.nextLine();
                System.out.print("Yazar yasini giriniz ");
                int yas =input.nextInt();
                input.nextLine();
                System.out.print("Yazar memleketini giriniz ");
                String yazarMemleketi = input.nextLine();
                // yazarin bilgileri
                Yazar yazar = new Yazar(yazarAdi,yas,yazarMemleketi);
                //yayinevi bilgileri
                System.out.print("Yayinevi ismini giriniz ");
                String yayineviAdi=input.nextLine();
                System.out.print("Yayinevi adresini giriniz ");
                String yayineviAdresi=input.nextLine();

                /*String kitapBilgileri = kitapAdi+"-l-"+kitapIsbn+"-l-"+kitapAciklama+"-l-"+yazarAdi+"-l-"+yas+"-l-"+yazarMemleketi+"-l-"+yayineviAdi+"-l-"+yayineviAdresi;
                String ktp[]= kitapBilgileri.split("-l-");
                Map<String,List> kitapMap= new LinkedHashMap<>();
                for (Map.Entry<String, List> entry : kitapMap.entrySet()) {
                    String key = kitapIsbn;
                    List val = List.of(ktp);

                }

                kitapMap.put(kitapIsbn, Collections.singletonList(ktp));
                for (Map.Entry<String, List> entry : kitapMap.entrySet()) {
                    String key = kitapIsbn;
                    List val = List.of(ktp);

                    System.out.println(val);

                }
                System.out.println(kitapMap.containsKey("123"));
				*/
                Yayinevi yayinevi = new Yayinevi(yayineviAdi,yayineviAdresi);
                Kitap kitap = new Kitap(kitapAdi,kitapIsbn,kitapAciklama,yazar,yayinevi);
                kitapislemleri.kitapEkle(kitap);
                kitapislemleri.tumKitaplariGoster();
                acilisMenu();
                break;
            case 2:
                System.out.println("Silmek istediginiz kitapin ISBN numaranisi giriniz ");
                String isbnNo = input.nextLine();
                kitapislemleri.kitapSil(isbnNo);
                acilisMenu();
                break;
            case 3:
                System.out.println("Aradiginiz kitabin ismini yaziniz");
                String arananKitap = input.nextLine();
                kitapislemleri.kitapBul(arananKitap);
                acilisMenu();
                break;
            case 4:
                System.out.println("=============Tum Kitaplar=============");
                kitapislemleri.tumKitaplariGoster();
                acilisMenu();
                break;
            case 5:
                System.out.println("Bol okumalar.");
                System.exit(0);
                break;
            default:
                System.out.println("Hatali seçim.");
                acilisMenu();
                break;
        }
    }
}
