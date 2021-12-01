package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {
    	
int arr1[] = {3,5,1,2,7,9,2,3,5,7};
        
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int k = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            
            if (i == 0) {
                a = arr1[i];
            }
            if (i == 2) {
                a = arr1[i] + arr1[i-1];
            }   
            if (i == 5) {
                a = arr1[i] + arr1[i-1] + arr1[i-2];
            }
            if (i == 9) {
                a = arr1[i] + arr1[i-1] + arr1[i-2] + arr1[i-3];
            }               
            
            list.add(a);
            
            k++;
            i+=k;
        }
        int c;
        
        System.out.println(list);
    	
    }
}
