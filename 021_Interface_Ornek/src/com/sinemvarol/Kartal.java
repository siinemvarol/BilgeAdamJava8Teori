package com.sinemvarol;

public class Kartal extends Hayvan implements IUcabilir, IYirticiHayvan {
		

	public Kartal(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı güvercin saniyede 4 kez kanat çırpıyor..");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı kartal kanatlarını yavaşça temizliyor..");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı kartal yırtıcı gagasıyla " + nesne + " gagalıyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("kartal ses cikariyor..");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Kartal " + this.getAd() + " yem yiyor..");
		
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd() + " isimli kartal " + nesne + " ye saldırıyor..");		
	}
	
	

}
