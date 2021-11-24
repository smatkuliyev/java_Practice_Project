package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin isaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
    	
    	int arr[] = {1,2,-3,4,-5,-6};
    	System.out.println(Arrays.toString(arr));
    	
    	int arrYeni[] = new int[6];
    	
    	for (int i = 0; i < arr.length; i++) {
			
    		arrYeni[i] = (-1) * arr[i];   		
		}
    	
    	System.out.println(Arrays.toString(arrYeni));
    	
    }
}
