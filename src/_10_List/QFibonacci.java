package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QFibonacci {
	 /*
    Kullanýcýdan alýnan bir tamsayýya kadar FIBONACCI dizisi oluþturun.
    1-1-2-3-5-8-13-21-34....
    */

    public static void main(String[] args) {
    	int sayi = 90;
        
        List<Integer> fib = new ArrayList<>();
        
        fib.add(1);
        fib.add(1);
        int a = 0 ;
        
        do {
            
            a = fib.get(fib.size()-2) + fib.get(fib.size()-1);
            fib.add(a);
            
        } while (a < sayi );
        
        System.out.println(fib);
        fib.remove(fib.size()-1);
        System.out.println(fib);

    }
}
