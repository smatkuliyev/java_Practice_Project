package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
    	
        /*
        Problem tanimi : 
      Kulanicidan aracinin hizini aliniz
      Trafik cezasinin değerini hesaplayin.
          45 hiz siniridir.
          Eğer hiziniz 55-74 arasinda ise:
          Ceza 100 $'dir.
​
          Eğer hiziniz 75 - 84 arasinda ise:
          Ceza 150 $'dir.
​
          Eğer hiziniz 85 -94 arasinda ise:
          Ceza 320 $'dir.
​
          Eğer hiziniz 94'den daha fazla ise:
          Ceza 500 $'dir.
​
          ve ayrica,
          Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
​
          örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
​
-----------------------------------------
​
          örn;
​
          currentSpeed(Hiziniz) 87
          ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;
​
          sonuç 320 olmalidir.
​
          currentSpeed(Hiziniz) 65
          ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;
​
          sonuç 300 olmalidir.
   */
  	
		Scanner scan = new Scanner(System.in);
		System.out.print("Hızınızı girin : ");
		int hiz = scan.nextInt();
		
		System.out.print("Ehliyetiniz var mı? Evet içn 1 i , Hayır için 0 ı tuşlayınız : ");
		int ehliyet = scan.nextInt();
		
		if (ehliyet == 1) {
			
			if (hiz < 55) {
				System.out.println("Hız limitine uyuyorsunuz, Teşekkürler anlayışlı sürücü!");
			} else if (hiz < 75) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (100) + ".");
			} else if (hiz < 85) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (150) + ".");
			} else if (hiz < 95) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (320) + ".");
			} else {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (500) + ".");
			}
			
		} else {
			
			if (hiz < 55) {
				System.out.println("Korsan sürücü ehliyetiniz yok, cezanın : $" + (200));
			} else if (hiz < 75) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (100+200) + ".");
			} else if (hiz < 85) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (150+200) + ".");
			} else if (hiz < 95) {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (320+200) + ".");
			} else {
				System.out.println("Hız limitiniz aştınız, cezanın : $" + (500+200) + ".");
			}
		}
		
     
		scan.close();
    	
    }
}
