package com.sinemvarol;

import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		
		// Tam sayı dizisi: -> { 1, 7, 12, 39, 55, 88, 91 }
		// Metin dizisi: { "ali", "veli", "ayşe", "ahmet" }
		
		// dizi tanımlama 
		// dizinin cinsi önce yazılır: byte, short, int, long, float, String vb. sonra [] eklenir
		
		long[] dizi1;
		
		// Kural: dizileri initialize etmeden onları kullanamayız.
		dizi1 = new long[7];  			//biz bu satırı yazınca java arkaplanda şöyle bir şey oluşturur:
										// { 0, 0, 0, 0, 0, 0, 0 }
		System.out.println(dizi1[0]);     // UNUTMAYALIM: dizilerin ilk elemanının indexi 0'dır.
		System.out.println(dizi1[dizi1.length-1]);
		System.out.println(dizi1.length);
		
		// Dikkat:
		// Dizinin boyutlarını aşan indexlere erişmeye çalışırsak hata alırız. örneğin: (IndexOutOfBounds hatası)
		// System.out.println(dizi1[7]); // hata verir çünkü 7 son indexten büyük!!
		
		// Dizilere atama yapmak:
		dizi1[0] = 10;
		dizi1[1] = 15;
		dizi1[6] = 28;                  //   { 10, 15, 0, 0, 0, 0, 28 }
		System.out.println(dizi1[1]);
		System.out.println("\n\n");
		
		// Dizilerin değerleri okunurken genelde for loop kullanılır:
		for (int i = 0; i < 7; i++) {
			System.out.println(dizi1[i]);
		}
		
		// Yukarıdaki yöntem yerine son değer olarak dizinin length'ini kullanın
		for (int i = 0; i < dizi1.length; i++) {
			System.out.println(dizi1[i]);
		}
		
		System.out.println("\n------\n");
		
		// Dizi tanımlamanın 2. yöntemi:
		int[] myArray = {1, 5, 9, 24, 112};
		System.out.println(myArray[2]);
		
		System.out.println("\n------\n");
		
		// Dizi tanımlamanın 3. yöntemi:
		int[] arrayInt = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		
		System.out.println("\n------\n");
		// Soru:
		int[] array1 = {1, 5, 9, 24, 112};
		int[] array2 = {10, 50, 90, 240, 1120};
		array1 = array2;
		array1[0] = 999;
		System.out.println(array2[0]); // Ekrana ne yazar -->> 999 çıkar
		
		// Dizi tanımlama -> String
		//
		String[] arrayString = new String[] {"Ali","Veli","Zeynep","Can"};
		for(int i=0;i<arrayString.length;i++) {
			System.out.println(arrayString[i]);
		}
		
		// String array'i aşağıdaki gibi de tanımlanabilri
		String[] dizi2 = new String[3];
		dizi2[0] = "Papatya";
		dizi2[1] = "Gül";
		dizi2[2] = "Lale";
		// dizi2[3] = "Orkide";  --> hata verir. olmayan bir yere veri girmeye çalışıyorum
		for(int i=0;i<dizi2.length;i++) {
			System.out.println(dizi2[i]);
		}
		
		// NULL konusu
		// 
		String isim;
		//System.out.println(isim); // isim değişkenine atama yapmazsam (initialize etmezsem) IDE kırmızıya boyayıp hata veriyor
		
		//Örnek:
		String[]dizi3 = new String[3];     // String arrayini oluşturup eleman atamazsam: {mull, null, null}
		dizi3[0] = "Ali";
		for(int i=0;i<dizi3.length;i++) {
			System.out.println(dizi3[i]);
		}
		
		System.out.println("\n------\n");		
		//Örnek: Runtime (programın çalışma esnasında) sırasında dizi oluşturma
		// Kullanıcıdan bir tamsayı alalım, girilen tmsayı dizinin boyutu olsun
		// Bu dizinin içeriğini de yine kullanıcı console'dan girerek oluştursun
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin boyutunu giriniz: ");
		int diziBoyutu = scanner.nextInt();
		int[] diziOrnek = new int [diziBoyutu];
		for(int i = 0; i < diziBoyutu; i++) {
			System.out.println("Lütfen dizinin " + i + ". elemanını giriniz: ");
			diziOrnek[i] = scanner.nextInt();
		}
		
		// yukarıdaki kullanıcının oluşturduğu diziyi ekrana yazdıralım:
		for (int i=0; i < diziOrnek.length; i++) {
			System.out.println(diziOrnek[i]);
		}
		
		
		
		
		
	}

}
