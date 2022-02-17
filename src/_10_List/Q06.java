package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsiz = new ArrayList<>();

        for (Integer each : arr) {

            if (!tekrarsiz.contains(each)) {
                tekrarsiz.add(each);
            }
        }
        int arr2[] = new int[tekrarsiz.size()];

        for (int i = 0; i < tekrarsiz.size(); i++) {
            arr2[i] = tekrarsiz.get(i);
        }

        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));


    }

}
