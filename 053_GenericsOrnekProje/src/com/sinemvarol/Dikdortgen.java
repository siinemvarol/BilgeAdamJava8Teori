package com.sinemvarol;

public class Dikdortgen extends Sekil{
	
	private int uzunKenar;
	private int kisaKenar;
	
	public Dikdortgen(int uzunKenar, int kisaKenar) {
		super();
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}
	
	@Override
	public int alanHesapla() {
		// TODO Auto-generated method stub
		return uzunKenar*kisaKenar;
	}		

	public int getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}

	public int getKisaKenar() {
		return kisaKenar;
	}

	public void setKisaKenar(int kisaKenar) {
		this.kisaKenar = kisaKenar;
	}

	@Override
	public String toString() {
		return "Dikdortgen [uzunKenar=" + uzunKenar + ", kisaKenar=" + kisaKenar + "]";
	}

	

}
