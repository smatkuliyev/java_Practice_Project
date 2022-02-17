package _08_While_DoWhile;

public class Q08_OCAType {

    public static void main(String[] args) {
		/*
		a�a��daki kod blogunun ��kt�s� ne olur?
		 */
        int x = 3;
        int i = 0;
        while (i < 3) {
            x += 1;
            i += 1;
        }
        System.out.println("x = " + x);
        System.out.println("i = " + i);
    }
    // A) 	x = 3
    //		i = 0

    // B) 	x = 6      cevap B)
    //		i = 3

    // C) 	x = 9
    //		i = 0
}
