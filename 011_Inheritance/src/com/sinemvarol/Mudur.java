package com.sinemvarol;

public class Mudur extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;
	
	public Mudur (int x) {
		super("Test", 10);
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

}
