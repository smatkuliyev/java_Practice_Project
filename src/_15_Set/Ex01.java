package _15_Set;

import java.util.HashSet;

public class Ex01 {

    /*

    parametresi  ve adi elementEkle isminde Integer set ve integer array parametreli
    olan bir method yaziniz (return type void)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[]{10, 11, 12, 13, 24};
        //       elementEkle(hs, new int[]{3,5,7,9});//int[]arr=new int[]{3,5,7,9} farklı gösterim
        elementEkle(hs, arr);//int[]arr=new int[]{10, 11, 12, 13, 24}
        yazdir(hs);

    }

    private static void yazdir(HashSet<Integer> hs) {
        for (Integer w : hs) {
            System.out.print(w + " ");
        }

    }

    private static void elementEkle(HashSet<Integer> hset, int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int w : arr) {
            hs.add(w);
        }
        System.out.println(hs);
    }


}
