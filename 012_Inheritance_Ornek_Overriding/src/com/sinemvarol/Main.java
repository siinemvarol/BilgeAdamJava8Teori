package com.sinemvarol;

public class Main {
	
	// * * * * METOD OVERLOADING * * * * - METOD AŞIRI YÜKLEMESİ --> inheritance ile alakası yok
	public static int topla(int x, int y) {
		return (x + y);
	}
	public static int topla(int x, int y, int z) {
		return (x+y+z);
	}

	public static void main(String[] args) {

		DaireBaskani daireBaskani = new DaireBaskani("Ali", "Veli", "111223344", 50, 30000, 1, 5331112233L,
				"İnşaat Emlak Daire", 11223L);
		System.out.println(daireBaskani);

		Muhendis m = new Muhendis("Mahmut", "Kara", "121223344", 50, 30000, 1, 5331112233L, "İnşaat Müh.");
		System.out.println(m);
		
		// getZamKatsayisi() metodu --> METOD OVERRIDING işlemi kullanılmıştır.
		System.out.println(m.getAd() + " zam katsayısı: " + m.getZamKatsayisi());
		System.out.println(daireBaskani.getAd() + " zam katsayısı: " + daireBaskani.getZamKatsayisi());
		
		// * * * * METOD OVERLOADING * * * * - METOD AŞIRI YÜKLEMESİ
		System.out.println(Main.topla(2, 3));
		System.out.println(Main.topla(2, 3, 4));

		
		}

}
