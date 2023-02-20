package com.sinemvarol;

public class VarArgsKullanimi {
	
	public static void toplaVarArgs(int... sayilar) {				// kaç tane parametre kullanacağımı bilmediğimde VarArgs kullanıyorum
		int toplam = 0;				// Yukarıdaki metodun parametre kısmında yazan sayılar bir dizi gibi davranır
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam: " + toplam);
		
		// Yukarıdaki örneği for each ile yapalım
		int toplamForEach= 0;
		for( int x : sayilar) {
			toplamForEach += x;
		}
		System.out.println("For each ile toplam: " + toplamForEach);
	}
	
	public static void ekranaYazdir(String... isimler) {
		for(String isim : isimler) {
			System.out.println(isim);
		}
	}

	public static void main(String[] args) {
		
		// https://www.baeldung.com/java-varargs
		toplaVarArgs(1,2,3,4,5,7,3);
		
		ekranaYazdir("Ali", "Kaan", "Zeynep");

	}

}
