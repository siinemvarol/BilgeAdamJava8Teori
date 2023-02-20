package com.sinemvarol;

public class ForEachKullanimi {

	public static void main(String[] args) {
		
		int[] dizi = {1, 24, 35, 55, 78, 83, 39};
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();

		// For each döngüsü
		// Köşeli parantezler kullanılmadan yapılır
		for(int sayi : dizi) {
			System.out.print(sayi + " ");
		}
		
		System.out.println();
		String name = "";
		
		// Örnek 2:
		//
		String[] isimlerDizi = { "Ali", "Veli", "Osman", "Zeynep"};
		for (String isim : isimlerDizi) {
			System.out.println(isim);
			name = isim;
		}
		
		// Scope'a dikkat lütfen !!
		// System.out.println(isim);      // Hata verir
		System.out.println("name: " + name);
		
		// Dkkat 2 !!
		int z;
//		int y = z * 2;        --> Hata verir. Neden? z değerini initialize etmedik.
		
		
	}

}
