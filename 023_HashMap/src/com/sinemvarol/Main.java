package com.sinemvarol;

import java.util.HashMap;
import java.util.Map;

public class Main {

	// HashMap'ler key-value pair'ler olarak tutulur.
	// Key -> Value
	// HashMap içindeki elemanları sıralı biçimde tutmaz (hashSet gibi)
	// (ArrayList ve LinkedList aksine)
	// HashMap içindeki elemanları hashleyerek random bir sırada tutar.
	// HashMap'ler List'lere göre random access (rastgele erişim) kullanır,
	// tıpkı hashSet'ler gibi hızlıdırlar.

	public static void main(String[] args) {
		
	//	HashMap<Key, Value>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		
		System.out.println(hashMap);
		
		System.out.println();
		// Aynı key'e sahip başka bir kayıt eklemeye kalkarsanız üzerine yazarsınız
		hashMap.put(40, "Fiat");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(40));
		System.out.println(hashMap.get(50));
		System.out.println(hashMap.get(70));
		
		if (hashMap.containsKey(40)) {
			System.out.println("\nmevcut");
		} else {
			System.out.println("\nmevcut değil");
		}
		
		if (hashMap.containsKey(70)) {
			System.out.println("\nmevcut");
		} else {
			System.out.println("\nmevcut değil");
		}
		
		// HASHMAP İÇERİĞİNİ BASTIRMAK
		//
		// 1. YOL: HashMap'i Set'e dönüştürür ve loop ile yazdırırız
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar: " + entry.getKey() + " - Değer: " + entry.getValue());
		}
		
		System.out.println("- - - - - ");
		// 2. YOL
		for (Integer key: hashMap.keySet()) {
			System.out.println("Key: " + key + " - Value: " + hashMap.get(key));
		}
		
		// önemli bir iki metod:
		//
		// containsKey
		if (hashMap.containsKey(20)) {
			System.out.println("\nmevcut");
		} else {
			System.out.println("\nmevcut değil");
		}
		
		// containsValue
		if (hashMap.containsValue("Renault")) {
			System.out.println("\nRenault değeri hashMap içinde mevcut");
		} else {
			System.out.println("\nRenault değeri hashMap içinde mevcut değil");
		}

	}

}
