package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        // Kullan�c�da x  girilene kadar ekrana "Program �al���yor" yazan
        // ve x girildi�inde ise "Program bitti" yazan program� yaz�n�z.		

        Scanner scan = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("Lutfen x girin yoksa bu program calismaya devam eder : ");
            str = scan.next();

        } while (!str.equals("x"));

        System.out.println("Program bitti.");
        scan.close();
    }
}
