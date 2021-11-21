package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A, B, C veya D yazdirin.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arasi - C   
		// 3. 60(dahil) ile 80 arasi - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen notunuzu giriniz : ");
		int not = scan.nextInt();

		if (not > 100 || not < 0) {
			System.out.println("Lutfen gecerli bir not giriniz !!!");
		} else {

			switch (not/10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Harf notunuz : D ");
				break;
			case 5:
				System.out.println("Harf notunuz : C ");
				break;
			case 6:
			case 7:
				System.out.println("Harf notunuz : B ");
				break;
			case 8:
			case 9:
			case 10:
				System.out.println("Harf notunuz : A ");
				break;
				
			default:
				System.out.println("Gecerli not giriniz");
				break;
			}

		}
		
		scan.close();
	}
}
