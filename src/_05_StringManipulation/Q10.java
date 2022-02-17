package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanicidan aldiginiz  Adi, Soyadi ve kredi karti numaralarini asagidaki gibi ozel forma donusturun
         * Kredi karti numarasini kontrol edin, yoksa 16 haneden kucuk olursa   "Gecersiz kredi karti numarasi" yazdirin.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adin bas harfleri ve soyadi buyuk olmalidir)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Isminizi giriniz : ");
        String isim = scan.next();

        System.out.print("Soyisminizi giriniz : ");
        String soyisim = scan.next();

        System.out.print("Kredi Karti numaranizi giriniz : ");
        String kkNo = scan.next();

        isim = isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w", "*");
        kkNo = kkNo.substring(0, 12).replaceAll("\\d", "*") + kkNo.substring(12);


        if (kkNo.length() == 16) {
            System.out.println("Ad : " + isim + "\nSoyad : " + soyisim + "\nkartNo : " + kkNo);
        } else {
            System.out.println("Gecersiz kredi karti numarasi");
        }

        scan.close();
    }
}
