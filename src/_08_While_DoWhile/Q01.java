package _08_While_DoWhile;

public class Q01 {

	public static void main(String[] args) {
		// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		
		int sayi = 153;
		
		int ilkDeger = sayi;
		int kuplertoplam = 0;
		int rakam = 0;
		
		while (sayi != 0) {
			rakam = sayi%10;
			kuplertoplam+= rakam*rakam*rakam;
			sayi/=10;
		}
		
		if (kuplertoplam == ilkDeger ) {
			System.out.println("Girdiginiz sayi Armstrong sayi");
		} else {
			System.out.println("Girdiginiz sayi Armstrong sayi degil");
		}
	}
}
