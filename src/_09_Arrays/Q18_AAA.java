package _09_Arrays;

import java.util.Arrays;

public class Q18_AAA {
    public static void main(String[] args) {
        // kullanicidan alinan bir  String'deki herbir  karakterin adedini bir array icinde yazdiran bir java programi yazin.
        // String  "Javacilar cook afilli" ise cevap soyle olmalidir:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
    		
    		int a;
    		
	    	String  str= "Javacilar cook afilli";
	    	
	    	int count[] = new int[256];
	    	
	    	for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i)]++;
	    	}
	    	
			System.out.println(Arrays.toString(count));
			
			char ch[] = new char[str.length()];
			
			for (int i = 0; i < ch.length; i++) {
				ch[i] = str.charAt(i);
				
				int find = 0;
				
				for (int j = 0; j < ch.length; j++) {
					if (str.charAt(i) == ch[j]) {
						find++;
					}
				}
				if (find == 1) {
					System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
				}
				
			}


    }
}
