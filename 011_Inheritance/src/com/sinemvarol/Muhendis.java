package com.sinemvarol;

public class Muhendis extends Personel {

	private String uzmanlikAlani;
	
	public Muhendis() {  	// biz yazmasak da bunu jaca otomatik yazıyor ama görmüyoruz
	//	super();			// super, üst sınıfın constructorı (yapıcı metodu) demektir // bu satırı commentlesem bile java kendi koyar
							// biz super() yazmasak da java otomatik olarak görünmez bir super() çağrısı ekler.
	}

	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

}
