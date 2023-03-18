package com.sinemvarol.ThreadsizListeYazici;

public class Main {

	public static void main(String[] args) {
		
		ThreadsizListeYazici threadsizListeYazici = new ThreadsizListeYazici();
		long baslangic = System.currentTimeMillis();
		threadsizListeYazici.listelereDegerEkle();
		long bitis = System.currentTimeMillis();
		System.out.println("Toplam geçen süre: " + (bitis-baslangic));
	}

}
