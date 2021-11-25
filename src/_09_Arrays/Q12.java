package _09_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
	//Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin 
	//toplamini birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan
	// ve yeni array'i ekrana yazdiran bir program yaziniz  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
		
		int arr[][] = { {1,2,3}, {4,5}, {6,7}, {1,6,7} };
		
		int arr1[] = new int[arr.length];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			arr1[i] = sum;
		}
		
		System.out.println(Arrays.toString(arr1));

	}
}
