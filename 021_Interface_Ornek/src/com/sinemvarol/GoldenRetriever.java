package com.sinemvarol;

public class GoldenRetriever extends Hayvan implements IYirticiHayvan, IKuyrukluHayvan {	

	public GoldenRetriever(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("hav hav hav...");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek " + this.getAd() + " kemik yiyor..");
		
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd() + " isimli golden ret. " + nesne + " ye dişleriyle saldırıyor..");
		
	}

	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd() + " isimli golden ret. kuyruk sallıyor..");
		
	}

}
