package com.sinemvarol;

// POJO Sınıf: Plain Old Java Object
public class Kisi {

	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	
	public Kisi() {
		
	}
	
	public Kisi(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public Kisi(String ad, String soyad, String tcKimlik, int yas, int maas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlik = tcKimlik;
		this.yas = yas;
		this.maas = maas;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", tcKimlik=" + tcKimlik + ", yas=" + yas + ", maas=" + maas
				+ "]";
	}
	
	

}
