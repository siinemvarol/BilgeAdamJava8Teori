package com.sinemvarol;

public class Kopek extends Hayvan {

	public void sesCikar() {
		System.out.println("hav hav hav...");
	}

	public Kopek(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kopek [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu() + "]";
	}

}
