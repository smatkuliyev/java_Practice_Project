package workerAndCompany;
import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

public class Main {


    static Company company = new Company();
    static Worker worker = new Worker();

    public static void main(String[] args) {


        menuGoster();
       worker.kullaniciKayit();
       company.sirketDondur(worker);
       worker.mailOlustur();
       worker.generateRandomPassword();
       System.out.println("Mail Adresiniz : " + worker.geteMail());
       System.out.println("Gecici Å�ifreniz : " + worker.getSifre());
       worker.objeOlustur();
       worker.mailGiris();
       worker.sifreKontrol();
        worker.yeniSifreOlustur();
     


    }

    static void menuGoster() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Asagidaki seceneklerden birisini seciniz : \n1-Calisan \n2-Patron");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:

                break;
            case 2:
                break;
            default:
                System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz : ");
                menuGoster();
                break;
        }
    }

}

