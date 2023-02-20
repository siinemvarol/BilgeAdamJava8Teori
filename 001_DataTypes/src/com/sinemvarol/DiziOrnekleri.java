package com.sinemvarol;

public class DiziOrnekleri {

	public static void main(String[] args) {
		// Soru:
		
		int[]dizi1 = {-4, 7, 12 ,78, -32, 122, 0, 9};
		//bu dizinin ortalamasını tamsayı cinsinden bulunuz
		
		int toplam1 = 0;
		int ortalama1 = 0;
		for(int i = 0; i < dizi1.length; i++) {
			toplam1 = toplam1 + dizi1[i];        // bu şekilde de yazılabilir --> toplam1 += dizi1[i];
			}
		ortalama1 = toplam1 / dizi1.length;
		System.out.println("Dizideki elemanların ortalaması: " + ortalama1);
		
		// int eşitlerken yuvarlama yapması
		int x = 20;
		int g = x / 3;
		System.out.println(g);    //konsola 6 yazıyor aşağı yuvarlıyor. normal değeri 6,66...
		int y = 3;
		double v = x / (y*1.0);         // soldaki şekilde yaparsam küsüratını konsola yazdırabilirim
		System.out.println(v);
		
		// Küsüratlarla ilgili Java Math kütüphanesinin kullanılması
		System.out.println(Math.round(v));    // matematiksel (bilimsel) yuvarlama yapıyor. 6,66'yı 7'ye yuvarlıyor.
		System.out.println(Math.round(1.4));
		
		// -----------------------------
		// Arraydeki en küçük ve en büyük sayıyı bulma problemleri
		
		// Bir arraydeki en büyük sayıyı bulunuz
		// En büyük sayıyı bulmak için en baştaki sayıyı en büyük sayı kabul edip arraydeki bir sonraki sayıyla kıyaslayalım.
		// Eğer kıyasladığımız sayı daha büyükse en büyük sayı o olsun, değilse değişiklik yapmayalım.
		// arraydeki tüm sayıları bu şekilde kontrol edelim.
		int enBuyukSayi = dizi1[0];
		for(int i = 0; i < dizi1.length; i++) {
			if (enBuyukSayi < dizi1[i]) {
				enBuyukSayi = dizi1[i];
			}
		}
		System.out.println("Arraydeki en büyük sayı: " + enBuyukSayi);
		
		// Arraydeki en küçük sayıyı ve indexini bulunuz
		int enKucukSayi = dizi1[0];
		int index = 0;
		for(int i = 0; i < dizi1.length; i++) {
			if (enKucukSayi > dizi1[i]) {
				enKucukSayi = dizi1[i];
				index = i;
			}
		}
		System.out.println("Arraydeki en küçük sayı: " + enKucukSayi + " ve indexi: " + index);
			
	}

}
