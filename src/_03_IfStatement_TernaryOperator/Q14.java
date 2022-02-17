package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
		/* Gunun sorusu: if statement
	      katsayilari verilen 2 bilinmeyenli denklemin kokleriniz bulunuz.
​
	        ax^2 + bx + c;
​
	        cozum adimlari
	        kullanicidan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane kok vardir x1=(-b + kok(d)) / (2a)  , x2= (-b - kok(d)) / (2*a)
	        Delta = 0 => 1 tane kok vardir x = -b/2a
	        Delta < 0 ise kok yoktur.
	   */
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kenar uzunlugunu giriniz : ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = b * b - 4 * a * c;
        System.out.println("Delta esittir : " + delta);

        if (delta > 0) {
            System.out.println("2 tane kok vardir : " + ((-b + Math.sqrt(delta)) / (2 * a)) + " ve " + ((-b - Math.sqrt(delta)) / (2 * a)));


        } else if (delta == 0) {

            System.out.println("1 tane kok vardir : " + (-b / (2 * a)));

        } else {
            System.out.println("kok yoktur");
        }

        scan.close();
    }
}
