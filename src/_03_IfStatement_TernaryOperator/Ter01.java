package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    	
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 1 sayi giriniz : ");
		int sayi = scan.nextInt();
				
		 System.out.println("*****  ternary cozum ****");
		
		String sonuc =(sayi >= 0) ? ( (sayi<10) ? ("Rakam") : ("Pozitif Sayi")) : ("Negatif Sayi") ;
		
		System.out.println(sonuc);
		
		 System.out.println("*****  if cozum ****");
		
		 if (sayi>=0) {
	            if (sayi<10) {
	                System.out.println("rakam");
	            }else {
	                System.out.println("pozitif sayi");
	            }
	            
	        }else {
	        	System.out.println("Negatif Sayi");
	        }
				
		scan.close();
    }
}
