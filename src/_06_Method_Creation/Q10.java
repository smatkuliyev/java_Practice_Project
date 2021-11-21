package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
    /*
     Problem Tanimi :
        powerOfThree isminde bir method olusturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayi verildiginde, 3 ussu olup olmadigini teyit edin. 3'un ussu(kuvveti) ise true, degilse false dondurun.
        
        ornek 1:					ornek 2:					ornek 3:				ornek 4:
        Girdi: 27					Girdi: 0					Girdi: 9				Girdi: 45
        cikti: true					cikti: false				cikti: true				cikti:: false
        Aciklama: 3*3*3 =27										Aciklama: 3*3 = 9		Aciklama: 3*3*3*3 =81
        Sonuc= true												Sonuc= true				Sonuc= false
																						45, 3un ussu (kuvveti) degildir.				   */
      public static void main(String[] args) {
  		Scanner scan = new Scanner(System.in);
  		System.out.println("Lutfen bir String giriniz : ");
  		int num = scan.nextInt();
    	    	  
    	 System.out.println("Girdi : " + num + "\nCikti : " + powerOfThree(num));
    	  
    	  scan.close();
	}

	private static boolean powerOfThree(int num) {
		boolean bk = false;
		int carpim = 1;
		
		for (int i = 1; i < num/3; i++) {
			carpim*=3;
			
			if (carpim == num) {
				bk =true;
				break;
			}			
		}		
		return bk;
	}   
}
