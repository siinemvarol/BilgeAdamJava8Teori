package com.sinemvarol;

public class Main {
	
	// INHERITANCE
	
	// Inheritance, bir sınıfın üst sınıftan üye özellikleri ve metodları miras almasına denir.
	// Miras aldığı zaman alt sınıf üst sınıfın özelliklerini tıpkı kendisindeymişçesine kullanabilir.
	
	// Alt sınıf türetme hiyerarşik yapıda olur.
	// Bir alt sınıfın türetildiği sınıf, o alt sınıfın üst sınıfı olur.
	
	// Java'da bir alt sınıfın en fazla bir tane üst sınıfı olabilir. (Diğer dillerde bu farklılık gösterir.)
	// Üst sınıfa ata(parent), alt sınıfa ise çocuk (child veya sub class) denir.

	public static void main(String[] args) {
		
		Muhendis muhendis1 = new Muhendis();
		muhendis1.setAd("Ali");
		muhendis1.setSoyad("Özkan");
		muhendis1.setTcKimlik("1112345678");
		muhendis1.setUzmanlikAlani("Elektrik-Elektronik Müh.");		
		System.out.println(muhendis1.getAd() + " " + muhendis1.getSoyad() + " " + muhendis1.getUzmanlikAlani());
		
		IdariMemur idariMemur = new IdariMemur();
		idariMemur.setAd("Zeynep");
		idariMemur.setSoyad("Kaya");
		idariMemur.setGorevi("D.Bşk. Sekreteri");
		idariMemur.setCepTelNo(5071112233L);
		System.out.println(idariMemur.getAd() + " " + idariMemur.getSoyad() + " " + idariMemur.getGorevi() + " " + idariMemur.getCepTelNo());
		
		Muhendis muhendis2 = new Muhendis();
		muhendis2.setAd("Ahmet");
		muhendis2.setSoyad("Çalışkan");
		muhendis2.setUzmanlikAlani("Makine Müh.");
		System.out.println(muhendis2.getAd() + " " + muhendis2.getSoyad() + " " + muhendis2.getUzmanlikAlani());
	
		Muhendis m = new Muhendis();
		
		System.out.println("--------");
		
		Sekreter s = new Sekreter(5321112233L); // önce üst sınıfın constructor'ını sonra kendi constructor'ını çağırır
		
		System.out.println("--------");
		
		Mudur mud = new Mudur(5);

	}

}
