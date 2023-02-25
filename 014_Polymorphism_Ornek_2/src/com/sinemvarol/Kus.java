package com.sinemvarol;

public class Kus extends Hayvan {

	public void sesCikar() {
		System.out.println("cik cik cik...");
	}

	public Kus(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kus [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu() + "]";
	}

}
