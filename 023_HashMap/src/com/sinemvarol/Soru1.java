package com.sinemvarol;

import java.util.HashMap;

public class Soru1 {

	// sınav sorusu

	// Static bir metod yazın
	// Bir string içindeki karakterlerin sayısını bulan ve ekrana yazdıran
	// bir metod yazın

	// String metin = "Hello"; // H:1 e:1 l:2 o:1
	// İpucu: HashMap kullanabilirsiniz
	// İpucu -> Key : Karakter -> Value : Karakterin tekrar sayısını (count)
	// tutabilirsiniz.
	
	// Soru 2: En çok tekrar eden harfi bulunuz ve tekrar sayısını yazdırınız

	public static void harfSayisiniBul(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);

			if (hashMap.containsKey(ch)) { // karakter hashMap'te mevcutsa bu kod bloğuna girer
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else { // karakter hashMap'te mevcut değilse bu kod bloğuna girer
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);

	}
	
	public static void enCokTekrarEdenHarfiBul(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char enCokTekrarEdenKarakter = 0;
		int max = 0;
		
		
		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);

			if (hashMap.containsKey(ch)) { // karakter hashMap'te mevcutsa bu kod bloğuna girer
				
				int tekrarSayisi = hashMap.get(ch)+1;
				
				if (tekrarSayisi > max) {
					enCokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
				}
				hashMap.put(ch, hashMap.get(ch)+1);
				
			} else { // karakter hashMap'te mevcut değilse bu kod bloğuna girer
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
		System.out.println("en cok tekar eden karakter: " + enCokTekrarEdenKarakter + " tekrar sayısı: " + max);

	}

	public static void main(String[] args) {

		String metin = "Hello";
		Soru1.harfSayisiniBul(metin);
		Soru1.enCokTekrarEdenHarfiBul("aaaolıoaa");

	}

}
