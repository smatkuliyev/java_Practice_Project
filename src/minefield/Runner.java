package minefield;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to MineField");
        System.out.println("Please enter minefield dimensions");
        System.out.print("Enter row length : ");
        int row = scan.nextInt();
        System.out.print("Enter column height : ");
        int column = scan.nextInt();

        MineField mine = new MineField(row, column);
        mine.run();

        scan.close();
    }

}
