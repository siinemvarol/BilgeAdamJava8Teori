package com.sinemvarol;

// extends Personel: IdariMemur sınıfı, Personel sınıfının bir alt sınıfıdır
// extend etmek miras almak/kalırımla özelliklerini taşıyor anlamına gelir.
public class IdariMemur extends Personel {

	// gorevi ve telSeriNo Sekreter sınıfına ait özellikler olduğu için kaldı. tüm
	// personelin genel özellikleri değildir.
	private String gorevi;
	private long telSeriNo;

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

}
