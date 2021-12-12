package Emlak1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmlakRunner {

	static String patronId = "1";
	static String patronSifre = "1";

	static String calisanId = "2";
	static String calisanSifre = "2";

	static Scanner scan = new Scanner(System.in);

	static int ListeNo = 99;
	static String evTipi;
	static String il;
	static int odaSayisi;
	static double fiyat;
	static String StokDurumu;

	static ArrayList<Emlak> envanter = new ArrayList<>();
	static ArrayList<Emlak> satilanlar = new ArrayList<>();

	public static void main(String[] args) {

		String sifre = "";
		String id = "";
		boolean girisBasariliMi = true;

		while (girisBasariliMi) {
			System.out.println("SILA EMLAK iyi gunler diler");
			System.out.println("ID : ");
			id = scan.next();
			System.out.println("Sifre :");
			sifre = scan.next();

			if (id.equals(patronId) && sifre.equals(patronSifre)) {
				girisBasariliMi = false;
				patron();
			} else if (id.equals(calisanId) && sifre.equals(calisanSifre)) {
				girisBasariliMi = false;
				calisan();
			} else {
				System.out.println("Giris basarisiz");
			}

		}

	}

	public static void calisan() {
		System.out.println("Gunaydim emekci");
		
		boolean calis = true;
		
		while (calis == true) {
			System.out.println("\n1-Ekle \n2-Listele \n3-Cikis  satisi gor  \nSecenek : ");
			int secenek = scan.nextInt();

			switch (secenek) {
			case 1:
				Emlak emlak1 = new Emlak(++ListeNo, evTipi, il, odaSayisi, fiyat, StokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("======================");
				System.out.println("Envanter :");
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}

				System.out.println("Toplam emlak sayiniz :" + envanter.size());
				break;
			case 3:
				System.out.println("Gule gule");
				calis = false;
				break;

			default:
				System.out.println("Yanlis  giris");
				break;
			}

		}

	}

	public static void patron() {
		System.out.println("Gunaydin patron paralari istifliyon");
		boolean calis = true;
		while (calis == true) {

			System.out.println("\n1-ekle  \n2-Listele  \n3-Sil \n4-Duzenle \n5-Cik \n6-Aylik satisi gor  \nSecenek  :");
			int secenek = scan.nextInt();

			switch (secenek) {
			case 1:

				Emlak emlak1 = new Emlak(++ListeNo, evTipi, il, odaSayisi, fiyat, StokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("======================");
				System.out.println("Envanter :");
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}

				System.out.println("Toplam emlak sayiniz :" + envanter.size());
				break;
			case 3:
				System.out.println("O sattin satin heral mali Liste noyu gir");
				int silenen = scan.nextInt() - 100;
				satilanlar.add(envanter.get(silenen));
				envanter.remove(silenen);

				break;
			case 4:
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Hangi urunu dezenlicen");
				int duzenlenecek = scan.nextInt() - 100;
				if (duzenlenecek < envanter.size()) {
					System.out.println("Neyi duzenlicen \n1-Ev tipi \n2-il \n3-oda sayisi \n4-fiyat \n5-Stokdurumu");
					int neyi = scan.nextInt();
					switch (neyi) {
					case 1:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlenecek).setEvTipi(scan.next ());
						break;

					case 2:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlenecek).setIl(scan.next());
						break;
					case 3:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlenecek).setOdaSayisi(scan.nextInt());
						break;
					case 4:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlenecek).setFiyat(scan.nextDouble());
						break;
					case 5:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlenecek).setStokDurumu(scan.next ());
						break;

					default:
						System.out.println("Yanlis giris");
						break;
					}

				} else {
					System.out.println("O kadar mal yok ki");
				}

				break;
			case 5:
				System.out.println("Gule gule");
				calis = false;
				break;
			case 6:
				
				for (int i = 0; i < satilanlar.size(); i++) {
					
					System.out.println("\nListe no      :"+ satilanlar.get(i).getListeNo() +"\nEv tipi    : "+satilanlar.get(i).getEvTipi()+
							"\nil   :"+ satilanlar.get(i).getIl() 
							+"\n oda sayisi : "+satilanlar.get(i).getOdaSayisi()+ "\nFiyat : "+satilanlar.get(i).getOdaSayisi()+ "\nStok Durumu "
									+ ": "+satilanlar.get(i).StokDurumu);
				}
				
				
				
				break;
				
			default:
				System.out.println("Yanlis giris");
				break;
			}

		}

}

}
