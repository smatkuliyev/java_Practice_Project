package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.		
		
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
