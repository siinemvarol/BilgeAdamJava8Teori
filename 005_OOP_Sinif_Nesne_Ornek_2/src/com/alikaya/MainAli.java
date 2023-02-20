package com.alikaya;

public class MainAli {

	public static void main(String[] args) {
		
		Paralelkenar paralelKenar1 = new Paralelkenar();
		paralelKenar1.kenarKisa = 27;
		paralelKenar1.kenarUzun = 40;
		// paralelKenar1.isim = "Benim paralelkenarım";   // --> erişilemez, private tanımlanmış. "Paralelkenar.isim is not visible" diyor
		// paralelKenar1.getIsim(); --> erişilemez çünkü private tanımlanmış
		
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 = 7;
		ucgen1.kenar2 = 8;
		ucgen1.kenar3 = 9;
		System.out.println("Üçgen1 çevresi: " + ucgen1.ucgenCevresi());
		
		Ucgen ucgen2 = new Ucgen();
		ucgen2.kenar1 = 30;
		ucgen2.kenar2 = 40;
		ucgen2.kenar3 = 50;
		System.out.println("Üçgen2 çevresi: " + ucgen2.ucgenCevresi());
		
		System.out.println("Üçgen1 kenarlar-> kenar1: " + ucgen1.kenar1 + " kenar2: " + ucgen1.kenar2 + " kenar3: " + ucgen1.kenar3 );
		ucgen1.kenarlariUzat(10);
		System.out.println("Üçgen1 kenarlar-> kenar1: " + ucgen1.kenar1 + " kenar2: " + ucgen1.kenar2 + " kenar3: " + ucgen1.kenar3 );
		
		//Daire
		Daire daire1 = new Daire();
		daire1.yaricap = 10;
		// daire1.cap = 20; --> cap private olduğu için "is not visible" diye hata veriyor
		daire1.xx = 4;
		

	}

}
