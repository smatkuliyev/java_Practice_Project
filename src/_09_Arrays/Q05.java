package _09_Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan buyuk olan elemanlari yazdiran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
		int arr[] = {1,2,3,4,5,6,17,7,1,14};
		
		int toplam = 0;
		int sayac = 0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
			sayac++;
		}
		
		System.out.println("Array'in elemanlarinin toplami : " + toplam);
		System.out.println("Array'in elemanlarinin sayisi : " + sayac);
		System.out.println("Array'in elemanlarinin ortalama degeri : " + (toplam/sayac));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > (toplam/sayac)) {
				System.out.println("Ortalamadan buyuk olan array'in elemanlari : " + arr[i]);
			}
		}
		
	}

}
