package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanicidan aldiginiz koordinat noktasinin hangi bolgede oldugunu yazdiran bir kod yaziniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("x\ny\nLutfen koordinatlari giriniz (-100 ile 100 arasinda) :");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if ((x<=100 && x>=-100) && (y<=100 && y>=-100)) {
			
			if ((x<=100 && x>0) && (y<=100 && y>0)) {
				System.out.println("1. bolgedesiniz");
			} else if ((x<0 && x>=-100) && (y<=100 && y>0)) {
				System.out.println("2. bolgedesiniz");
			} else if ((x<0 && x>=-100) && (y<0 && y>=-100)) {
				System.out.println("3. bolgedesiniz");
			} else if ((x<=100 && x>0) && (y<0 && y>=-100)) {
				System.out.println("4. bolgedesiniz");
			} else {
				System.out.println("Hic bir bolgede degilsiniz, cizgidesiniz");
			}
			
		} else {
			System.out.println("Yanlis koordinat girdiniz, tekrar deneyiniz");
		}
		
		
		
		scan.close();
    }
}
