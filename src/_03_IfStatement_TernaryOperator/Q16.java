package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Art arda 3 sayý giriniz : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b && a > c && b > c) {
			System.out.println("En buyuk sayi : " + a +"\nEn kucuk sayi : " + c);
		} else if (a > b && a > c && c > b) {
			System.out.println("En buyuk sayi : " + a +"\nEn kucuk sayi : " + b);
		}else if (b > a && b > c && a > c) {
			System.out.println("En buyuk sayi : " + b +"\nEn kucuk sayi : " + c);
		} else if (b > a && b > c && c > a) {
			System.out.println("En buyuk sayi : " + b +"\nEn kucuk sayi : " + a);
		} else if(c > a && c > b && a > b) {
			System.out.println("En buyuk sayi : " + c +"\nEn kucuk sayi : " + b);
		} else if(c > a && c > b && b > a) {
			System.out.println("En buyuk sayi : " + c +"\nEn kucuk sayi : " + a);
		}
		
		scan.close();
        
    }
}

