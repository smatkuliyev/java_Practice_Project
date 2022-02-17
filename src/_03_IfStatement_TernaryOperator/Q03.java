package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/*
		Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu santimetre olarak giriniz :");
        double boy = scan.nextDouble();

        System.out.print("Lutfen kilonuzu kg olarak giriniz :");
        double kilo = scan.nextDouble();

        double BMI = kilo / (boy / 100 * boy / 100);

        if (BMI <= 20) {
            System.out.println("oldukca zayifsiniz");
        } else if (BMI <= 25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (BMI <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else {
            System.out.println("Obez grubundasiniz");
        }
        scan.close();
    }

}
