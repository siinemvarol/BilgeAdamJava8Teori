package com.sinemvarol;

public class Kedi extends Hayvan {

	public void sesCikar() {
		System.out.println("miyav..");
	}

	public Kedi(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public String toString() {
		return "Kedi [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu() + "]";
	}

}
