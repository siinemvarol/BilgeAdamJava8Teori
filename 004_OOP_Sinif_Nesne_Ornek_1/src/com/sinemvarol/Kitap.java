package com.sinemvarol;

public class Kitap {
	
	//static değişken
	public static final String tur = "Kitap";
	
	// sınıf üye değişkenleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	int stokMiktari;
	
	public String kitapBilgileriniGetir () {
		String kitapBilgileri = "Ad: " + ad + " Yazar: " + yazarAdi + " Sayfa sayısı: " + sayfaSayisi + " Stok: " + stokMiktari
				+ " Tür: " + Kitap.tur;
		return kitapBilgileri;
	}

}
