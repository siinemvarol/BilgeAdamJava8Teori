package com.sinemvarol.repository.entity;

public class Ogretmen {

	private int tcKimlikNo;
	private String adi;
	private String soyadi;

	public Ogretmen(int tcKimlikNo, String adi, String soyadi) {
		super();
		this.tcKimlikNo = tcKimlikNo;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public int getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "Ogretmen [tcKimlikNo=" + tcKimlikNo + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

}
