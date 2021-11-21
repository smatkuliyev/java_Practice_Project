package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    	// 2- Girilen 3 basamakli bir sayiyi yazi ile yazdiriniz
    	
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 3 basamakli bir sayi giriniz : ");
		int sayi = scan.nextInt();
        
		int birler = (sayi%10);
		int onlar = (sayi/10) % 10;
		int yuzler = (sayi/100);
		
		if (sayi < 1000 && sayi > 99) {
		
			switch (yuzler) {
			case 1:
				System.out.print("Yuz");			
				break;
			case 2:
				System.out.print("Iki yuz");			
				break;
			case 3:
				System.out.print("Uc yuz");			
				break;
			case 4:
				System.out.print("Dort yuz");			
				break;
			case 5:
				System.out.print("Bes yuz");			
				break;
			case 6:
				System.out.print("Alti yuz");			
				break;
			case 7:
				System.out.print("Yedi yuz");			
				break;
			case 8:
				System.out.print("Sekiz yuz");			
				break;
			case 9:
				System.out.print("Dokuz yuz");			
				break;
			default:
				break;
			}
			
			switch (onlar) {
			case 1:
				System.out.print(" on");			
				break;
			case 2:
				System.out.print(" yirmi");			
				break;
			case 3:
				System.out.print(" otuz");			
				break;
			case 4:
				System.out.print(" kirk");			
				break;
			case 5:
				System.out.print(" elli");			
				break;
			case 6:
				System.out.print(" altmis");			
				break;
			case 7:
				System.out.print(" yetmis");			
				break;
			case 8:
				System.out.print(" seksen");			
				break;
			case 9:
				System.out.print(" doksan");			
				break;
			default:
				break;
			}
			
			switch (birler) {
			case 1:
				System.out.print(" bir");			
				break;
			case 2:
				System.out.print(" iki");			
				break;
			case 3:
				System.out.print(" uc");			
				break;
			case 4:
				System.out.print(" dort");			
				break;
			case 5:
				System.out.print(" bes");			
				break;
			case 6:
				System.out.print(" alti");			
				break;
			case 7:
				System.out.print(" yedi");			
				break;
			case 8:
				System.out.print(" sekiz");			
				break;
			case 9:
				System.out.print(" dokuz");			
				break;
			default:
				break;
			}
		
	} else {
		
		System.out.println("3 basamakli sayi dedim sana !!!");
	}
		
		scan.close();
    }
}
