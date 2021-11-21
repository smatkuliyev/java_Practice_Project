package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
		Scanner scan = new Scanner(System.in);	
		System.out.println("Lutfen bir String giriniz : "); 	
		String str = scan.nextLine();
		
		String a = ilkikisiz(str);
		
		System.out.println(a);
		
		scan.close();
    }

	public static String ilkikisiz(String s) {
		String kalanHarfler = "";
		if (s.startsWith("gh")) {
			kalanHarfler = s;
		} else if(s.startsWith("g")) {
			kalanHarfler = s.substring(0, 1) + s.substring(2);
		} else if(s.charAt(1) == 'h') {
			kalanHarfler = s.substring(1);
		} else {
			kalanHarfler = s.substring(2);
		}
		
		return kalanHarfler;		
	}
}
