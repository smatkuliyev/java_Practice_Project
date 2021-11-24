package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("arrayin boyutunu giriniz : ");
		int arrBoyutu = scan.nextInt();
		
		int arr[] = new int[arrBoyutu];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Array'in " + (i) + ". index'indeki elamanini giriniz : ");
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Girdiginiz array'in max ve min eleman degeri : " + (arr[arr.length-1] - arr[0]));
		
		scan.close();
	}
}
