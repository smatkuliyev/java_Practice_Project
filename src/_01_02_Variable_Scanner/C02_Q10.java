package _01_02_Variable_Scanner;

import java.util.Scanner;

public class C02_Q10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Fahrenheit degree : ");

        double f = scan.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Celsius degree is : " + c);

        scan.close();

    }

}
