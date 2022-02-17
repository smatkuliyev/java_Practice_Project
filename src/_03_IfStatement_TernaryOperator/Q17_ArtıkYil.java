package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17_Art�kYil{

public static void main(String[]args){
        // artik yil sorusu

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir yil giriniz : ");
        int year=scan.nextInt();
        System.out.println("   ***   if cozumu   ***   ");
        if(year%100==0&&year%400==0){
        System.out.println("Girdiginiz "+year+" yili ARTIK YIL");
        }else if(year%100!=0&&year%4==0){
        System.out.println("Girdiginiz "+year+" yili ARTIK YIL");
        }else{
        System.out.println("Girdiginiz "+year+" yili ARTIK YIL degildir.");
        }

        //  ternary cozumu ...
        System.out.println("   ***   ternary cozumu   ***   ");

        String result=year%100==0?year%400==0?"Artik Yil":"Artik Yil Degil"
        :year%4==0?"Artik Yil":"Artik Yil Degil";
        System.out.println(result);

        scan.close();


        }

        }
