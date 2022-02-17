package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
    /*
      Problem tanimi:
      Kullanicidan aldiginiz bir String'deki kelimeleri sondan basa dogru yerlestiren
      String parametreli return type li reverseWord isminde bir method yaziniz

       Test DAta :
      Input : Allah Javaci arkadaslara  zihin acikligi versin
      Output : versin acikligi zihin arkadaslara Javaci Allah
       */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz : ");
        String str = scan.nextLine();

        System.out.println(reverseWord(str));

        scan.close();
    }

    private static String reverseWord(String str) {

        String[] arr = str.trim().split(" ");//split: her " " space den sonra her eleman� virg�lle ay�r�r.

        String strTers = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();

    }

}
