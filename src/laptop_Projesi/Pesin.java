package laptop_Projesi;

import java.util.Scanner;

public class Pesin {

    private static int indirimliFiyat;

    protected static void pesin(int toplam) {
        //	Indirim obj=new Indirim();

        System.out.println("Toplam tutar " + toplam);
        System.out.println("Indirim orani = " + " %" + Indirim.indirim);
        indirimliFiyat = toplam - (toplam * Indirim.indirim / 100);
        System.out.println("Odenecek Tutar = " + indirimliFiyat);

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {

            System.out.println("Lutfen yapacaginiz odemenin tutarini giriniz");
            int tutar = scan.nextInt();
            if (tutar == indirimliFiyat) {
                System.out.println("Odemeniz basariyla gerceklesti");
                break;
            } else if (tutar > indirimliFiyat) {
                System.out.println("Para ustu : " + (tutar - indirimliFiyat) + " TL" + "\n\tOdemeniz basariyla gerceklesti");
                break;
            } else if (tutar < indirimliFiyat) {
                System.out.println("Odeme yetersiz ");
            }

        }
        scan.close();
    }


}
