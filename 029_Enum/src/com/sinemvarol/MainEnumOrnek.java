package com.sinemvarol;

public class MainEnumOrnek {
	
	// enum'lar bizleri aşağıdaki şekilde tek tek static değişken tanımlama zahmetinden kurtarır
	// enum değerleri static ve final'dır
	
	// enum
	
	// enum'lar değişmez, final'dır
	// enum'lardan nesne türetemeyiz
	
	enum Size {
		LOW,
		MEDIUM,
		HIGH
	}
	
	enum Mevsimler {
		ILKBAHAR,
		YAZ,
		SONBAHAR,
		KIS
	}
	

	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
		

	public static void main(String[] args) {
		
		Size size = Size.HIGH;
		size = Size.MEDIUM;
		System.out.println(size);
		
		for (Size s : Size.values()) {
			System.out.println(s);
		}
		
		// enum'lar nerelerde kullanılır?
		// Değişmez değerlerimiz varsa kullanırız
		// Mesela ilkbahar, yaz, sonbahar, kış
		
		Size beden = size.MEDIUM;
		if (beden == size.MEDIUM) {
			System.out.println("Orta-M beden");
		}
		
		MainEnumOrnek.ekranaYaz(Mevsimler.SONBAHAR);
		
	}

}
