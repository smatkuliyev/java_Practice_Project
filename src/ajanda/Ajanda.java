package ajanda;

import java.util.Scanner;

public class Ajanda {

	public static void main(String[] args) {
		
		ajandaMenu();
	}

	public static void ajandaMenu() {

		if (Rehber.rehberListesi.isEmpty()) {

			for (int i = 0; i < Data.adSoyad.size(); i++) {
				Rehber rehberobjesi = new Rehber(Data.adSoyad.get(i), Data.telefon.get(i), Data.eMail.get(i),
						Data.adres.get(i));
				Rehber.rehberListesi.add(rehberobjesi);
			}
		}
		
		Etkinlik etkMenu = new Etkinlik();
		Rehber rhbMenu = new Rehber();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(
				  "â•”â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•—\r\n"
				+ "â•‘    AJANDA MENUSU      â•‘\r\n"
				+ "â•šâ•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�\r\n"
				+ "â•”â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•—\r\n"
				+ "â•‘ 1- Etkinlik Islemleri â•‘\r\n"
				+ "â• â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•£\r\n"
				+ "â•‘ 2- Rehber Islemleri   â•‘\r\n"
				+ "â• â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•£\r\n"
				+ "â•‘ 3- Randevu Durumu     â•‘\r\n"
				+ "â• â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•£\r\n"
				+ "â•‘ 4- Cikis              â•‘\r\n"
				+ "â•šâ•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�\r\n"
				+ "Lutfen yapmak istenilen islem numarasini giriniz");
		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			
			etkMenu.etkinlikMenu();

			break;

		case 2:
			
			rhbMenu.rehberMenu();
			
			break;
		case 3:
			randevuDurumu();
			//System.out.println("Rendevu Durumu Aktif Degil");
			//ajandaMenu();

			break;
		case 4:
			System.out.println("CIKMAK ISTEDIGINIZE EMINS MISINIZ? [E/H] ");
			char cikis = scan.next().charAt(0);
			if (cikis == 'e' || cikis == 'E') {
				System.out.println(
						  "â•”â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•—\r\n"
						+ "â•‘   C I K I S   Y A P I L M I S T I R    â•‘\r\n"
						+ "â•šâ•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�â•�\r\n");
			} else {

				ajandaMenu();
			}

			break;

		default:
			System.out.println("Lutfen menuden bir secim yapiniz!");
			
			ajandaMenu();
			break;
		}

		scan.close();
	}

	@SuppressWarnings("resource")
	private static void randevuDurumu() {
		Scanner scan = new Scanner(System.in);
		
		Ayarlar.bildirimYaz("GENEL RANDEVU BILGILERI");		
		for (Etkinlik each1 : Etkinlik.etkinlikListesi) {

			for (Rehber each : Rehber.rehberListesi) {

				if (each.kisiAdSoyad.equalsIgnoreCase(each1.etkinlikKimIle)) {
					System.out.println("Randevuuz " + each1.etkinlikKimIle+" ile "+ each1.etkinlikTarihi+" tarihinde "
					+each1.etkinlikSaati+" saat diliminde "+each1.etkinlikAdi+" etkinligi bulunuyor.\n"
							+ each1.etkinlikKimIle+" ile ilgili kisisel bilgiler asagida bulunmaktadir");				
				
					System.out.println(each);
					
				}

			}

		}
		
		System.out.println("AJANDA MENUSUNE DONMEK ICIN 0 (cikis) tusuna basiniz");
		
		int secim=scan.nextInt();
		
		if (secim==0) {
			ajandaMenu();
		}
		randevuDurumu();

	}
	
}