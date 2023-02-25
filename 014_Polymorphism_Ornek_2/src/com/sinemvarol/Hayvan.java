package com.sinemvarol;

public class Hayvan {

	private String ad;
	private int kilosu;
	private int uzunlugu;

	public Hayvan(String ad, int kilosu, int uzunlugu) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
	}

	public void sesCikar() {

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	public int getUzunlugu() {
		return uzunlugu;
	}

	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + "]";
	}

}
