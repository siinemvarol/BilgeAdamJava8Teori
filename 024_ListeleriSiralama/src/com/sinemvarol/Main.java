package com.sinemvarol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	private static void listeyiIncele(List<String> list) {
		// işlemler
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
	//	List<String> list2 = new LinkedList<String>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list); 	// ArrayList elemanları eklediğimiz sırada tutar ve yazar
									// HashSet/HashMap karışık tutar ve yazar
		// Collection Sınıfı:

		// Collections sınıfı bir UTILITY sınıfıdr. (Yani collections framework
		// kullanırken bize yardımcı olabilecek metodları barındırır.)
		
		Collections.sort(list);			// List elemanlarını alfabetik sıraya göre sıralıyor
		
		System.out.println();
		System.out.println(list);
		
		Main.listeyiIncele(list);
		
		// Kendi sınıfımızdan nesneleri kullanarak listeyi dolduralım ve sıralayalım
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Berk", 1050));
		ogrenciler.add(new Ogrenci("Sinem", 1025));
		ogrenciler.add(new Ogrenci("Gülsu", 900));
		ogrenciler.add(new Ogrenci("Ahmet", 1205));
		ogrenciler.add(new Ogrenci("Hivda", 750));
		
		System.out.println("\n" + ogrenciler);
	//	Collections.sort(ogrenciler);			// hata veriyor ve çalışmıyor
	// 	NOT: 	Kendi yazdığımız sınıfları Collections'daki sort metodu ile sıralatmak istiyorsak
	//			yazdığımız sınıflar Comparable interface'ini implement etmeli.
		Collections.sort(ogrenciler);
		System.out.println("\n" + ogrenciler);
		
		// Şimdi de nesnelerimizi compare edelim
		Ogrenci ogr1 = new Ogrenci("Ali", 220);
		Ogrenci ogr2 = new Ogrenci("Veli", 207);
		System.out.println("\n" + ogr1.compareTo(ogr2));
		
		ogr1.setId(200);
		System.out.println("\n" + ogr1.compareTo(ogr2));
	}

}
