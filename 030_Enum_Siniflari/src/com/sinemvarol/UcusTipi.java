package com.sinemvarol;

public enum UcusTipi {
	
	// enum olduğu için set metodu tanımlamıyorum. değiştirilmesine izin vermeyeceğim, sabit.

	EKONOMIK(100, "ekonomik uçuş"), 
	OZEL(200, "özel uçuş"),
	VIP(300, "VIP uçuş");

	int tip;
	String metin;

	private UcusTipi(int tip, String metin) {
		this.tip = tip;
		this.metin = metin;
	}

	public int getTip() {
		return tip;
	}

	public String getMetin() {
		return metin;
	}
	
	
}
