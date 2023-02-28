package com.sinemvarol;

import java.util.HashMap;

public class MainOSYM {
	
	public static void main(String[] args) {
	
	Ogrenci ogrenci1 = new Ogrenci("Ali", "Kaya", 87, 75, 83);
	Ogrenci ogrenci2 = new Ogrenci("Fatos", "Can", 58, 71, 75);
	Ogrenci ogrenci3 = new Ogrenci("Zeynep", "Özkara", 68, 81, 95);
	Ogrenci ogrenci4 = new Ogrenci("Zeki", "Ozkan", 88, 91, 95);
	
	// key : Integer ( TC Kimlik No)  -> Value : Ogrenci sınıfından oluşturulan nesneler
	HashMap<Integer, Ogrenci> hashMap = new HashMap<Integer, Ogrenci>();
	hashMap.put(114557, ogrenci1);
	hashMap.put(222222, ogrenci2);
	hashMap.put(123456, ogrenci3);
	hashMap.put(654321, ogrenci4);
	
	// Sorgu yazıyoruz:
	//
	// 114557 TC Kimlik nolu öğrencinin notlarını yazdırın:
	Ogrenci sonuc = hashMap.get(114557);
	System.out.println(sonuc);
	
	sonuc = hashMap.get(654321);
	System.out.println(sonuc);
	

}
	
}
