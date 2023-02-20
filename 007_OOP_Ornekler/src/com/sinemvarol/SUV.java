package com.sinemvarol;

public class SUV {

	public String marka;
	public String model;		
	public int yil;				
	public int aracinKm;
	public String cekisSistemi;
	public Motor motor;		
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka: " + this.marka + " - Model: " + this.model + " - Yıl: " + this.yil + " - Km: " + this.aracinKm
				+ " - çekiş sistemi: " + this.cekisSistemi);
		this.motor.motorBilgileriniYazdir();
		System.out.println();
	}
}
