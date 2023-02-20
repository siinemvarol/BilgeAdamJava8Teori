package com.alikaya;

public class Paralelkenar {
	
	// Access modifiers for member variables:
	// public: Tüm paketlerden erişilebilir ve kullanılabilir
	// protected: Sadece aynı paket içindeki sınıflardan erişim olabilir, farklı paketlerden erişilemez. (hiçbir şey yazmassam protected olur)
	// private: sadece bulunduğu sınıf (class) içinden erişilebilir
	// default (boş bırakmak): Hiçbir şey yazmazsak protected gibi davranır.
	
	int kenarKisa;
	int kenarUzun;
	
	private String isim;
	
	private String getIsim() {
		return isim;
	}
	
	public static void main(String[] args) {
		
		Paralelkenar paralelKenar2 = new Paralelkenar();
		paralelKenar2.isim = "Benim paralelkenarım";  // aynı class içinde olduğu için "isim" değişkenine erişebiliyorum
		System.out.println(paralelKenar2.getIsim());

	}

}
