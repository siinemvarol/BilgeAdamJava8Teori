package com.sinemvarol;

public class MetodOrnekleri2 {
	
	// bir tamsayı dizisi içindeki sayıları toplayıp return eden bir metod yazalım
	
	private static int diziTopla(int[]dizi) {    // en sondaki parametreyi int dizi[] olarak da alabiliyoruz
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			// toplam = toplam + dizi[i];
			toplam += dizi[i];   // yukarıdaki ile aynı
		}
		
		return toplam;
		
	}
	
	private static void arrayIlkElemaniDegistir(int[] dizi) {
		if (dizi.length != 0) {
			dizi[0] = 100;
		}
	}
	
	private static void test(int sayi) {
		sayi = 200;
	}
	
	private static int test2(int sayi) {
		sayi = 300;
		return sayi;
	}

	public static void main(String[] args) {
		
		int[] array1 = { 5, 10, 15, 20, 25 };
		System.out.println(diziTopla(array1));
		
		int[] array2 = { 8 };
		System.out.println(diziTopla(array2));
		
		// arrayler parametre olarak gönderilirse array içeriğine bir referans gider, içerik kopyalanmaz
		arrayIlkElemaniDegistir(array1);
		System.out.println(array1[0]);
		
		System.out.println();
		
		//değişkenlerde durum farklı, ilkel tipler parametre olarak giderse içerik kopyalanır, referans gitmez
		int sayi = 1;
		test(sayi);
		System.out.println(sayi);
		
		// Örnek
		System.out.println(test2(sayi));     // test2 metodunda return ettiğim için burada 300 yazar
		System.out.println("sayi: " + sayi);		// sayi hala 1 olduğu için burada 1 yazar
		
		sayi = test2(sayi); // burada sayi'nin değer atamasını yapıyrum
		System.out.println(sayi); 	// üst satırda sayının değerini atamayla değiştirdiğim için 300 yazar

	}

}
