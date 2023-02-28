package com.sinemvarol;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("Veli", "Çelikçi", 451, 0);
		Ogrenci ogrenci3 = new Ogrenci("Mehmet", "Taş", 452, 0);
		Ogrenci ogrenci4 = new Ogrenci("Fatma", "Emre", 453, 0);
		
		//
		Sinif sinif1 = new Sinif("1A", "Zemin kat 101 Nolu oda", new ArrayList<Ogrenci>());
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
	//	sinif1.sinifaOgrenciEkle(ogrenci4);				// encapsulation bu tarz kullanım tavsiye ediyor
		sinif1.getOgrencilerArrayList().add(ogrenci4); // arrayliste bu tarz eleman ekleme tavsiye edilmiyor
		
		//
		Sinif sinif2 = new Sinif("1B", "C Blok 2. kat");
		Ogrenci ogrenci5 = new Ogrenci("Kaan", "Emre", 500, 0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
			
		//
		Sinif sinif3 = new Sinif("1C", "Ana bina 102 nolu sınıf");
		Ogrenci ogrenci6 = new Ogrenci("Bartu", "Emre", 800, 0);
		Ogrenci ogrenci7 = new Ogrenci("Nihal", "Emre", 801, 0);
		Ogrenci ogrenci8 = new Ogrenci("Özgür", "Emre", 802, 0);
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(new Ogrenci("Şafak", "Taş", 803, 0));
		
		//
		// Okul nesnesi oluşturuyoruz
		Okul okul1 = new Okul("Güven İlkokulu", "Çankaya Ankara");
		okul1.okulaSinifEkle(sinif1);
		okul1.okulaSinifEkle(sinif2);
		okul1.okulaSinifEkle(sinif3);
		okul1.siniflariYazdir();
		
//		okul1.okuldanSinifCikar("1B");
//		okul1.siniflariYazdir();
		
		okul1.okuldakiOgrencileriYazdir();
		
		okul1.okuldanSinifCikarIterators("1C");
		okul1.siniflariYazdir();
		
		// 
		System.out.println();
		
		Okul okul2 = new Okul("Atatürk İlkokulu", "Beytepe - Ankara");
		okul2.okulaSinifEkle(new Sinif("1A", "Zemin kat 105 nolu oda"));
		okul2.okulaSinifEkle(new Sinif("1B", "Üçüncü kat 100 nolu oda"));
		
		// 1A sınıfına öğrenci ekleyelim
		Sinif snf = okul2.getSinif("1A");
		if(snf != null) {
			snf.sinifaOgrenciEkle("Tolga", "Kaya", 111, 0);
			snf.sinifaOgrenciEkle("Mustafa", "Kaya", 112, 0);
		}
		else {
			System.out.println("Sınıf bulunamadı");
		}
		
		okul2.okuldakiOgrencileriYazdir();

	}

}
