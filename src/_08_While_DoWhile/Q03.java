package _08_While_DoWhile;

// import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi tabanini giriniz : ");
		int taban = scan.nextInt();
		
		System.out.print("Sayi ustunu giriniz : ");
		int us = scan.nextInt();	
		
		int sonuc = 1;
		
	/*	int arr[] = new int[us];	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = taban;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int each : arr) {
			sonuc*=each;
		}
	*/	
		
		while (us > 0) {
			
			sonuc*=taban;
			us--;
		}
		
		
		System.out.println("Sonuc : " + sonuc);
		scan.close();
	}

}
