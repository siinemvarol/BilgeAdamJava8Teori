package com.sinemvarol;

public class AnkaraKedisi extends Hayvan implements IKuyrukluHayvan {	
	

	public AnkaraKedisi(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("miyav");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("kedi " + this.getAd() + " süt içiyor.");
		
	}

	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd() + " kedisi kuyruk sallıyor..");
		
	}

}
