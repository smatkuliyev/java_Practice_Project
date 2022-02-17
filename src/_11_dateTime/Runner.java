package _11_dateTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String islem;

        Registration userReg = new Registration();
        ArrayList<User> register = null;

        boolean cikilsinMi = false;

        while (!cikilsinMi) {
            System.out.println("Lutfen "
                    + "\nkisi eklemek icin 1, "
                    + "\nkisi listelemek icin 2, "
                    + "\nsansli kisi bulmak icin 3, "
                    + "\nkisi cikis icin 4");
            islem = scan.next();

            switch (islem) {
                case "1":
                    register = (ArrayList<User>) userReg.register();
                    break;
                case "2":
                    userReg.listele(register);
                    break;
                case "3":
                    userReg.printHappyUsers(register);
                    break;
                case "4":
                    cikilsinMi = true;
                    break;

                default:
                    System.out.println("hatali giris");
                    break;
            }

        }
        scan.close();

    }

}
