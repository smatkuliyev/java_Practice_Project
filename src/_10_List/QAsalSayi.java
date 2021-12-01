package _10_List;

public class QAsalSayi {

    /*
    100 den kucuk asal sayilari yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
    	
    	 int flag = 0;
         for (int i = 1; i < 100; i++) {
             flag = 0;
             for (int j = 2; j < i; j++) {
                 if (i%j == 0) {
                     flag = 1;
                     break;
                 } 
             }
             
             if ( i> 1 && flag == 0) {
                 System.out.print(i + " ");
             }   
         }
    	
    }
}
