package com.sinemvarol;

public class Main {
	
	// POLYMORPHISM (ÇOK BİÇİMLİLİK)
	//
	// Bir nesne referansının (değişkenin) farklı nesneler gibi davranabilmesidir.
	
	public static void yeniMaasiHesapla(Personel personel) {
		System.out.println(personel.getZamKatsayisi() * personel.getMaas());
		
		// Polymorpghism'de dikkat edilmesi gereken nokta:
		// Sadece üst sınıfların (parent) metodları polimorfik kullanılabilir.
		// personel.getUzmanlikAlani()  --> kullanılamaz çünkü Personel sınıfında boyle bir metod yok ! 
		}
	
	/*
	public static void yeniMaasiHesapla(Muhendis muhendis) {
		System.out.println(muhendis.getZamKatsayisi() * muhendis.getMaas());
	}
	
	public static void yeniMaasiHesapla(Sekreter sekreter) {
		System.out.println(sekreter.getZamKatsayisi() * sekreter.getMaas());
	}
	
	public static void yeniMaasiHesapla(Mudur mudur) {
		System.out.println(mudur.getZamKatsayisi() * mudur.getMaas());
	}
	
	public static void yeniMaasiHesapla(DaireBaskani daireBaskani) {
		System.out.println(daireBaskani.getZamKatsayisi() * daireBaskani.getMaas());
	}
	
	public static void yeniMaasiHesapla(IdariMemur idariMemur) {
		System.out.println(idariMemur.getZamKatsayisi() * idariMemur.getMaas());
	}
		*/

	public static void main(String[] args) {
		
		Muhendis m = new Muhendis("Ali", "Emre", "1111", 42, 32000, 3, 5324445555L, "Yazılım Müh.");
		Main.yeniMaasiHesapla(m);
		
		Sekreter s = new Sekreter("Zeynep", "Taş", "2222", 25, 12000, 7, 5322223344L, 111, 112);
		Main.yeniMaasiHesapla(s);
		
		Mudur mudur = new Mudur("mehmet", "Şentürk", "12345", 33, 23000, 4, 5467564545L, "Planlama md.", 789567L);
		Main.yeniMaasiHesapla(mudur);
		
		IdariMemur idariMemur = new IdariMemur("serhat", "öztürk", "1223344", 23, 13000, 1, 777666444L, "muhasebe uzm.", 9999888L);
		Main.yeniMaasiHesapla(idariMemur);
		
		DaireBaskani daireBaskani = new DaireBaskani("ahmet", "şen", "12333322", 45, 25000, 3, 5554443322L, "strateji daire bşk.", 555444L);
		Main.yeniMaasiHesapla(daireBaskani);
		
		GenelMudur gm = new GenelMudur("Kazım", "Kaya", "11122", 52, 90000, 1, 5325554433L);
		// Main.yeniMaasiHesapla(gm); --> çalışmaz çünkü GenelMudur sınıfı Personel sınıfından türetilmemiştir (extend edilmemiştir)
		
	}

}
