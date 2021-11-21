package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Koln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyati hesabi = Her 20 Km basina 5 euro. orn: (100 km yol. Bilet parasi  (100/20)* 5 =25 euro

		todo IPUCU: toplamTutar, islem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri olusturabilirsiniz. Islemlerde direkt bunlari cagirabilirsiniz.



        todo ILK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM  ---  Koln : 80 KM ---  (20 KM basina 5 euro bilet parasi alinmaktadir..)  yazisi gelsin.

    	1.    Frankfurt veya Koln olarak bir giris yapin. (Girdiginiz sehrin harfleri , girildikten sonra buyuk hale gelsin.

   		todo    Frankfurt girildiyse,
        	orn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdirin.
      Frankfurt km hesabi islemi yapin.

      son olarak konsolda: Frankfurt 15 Euro yazsin.


      todo  case: KOLN ise

      "Rota = Koln" yazdirin.
       km hesabina gore islemi yapiniz.

       son olarak konsolda:  Koln   20 Euro  yazsin.



       2.  Sistem bize "Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kisilik " yazdirin. (1 kisilik secerseniz bir islem yapmaniza gerek kalmaz, bilet ucreti yukarida coktan belirlenmis olur.)

        case:2 ise

        "2 kisilik " yazdirin
        2 kisi icin bilet fiyatini hesaplayin.


        todo  Son olarak yolculugunuzu check edin;

        konsolda orn:   Frankfurt  - 2 Kisilik    yazsin.

        1.Bakiyemi belirtin.
        2.Toplam Tutari belirtin.
        3.double paraUstu olusturun ve hesaplayin.
        4.Double para ustunu yazdirin.


         */
		Scanner scan = new Scanner(System.in);
		System.out.println("Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM  ---  Koln : 80 KM ---  (20 KM basina 5 euro bilet parasi alinmaktadir..) ");
		String rota = scan.next().toUpperCase();
		System.out.println("Rota = " + rota);
		
		System.out.println("Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   ");		
		int kisisayisi = scan.nextInt();
    	
		int FrankfurtKm = 60;
		int KolnKm = 80;
		int KmBirimFiyat = 5;
		
		switch (rota) {
		case "FRANKFURT":			
			switch (kisisayisi) {
			case 1:
				System.out.println("1 kisilik bilet fiyati, Frankfurt " + (FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				
				System.out.println("Bakiyeniz kac : ");
				double bakiye = scan.nextDouble();
				
				if (bakiye >= (FrankfurtKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			case 2:
				System.out.println("2 kisilik bilet fiyati, Frankfurt " + (FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");

				System.out.println("Bakiyeniz kac : ");
				bakiye = scan.nextDouble();
				
				if (bakiye >= (FrankfurtKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			default:
				System.out.println("Gecerli kisi sayisi giriniz !");
				break;
			}
			break;
			
		case "KOLN":
			
			switch (kisisayisi) {
			case 1:
				System.out.println("1 kisilik bilet fiyati, Koln " + (KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");

				System.out.println("Bakiyeniz kac : ");
				double bakiye = scan.nextDouble();
				
				if (bakiye >= (KolnKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			case 2:
				System.out.println("2 kisilik bilet fiyati, Koln " + (KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");

				System.out.println("Bakiyeniz kac : ");
				bakiye = scan.nextDouble();
				
				if (bakiye >= (KolnKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			default:
				System.out.println("Gecerli kisi sayisi giriniz !");
				break;
			}
			break;
		default:
			System.out.println("Gecerli sehir ismi giriniz !");
			break;
		}
		
    	scan.close();
    }
}
