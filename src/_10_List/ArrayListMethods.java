package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

    @SuppressWarnings({"unused", "serial", "unlikely-arg-type"})
    public static void main(String[] args) {
		/*
	     Array List genel Tanimi:

	            ArrayList<Type> arrayListName = new ArrayList<Type>();
	            List<Type> arrayListName = new ArrayList<>();

	             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
	                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object t�r�nden olmalidir
	                - primitivelerin wrapper classlari B�y�k harflar baslayan isimleridir
	                - int'n wrapper class'i        --> Integer'dir
	                - double'un wrapper class'i    --> Double'dir. vs...

	            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
	                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
	            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki t�r ile ayni anlamindadir.

	    List declarations(tan�mlama) :
	    Array den farki boyut esnekle�idir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
	          Siz eleman ekledikce List length'ini artirir, siz eleman sildikce List length'ini azaltir.


	    key word: List<wrapper Class> name=

	    List'e assaign etme(atama) :
	    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullaniriz.
	    List<wrapper Class> name = new List<>()      *****yanl�������� (<> :jenerik wrapper Class dan parametre al�r.)
	    List<wrapper Class> name = new ArrayList<>() *****do�ru
	    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****do�ru
	    ArrayList<wrapper Class> name = new ArrayList<>()  *****yanl��������

	    List'e ilk de�er atama (initialize):....
	    1.yol : asList();
	    ArrayList<Integer> say�= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
	    2.yol : Listof();
	    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

	    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print i�in:  System.out.println(name);
	    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


	    Collections ==> Bir araya getirilmis parcalar anlam�na gelir. ArrayList, Set, Map ler java collections s�n�f� nesneleridir.

	 */
        System.out.println("******** List tan�mlama ilk d�er atama(initialize)*********");
        //1. yol :
        List<Integer> listSayilar = new ArrayList<>();
        listSayilar.add(1);
        listSayilar.add(23);
        listSayilar.add(35);
        listSayilar.add(17);

        //2.yol :
        List<String> listIsimler = new ArrayList<>(Arrays.asList("Reha", "hakan", "haluk", "ahsen", "ZEHRA", "CEMAL"));// daha pratik

        //3. yol :
        ArrayList<String> listUlkeler = new ArrayList<>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));

        System.out.println("listIsimler : " + listIsimler);
        System.out.println("listSayilar :" + listSayilar);
        System.out.println("listUlkeler : " + listUlkeler + "\n");

        System.out.println("******** List'e eleman ekleme : add() *********");

        //List e eleman ekleme metodu: name.add(eleman);ekleme yap�lan eleman list in s�rekli sonuna eklenir. list elemanlar�nda tekrar olabir.

        listSayilar.add(-123);
        System.out.println(listSayilar);
        //index (yer) belirterek eleman ekleme :name.add(index,eleman);
        listSayilar.add(2, 33);// git �uraya �U eleman� koy: 2. index e 33 koy.2. index ten sonrakilerin s�ras� bir ilerledi.
        System.out.println("2. index'e 33 eklendi " + listSayilar + "\n");

        System.out.println("******** �zel bir metod:Collections nCopies kullanimi... *********");
        // �zel bir metod:Collections nCopies kullanimi...
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in t�m elemanlarini o ile doldurur
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den olu�an arrayList :" + nums + "\n");//[5,5,5,5,5,5,5,5,5,5] 10 tane 5 den olu�an arrayList

        System.out.println("******** �zel bir metod: addAll(Collection C) *********");/*
	            addAll(Collection C)
	            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri (daha sonra g�r�lecek)) sona ekler

	            addAll(int index, Collection C)
	            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri)  belirtilen indexten itibaren ekler
	            # arrayin kalan elemanlarini kaydirir
	         */

        // ArrayList listRakam tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listRakam = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // ArrayList listIkiBasamakli tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listIkiBasamakli = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // ArrayList listRakam2 tanimlanip, initializer icinde initialize ediliyor
        ArrayList<Integer> listRakam2 = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        // listRakam yazdirliliyor
        System.out.println("listRakam : " + listRakam);

        // listIkiBasamakli elemanlari listRakam'e ekleniyor
        listRakam.addAll(listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nin sona eklenmis hali");
        System.out.println("listRakam ListIkiBasamakl� eklenmi� hali : " + listRakam);


        // listIkiBasamakli elemanlari listRakam'e 3. index ten sonra ekleniyor.
        listRakam.addAll(3, listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'n�n 3.indexten itibaren listRakam'a eklenmis hali" + listRakam + "\n");

        System.out.println("******** List'in i�inden istenen index'teki eleman� alma : get() *********");
        listIsimler.get(2);//listIsimler i�inde 2. index teki eleman haluk al�nd�.
        System.out.println("listIsimler'den 2. index teki eleman haluk al�nd� : " + listIsimler.get(2) + "\n");

        System.out.println("******** List'in boyutunu bulma : size() *********");
        //List in boyutu: size: name.size();--> listedeki  eleman say�s�n� verir.
        System.out.println("listSayilar'in eleman say�s� : " + listSayilar.size() + "\n");// 6

        System.out.println("******** List'in istenen eleman�n� silme : remove() *********");

        //List  ten istenen bir eleman� silme : name.remove();--> �u eleman� sil kald�r.
        listSayilar.remove(3);//3. index teki eleman� sil
        listIsimler.remove("haluk");//isimler list inden haluk sil
        System.out.println("listSayilar 3. index teki eleman� silindi : " + listSayilar);
        System.out.println(listSayilar.remove("-123"));// false:
        System.out.println(listIsimler);
        System.out.println(listIsimler.remove("haluk"));//false


        //tekrarl� eleman varsa ilk index dekini siler...
        listIsimler.add("Reha");
        System.out.println("listIsimler'in sonuna Reha eklanmi� hali : " + listIsimler);//sona Reha eklenmi� hali
        listIsimler.remove("Reha");
        System.out.println("listIsimler'de buldu�u ilk reha'y� silindi : " + listIsimler);//buldu�u ilk Reha y� silmi� hali.

        //olmayan eleman� silmek i�in eror vermez...kod �al���r....
        listIsimler.remove("haluk");//haluk varsa siler yoksa hata vermeden kod devam eder.
        System.out.println(listIsimler.remove("haluk"));// isimler obj haluk kald�rmaya gider olmayan elemandan dolay� false verir.
        System.out.println(listIsimler + "\n");

        System.out.println("******** List'te herhangi bir eleman�n index(yerini) bulma : indexOf() *********");
        System.out.println("indexOf ZEHRA sonras� :" + listIsimler.indexOf("ZEHRA"));//3 -->ZEHRA 3. index te
        System.out.println("indexOf haluk sonras� :" + listIsimler.indexOf("haluk"));//-1 -->haluk isimler list inde olmad��� i�in.olmayan eleman�n index i sorgulad���nda error vermez run:-1 verir

        Collections.sort(listSayilar);   //list elemanlar�n� s�ralad�k
        System.out.println("listSayilar'da 48'in indexOf sonras� :" + listSayilar.indexOf(48) + "\n");//list i�inde 48 eleman�n�n index i soruldu 48 elemsn� listte olmad��� i�in -1 verdi

        System.out.println("******** List'te herhangi bir eleman�n son bulma index(yerini) bulma : lastIndexOf() *********");
        // lastIndexOf(Object O):Belirtilen elemanin son bulunma index'ini verir, eleman yoksa -1 d�ner.
        ArrayList<Integer> tekrarlilist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 7, 8, 9));
        System.out.println("2 eleman�n�n listede son bulundu�u yerin index'i :" + tekrarlilist.lastIndexOf(2) + "\n");//5 : 2 den ikincisinin yani sonuncusunun ba�tan index'i


        System.out.println("******** list teki istenen hehangi bir  eleman� update etme :set() *********");


        //list teki istenen hehabgi bir  eleman� update (set) etme: name.set(index,eleman);--> �u index deki eleman� �u eleman ile de�i�tir.
        listIsimler.set(0, "ahmet");
        System.out.println("listIsimler'de 0. inex' ahmet set edildi : " + listIsimler + "\n");
        //  isimler.set(0,"ahmet",1,"ali");-->list te �oklu set metodu �al��maz.buz gibi �NTERV�EW sorusu....

        System.out.println("******** list teki istenen hehangi bir par�as�n� alma :subList(int fromIndex, int toIndex) *********");
	        /*
	            subList(int fromIndex, int toIndex)
	            Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

	         */
        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(listParcasi);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcas� al�ndu : " + listParcasi.subList(2, 5));//2. 3. 4. eleman� al�r. 5 . eleman al�nmaz

        // yeni bir yeniList arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));

        System.out.println("list.subList(4,8) ile yeniList tanimlandi : " + yeniList + "\n");


        System.out.println("******** list'in bo� dolu oldu�unu ��reneme : isEmpty() *********");
        //list in bo�-dolu sorgusu: isEmpty :name.isempty(); --> name listi bo� mu de�il mi? true-false verir.
        System.out.println(listIsimler.isEmpty() + "\n");//false


        System.out.println("******** List te istenen eleman var m� yok mu?��renme : contains() *********");

        // List'te istenen eleman var m� yok mu?: contains: name.contains(eleman); -->true-false
        System.out.println("listIsimler'de ipek elaman� var m�? : " + listIsimler.contains("ipek") + "\n");//false ipek yok

        System.out.println("******** List'teki elemanlar� d�zenli s�ralama : Collections.sort() *********");

        // List  teki elemanlar� d�zenli s�ralama :String:alfabetik(Natural Order), int:k���kten b�y��e...Collections.sort(name);

        Collections.sort(listIsimler);//String s�ras�
        System.out.println("listIsimler'de harf s�ras�  : " + listIsimler);

        Collections.sort(listSayilar);//int s�ras�
        System.out.println("listSayilar'da k���kten b�y�ge elemanlar�n s�ras� : " + listSayilar + "\n");

        //***�nemli*** System.out.println( Collections.sort(list)); -->�eklinde metod print i�inde �al��maz

        System.out.println("******** List'teki elemanlar� d�zenli tersten s�ralama : Collections.reverse() *********");
        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanlar� d�zenli tersten s�ralamas�  = " + listSayilar + "\n");

        ArrayList<Integer> ipek = new ArrayList<>(Arrays.asList(45, 23, 67, -100, 1, 0));
        System.out.println("ilk hali: reverse olmadan : " + ipek);
        Collections.reverse(ipek);
        System.out.println("reverse hali : " + ipek);

        //****�OOOK �NEML� S�leyman hoca bile yanl�� anlatt�....Collections.reverse()--> methodu listteki elemanlar� index s�ras�na g�re tersten s�ralar.

        System.out.println("******** List'teki elemanlar� max min eleman�n� bulma : Collections.max/min() *********");
        System.out.println("listSayilar deki en b�y�k say� = " + Collections.max(listSayilar));
        System.out.println("listSayilar deki en k���k say� = " + Collections.min(listSayilar) + "\n");

        System.out.println("******** List'teki belli bir de�erdeki elemanlara , ba�ka bir de�er atama : Collections.replaceAll() *********");
        // belli bir de�erdeki elemanlar� , ba�ka bir de�er atar
        Collections.replaceAll(listSayilar, 33, 9);
        System.out.println("listSayilar'da 33 de�erindeki elemanlara 9 de�eri atand�  = " + listSayilar + "\n");

        System.out.println("******** List'teki elemanlara ayn� de�eri atama : Collections.fill() *********");
        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a t�m elemanlara 8 atanad� = " + listSayilar + "\n");


        System.out.println("******** iki list'in e�itli�ini bulma : equals() *********");
        //Equals :e�it mi de�il mi: name1.equals(name2);--> name1 name2 t�pat�p ayn� m�? list teki elemanlar�n hem index hem de i�eri�ini ayn� olmal�

        List<String> name1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> name2 = new ArrayList<>(Arrays.asList("b", "a"));
        List<String> name3 = new ArrayList<>(Arrays.asList("A", "b"));
        List<String> name4 = new ArrayList<>(Arrays.asList("A", "b"));
        System.out.println(name1.equals(name2));// name1  name2 ile t�pat�p ayn�? -->false
        System.out.println(name1.equals(name3));// name1  name3 ile t�pat�p ayn�? -->false
        System.out.println(name3.equals(name4) + "\n");// name3  name4 ile t�pat�p ayn�? -->true

        System.out.println("******** list'i Array'a �evirme : toArray() *********");

        //list'i Array'a �evirme : toArray();
        //1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniniz
        String arr[] = listIsimler.toArray(new String[0]);//arr ad�nda String tipinde bir array tan�mlad�k.isimlerden(List) toArray ile yeni String tipi obj de�erleri atad�k
        System.out.println("listIsimler'in array hali: " + Arrays.toString(arr));//[CEMAL, Reha, ZEHRA, ahmet, ahsen]


        //2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secilir
        //Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
        //Object class, Java'da parent'i olmayan tek class'dir.
        //String, Object class'in child'i oldugundan data type olarak bazi durumlarda
        //String yerine Object kullaniriz.
        Object arr1[] = listSayilar.toArray();
        System.out.println("listSayilar'�n  array hali: " + Arrays.toString(arr1) + "\n");

        System.out.println("******** Array'i list'e �evirme : Arrays.asList(arrName) *********");

        //asList() methodu array'leri list'e cevirmek icin kullanilir.
        //asList() methodu parametre olarak array'in ismini kabul eder.

        String arr2[] = {"Aliye", "Canan"};

        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);//[Aliye, Canan]


        //�ook �nemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"


        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("******** list'i  bo�altma silme : clear() *********");
        //List i bo�altma silme : name.clear();
        listIsimler.clear();// isimler list ini bo�alt. temizle, elemanlar�n� sil.
        System.out.println(listIsimler);// [] bo� list verdi.

    }

}
