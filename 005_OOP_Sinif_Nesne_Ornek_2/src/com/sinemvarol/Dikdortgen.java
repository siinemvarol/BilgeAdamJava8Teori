package com.sinemvarol;

public class Dikdortgen {
	public int kisaKenar;
	public int uzunKenar;
	
	public int alanHesapla() {
		double pi = 3.14; // metodun içindeki lokal değişken, yaşam döngüsü bu metod boyuncadır
		return (kisaKenar * uzunKenar);
	}
	
}
