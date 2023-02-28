package com.sinemvarol;

public class Muhendis extends Personel {

	private String uzmanlikAlani;
	
	// Ek bilgi: Aşağıdaki örnekte boş constructor içinde mutlaka üst sınıfın constructorlarından birinin çağırılması gerekir
	// hangisi olduğu fark etmez. önemli olan ata sınıfın constructor'ının (yapıcı metodunun) çağrılması
	
//	public Muhendis() {  
//		super("ad", "soyad", "tcKimlik", 5, 5, 5, 5334442233L);
//	}
	
	public Muhendis() {  	// biz yazmasak da bunu jaca otomatik yazıyor ama görmüyoruz
	//	super();			// super, üst sınıfın constructorı (yapıcı metodu) demektir // bu satırı commentlesem bile java kendi koyar
							// biz super() yazmasak da java otomatik olarak görünmez bir super() çağrısı ekler.
	}
	
	

	public Muhendis(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo, String uzmanlikAlani) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.uzmanlikAlani = uzmanlikAlani;
	}
		
	public int getZamKatsayisi() {
		return 3;
	}


	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}


	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()=" + getMaas()
				+ ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + "]";
	}


}
