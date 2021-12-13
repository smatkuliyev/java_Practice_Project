package okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

		/*
		BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.
		1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
			Kayıtlarda şu bilgiler olabilmelidir.
			Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
			Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
		2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
			Aşağıdaki gibi bir menü gösterilsin.
		====================================
		 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
		====================================
		 1- ÖĞRENCİ İŞLEMLERİ
		 2- ÖĞRETMEN İŞLEMLERİ
		 Q- ÇIKIŞ
		3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
		============= İŞLEMLER =============
			 1-EKLEME
			 2-ARAMA
			 3-LİSTELEME
			 4-SİLME
			 5-ANA MENÜ
			 Q-ÇIKIŞ
		SEÇİMİNİZ:
		4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
		    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
			Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
		*/
		



public class Islemler {
	
	
	List<Kisi> ogrenciList = new ArrayList<>();
	List<Kisi> ogretmenList = new ArrayList<>();
	
	static String kisiTuru;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void anaMenu() {
		System.out.println("====================================\n"
                + "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"
                + "    ====================================\n"
                + "     1- ÖĞRENCİ İŞLEMLERİ\n"
                + "     2- ÖĞRETMEN İŞLEMLERİ\n"
                + "     Q- ÇIKIŞ\n"
                + "");
		
		String secim = scan.next().toUpperCase();
		
		
		switch (secim) {
		case "1":
			kisiTuru="OGRENCI";
			islemMenusu();
			break;
		case "2":
			kisiTuru="OGRETMEN";
			islemMenusu();
			break;
		case "Q":
			cikis();
			break;

		default:
			System.out.println("hatali giris");
			break;
			
			anaMenu();
		}
		
		
	}

	private static void islemMenusu() {
		System.out.println("3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.\r\n"
		        + "============= İŞLEMLER =============\r\n"
		        + "     1-EKLEME\r\n"
		        + "     2-ARAMA\r\n"
		        + "     3-LİSTELEME\r\n"
		        + "     4-SİLME\r\n"
		        + "     Q-ÇIKIŞ");
	}
	
	


}
