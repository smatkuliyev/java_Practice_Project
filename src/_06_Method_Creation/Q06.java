package _06_Method_Creation;

public class Q06 {

 /*     Problem tanimi :
        Bir String icindeki tum karakterleri en fazla bir kez yazdiran parametreli bir method yaziniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

		public static void main(String[] args) {
			String strr = "aabbcccccddddaaa";	
			birKereYazdir(strr);
			
		}

		private static void birKereYazdir(String str) {
			String bky = "";
			for (int i = 0; i < str.length(); i++) {
				if (!bky.contains(str.substring(i, i+1))) {
					bky+=str.substring(i, i+1);
				}
			}
			System.out.println(bky);
		}
}
