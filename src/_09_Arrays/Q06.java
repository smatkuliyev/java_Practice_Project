package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en buyukk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak icin bir java programi yazin)	
	*/
    	
    	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
    	
    	Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	
    	int ekSayi = arr[0];
    	int ebSayi = arr[arr.length-1];
    	int eb2Sayi = arr[arr.length-2];
    	
    	System.out.println(ekSayi);
    	System.out.println(eb2Sayi);
    	System.out.println(ebSayi);
    	
    	
    }

}
