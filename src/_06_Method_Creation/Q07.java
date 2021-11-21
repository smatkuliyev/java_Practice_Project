package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*
        reverseString isminde bir method olusturun.
        Bu method bir String'i parametre olarak alsin.
        Ve bu method, girilen String'i tersten yazsin.
        Terste yazilmis halini yazdiriniz.

        Orn: String = "Java'yi Seviyorum."
        Print: .muroyiveS iy'avaJ
         */
	public static void main(String[] args) {
		
		reverseString();	
		
	}

	private static void reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir String giriniz : ");
		String str = scan.nextLine();
		
		String reverseStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reverseStr+=str.substring(i, i+1);   //str.charAt(i);
		}
		System.out.println(reverseStr);
		scan.close();
	}
   
}

