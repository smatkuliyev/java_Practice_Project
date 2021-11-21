package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanicidan bir e-posta adresi girmesini isteyin, ardindan "hotmail" iceriyorsa, "gmail" ile degistirin,
        ornegin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	Scanner scan = new Scanner(System.in);
    	System.out.print("bir mail adresi giriniz : ");
    	String mail = scan.next();
    	
    	
    	if (mail.endsWith("@hotmail.com")) {
			mail = mail.replace("@hotmail.com", "@gmail.com");
		}
    	System.out.println(mail);
    	
    	scan.close();
    }
}
