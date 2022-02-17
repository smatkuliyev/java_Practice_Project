package _09_Arrays;

import java.util.Arrays;

public class Q09 {

    public static void main(String[] args) {
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int arr[] = {2, 6, 4, 5, 8, 9};
        System.out.println(Arrays.toString(arr));

        int yeniArr[] = new int[arr.length];

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i] = arr[i] * arr[i];
        }

        System.out.println(Arrays.toString(yeniArr));
    }

}
