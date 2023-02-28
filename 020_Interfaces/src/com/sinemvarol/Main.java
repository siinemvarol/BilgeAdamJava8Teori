package com.sinemvarol;

import java.util.ArrayList;
import java.util.List;

public class Main {
		
//	public static void nemGoster(Arzum arzum) {
//		System.out.println(arzum.nemOlc());
//	}
//	
//	public static void nemGoster(Sinbo sinbo) {
//		System.out.println(sinbo.nemOlc());
//	}
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc());
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {		// Interface'lerle polymorphism örneği
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " +tarihSaatGosterenCihaz.saatGoster());
	}
	
	// Interface'ler abstraction (soyutlama) sağlar
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Sinbo();
	//	Arzum termometre = new Arzum(); 	// yukarıdaki yerine bu satırı da yazabilirim. aynı şey
		return termometre;
	}

	public static void main(String[] args) {
		
		Arzum arzum = new Arzum();
//		System.out.println(arzum.sicakligiOlc());
//		
//		ITermometre termometre = new Sinbo();
//		System.out.println(termometre.sicakligiOlc());
		
		Sinbo sinboCihaz = new Sinbo();
//		sinboCihaz.sicakligiOlc();
//		sinboCihaz.nemOlc();				
	//	List<String> myList = new ArrayList<>();
		
		Main.nemGoster(arzum);
		Main.nemGoster(sinboCihaz);
		
		Casio casio = new Casio();
	//	Main.nemGoster(casio);		// hata verir çünkü Casio sinifi INemOlcer interface'ini implement etmiyor !
		
		System.out.println("\n- - - - - \n");
		Main.tarihSaatGoster(casio);
		Main.tarihSaatGoster(arzum);
	//	Main.tarihSaatGoster(sinboCihaz);		// Kullanamayız çünkü sinboCihaz ITarihSaatGoster interface'ini implement etmiyor !
		
		System.out.println("\n- - - - - \n");
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());
		
		

	}

}
