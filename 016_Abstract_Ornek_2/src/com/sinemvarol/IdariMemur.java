package com.sinemvarol;

// extends Personel: IdariMemur sınıfı, Personel sınıfının bir alt sınıfıdır
// extend etmek miras almak/kalırımla özelliklerini taşıyor anlamına gelir.
public final class IdariMemur extends Personel {

	// gorevi ve telSeriNo Sekreter sınıfına ait özellikler olduğu için kaldı. tüm
	// personelin genel özellikleri değildir.
	private String gorevi;
	private long telSeriNo;
	
	public IdariMemur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo, String gorevi, long telSeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.gorevi = gorevi;
		this.telSeriNo = telSeriNo;
	}
	
	public int getZamKatsayisi() {
		return 2;
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	@Override
	public String toString() {
		return "IdariMemur [gorevi=" + gorevi + ", telSeriNo=" + telSeriNo + ", getAd()=" + getAd() + ", getSoyad()="
				+ getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()="
				+ getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + "]";
	}
	

}
