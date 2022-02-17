package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
    	
    	   /*  Problem Tanimi
        Kullanicidan bir tarihi gun, ay ve yil seklinde alip bu tarihi
        ay, gun, yil ve yil, ay, gun siralarina cevirerek yazan bir kod yaziniz.
    	TRICK: her else komutundan sonra return; komutu kullaniniz...
​
        ornek Ekran ciktisi
        Lutfen gunu giriniz: 10
        Lutfen ayi giriniz: 02
        Lutfen yili giriniz: 2009
        Gun ay yil: 10.02.2009
        Ay gun yil: 02.10.2009
        Yil ay gun: 2009.02.10                          */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gün giriniz : ");
        int gun = scan.nextInt();

        System.out.print("Lutfen ay giriniz : ");
        int ay = scan.nextInt();

        System.out.print("Lutfen yil giriniz : ");
        int yil = scan.nextInt();

        System.out.println("Gun Ay Yil : " + gun + "." + ay + "." + yil);
        System.out.println("Ay Gün Yil : " + ay + "." + gun + "." + yil);
        System.out.println("Yil Ay Gün : " + yil + "." + ay + "." + gun);

        scan.close();

    }
}
