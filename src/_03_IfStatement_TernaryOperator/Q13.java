package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
    	
    	   /*  Problem Tanımı
        Kullanıcıdan uc adet sayı alarak bu sayıların
        bir dik ucgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir ucgenin dik olduğunu anlamak icin a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
​
        örnek Ekran çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        ucuncu kenarı giriniz: 7
        Bu bir dik ucgen değildir.
​
        Bu bir dik ucgendir
     */
		Scanner scan = new Scanner(System.in);
		System.out.print("birinci kenar uzunlugunu giriniz : ");
		int k1 = scan.nextInt();
    	
		System.out.print("ikinci kenar uzunlugunu giriniz : ");
		int k2 = scan.nextInt();
		
		System.out.print("ucuncu kenar uzunlugunu giriniz : ");
		int k3 = scan.nextInt();
		
		if (k1*k1 + k2*k2 == k3*k3) {
			System.out.println("Bu bir dik ucgendir");
		} else {
			System.out.println("Bu bir dik ucgen değildir");
		}
		
		scan.close();
    	
    }
}
