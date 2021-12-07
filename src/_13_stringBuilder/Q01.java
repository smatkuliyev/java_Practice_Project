package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cumleyi parametre olarak kabul eden, StringBuilder kullanarak cumleyi ters ceviren ve cumlenin palindrom
	        olup olmadigini kontrol eden (buyuk/kucuk harf duyarliligi olmadan) bir Java programi yazin.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir metin girin : ");
    	
    	String metin = scan.nextLine();    	
    	StringBuilder sb = new StringBuilder(metin);
    //	StringBuilder sb = new StringBuilder(scan.nextLine());
    //	sb.append(metin);
    	
    	String tersMetin = sb.reverse().toString();
    	
    	if (tersMetin.equalsIgnoreCase(metin)) {
			System.out.println("girilen metin polindrome : " + tersMetin);
		} else {
			System.out.println("girilen metin polindrome degildir: " + tersMetin);
		}
     	
    	scan.close();
    }

}
