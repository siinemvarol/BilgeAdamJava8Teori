package com.sinemvarol;

import java.util.Arrays;

public class Mudur extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;

	public Mudur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String makamAdi, long telSeriNo) {
//		this.setAd(ad);
//		this.setSoyad(soyad);
//		this.setTcKimlik(tcKimlik);
//		this.setYas(yas);
//		this.setMaas(maas);
//		this.setKidemBilgisi(kidemBilgisi);
//		this.setCepTelNo(cepTelNo);

		// yukarıdaki satırlar yerine parent class'ın constructor'ını çağırdım
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.makamAdi = makamAdi;
		this.telSeriNo = telSeriNo;

	}
	
	public int getZamKatsayisi() {
		return 5;
	}

	public String getMakamAdi() {
		return makamAdi;
	}

	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	public Muhendis[] getBagliMuhendisler() {
		return bagliMuhendisler;
	}

	public void setBagliMuhendisler(Muhendis[] bagliMuhendisler) {
		this.bagliMuhendisler = bagliMuhendisler;
	}

	@Override
	public String toString() {
		return "Mudur [makamAdi=" + makamAdi + ", telSeriNo=" + telSeriNo + ", bagliMuhendisler="
				+ Arrays.toString(bagliMuhendisler) + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()=" + getMaas()
				+ ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + "]";
	}

}
