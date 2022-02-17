package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
			yazdiriniz */

        Scanner scan = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String meslek = scan.next();

        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if (meslek.equalsIgnoreCase("qa")) {
            System.out.println("Mesleginiz : " + qa);
        } else if (meslek.equalsIgnoreCase("dev")) {
            System.out.println("Mesleginiz : " + dev);
        } else if (meslek.equalsIgnoreCase("ba")) {
            System.out.println("Mesleginiz : " + ba);
        } else if (meslek.equalsIgnoreCase("pm")) {
            System.out.println("Mesleginiz : " + pm);
        } else {
            System.out.println("Hatali secim yaptiniz");
        }


        scan.close();
    }

}
