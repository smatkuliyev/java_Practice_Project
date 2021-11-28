package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        // ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.		
		
		Scanner scan = new Scanner(System.in);		
		String str = ""; 
		
		do {
			System.out.print("Lutfen x girin yoksa bu program calismaya devam eder : ");
			str = scan.next(); 			
			
		} while (!str.equals("x"));
		
		System.out.println("Program bitti.");
		scan.close();
	}
}
