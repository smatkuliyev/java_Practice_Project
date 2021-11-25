package _09_Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarili"
	        * with arrays change it to "CoookBasarili" and write changing array
			*(String iniz: "GayetBasarili"  Diziyi "CoookBasarili" ye cevirin )
			*
			*/
		String str = "GayetBasarili";
		System.out.println(str);
		str = str.replace("Gayet", "Coook");
		
		String arr[] = new String[1];
		arr[0] = str;
		
		System.out.println(Arrays.toString(arr));
		

		
	}

}
