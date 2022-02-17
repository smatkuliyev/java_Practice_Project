package _06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tanimi :
        Bir String icinde kac kelime oldugunu yazdiran bir method yaziniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        String str = "The quick brown fox jumps over the lazy dog.";

        int klmsy = cumle(str);

        System.out.println("Number of words in the string: " + klmsy);

    }

    private static int cumle(String str) {

        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        return space + 1;

// 	   String[] words=str.split(" ");
// 	   return words.length;

    }
}
