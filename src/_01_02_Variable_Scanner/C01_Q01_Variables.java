package _01_02_Variable_Scanner;

public class C01_Q01_Variables {

    public static void main(String[] args) {
	/*
		\n (or \r): starts from a new line : metni bir alt sat�rdan itibaren yazd�r�r.
        \t:  horizontal tab : metni yatayda 1 tab miktar� kayd�r�r.
        \\: prints a back slash :\ (ters slash) yazd�r�r
        \': prints single quote :' tek t�rnak yazd�r�r.
        \": prints double quote :" �ift t�rnak yazd�r�r.
	 */

        //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazd�r�n�z

        System.out.println(" \"Hello \", \"World  \\ /\"");

        // Soru-2 : Pazartesi kelimesini her harfini ayr� bir satira gelecek sekilde yazd�r�n�z.

        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");

        //Soru-3 : //Soru-3 : "Java" ile hayat cok 'afilli'   yazd�r�n�z   yazd�r�n�z

        System.out.println(" \"Java\" ile hayat cok \'afilli\' \n");

        //Soru-4 : "Basari" gayrete
        // 'asiktir'  yazd�r�n�z sonraki "TechProEd ile java cok kolay ..." ifadesi  3 sat�r sonra ve sat�r bas�ndan 1 tab ileride yaz�ls�n.

        System.out.println(" \"Basari\" gayrete \n \'asiktir\' \n\n\n \t \"Techpro ile java cok kolay...\" ");

    }

}
