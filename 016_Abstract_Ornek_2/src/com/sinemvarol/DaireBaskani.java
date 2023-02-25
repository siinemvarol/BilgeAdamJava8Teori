package com.sinemvarol;

import java.util.Arrays;

// DaireBaskani sınıfı da Personel sınıfının bir alt sınıfıdır (DaireBaskani sınıfı Personel sınıfından türemiştir)
// (Personel sınıfı, DaireBaskani sınıfının super classı'dır)
public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;

	public DaireBaskani(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
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
		return 8;
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

	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}

	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}

	@Override
	public String toString() {
		return "DaireBaskani [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo()
				+ ", getBagliMudurler()=" + Arrays.toString(getBagliMudurler()) + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
