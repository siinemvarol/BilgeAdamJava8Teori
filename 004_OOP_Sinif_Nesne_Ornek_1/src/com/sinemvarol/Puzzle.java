package com.sinemvarol;

public class Puzzle {

	public static final String tur = "Oyuncak";

	// sınıf üye değişkenleri
	public String adi;
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;
	
	public String puzzleBilgileriniGetir() {
		String metin = "Ad: " + adi + " Marka: " + marka + " Parça s.: " + parcaSayisi + " stok: " + stokMiktari + " Tür: " + Puzzle.tur;
		return metin;
	}

}
