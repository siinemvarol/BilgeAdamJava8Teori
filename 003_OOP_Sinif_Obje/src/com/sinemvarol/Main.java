package com.sinemvarol;

public class Main {

	public static void main(String[] args) {
		
		// 1. anahtar nesnesini oluşturuyoruz
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "Mavi";
		anahtar1.no = 10;
		anahtar1.ad = "Benim anahtarım";
		
		System.out.println("Adı: " + anahtar1.ad + " Rengi: " + anahtar1.renk + " No: " + anahtar1.no + " Uzunluk: " + Anahtar.uzunluk);

		// 2. bir anahtar nesnesi oluşturalım
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "Kırmızı";
		anahtar2.no = 12;
		anahtar2.ad = "Kardeşimin anahtarı";
		
		System.out.println("Adı: " + anahtar2.ad + " Rengi: " + anahtar2.renk + " No: " + anahtar2.no + " Uzunluk: " + Anahtar.uzunluk);
		
	//	Anahtar.uzunluk = 20;	// bu cümlede sadece anahtar3'ü değil tü anahtar nesnelerinin uzunluğunu değiştiriyorum
									// Anahtar classında final olarak tanımlandığı için değiştiremiyorum
		// 3. bir anahtar nesnesi oluşturalım
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk = "Yeşil";
		anahtar3.no = 15;
		anahtar3.ad = "Deponun anahtarı";
		
		System.out.println("Adı: " + anahtar3.ad + " Rengi: " + anahtar3.renk + " No: " + anahtar3.no + " Uzunluk: " + Anahtar.uzunluk);
		
		anahtar2.renk = "Sarı";
		System.out.println("Adı: " + anahtar2.ad + " Rengi: " + anahtar2.renk + " No: " + anahtar2.no + " Uzunluk: " + Anahtar.uzunluk);
		
		System.out.println("\n****\n");
		
		// static olan bir metod kullanırken sınıfAdı.metodAdı yazılır.
		Anahtar.uzunluguEkranaYaz();
		
		// non-static bir metod kullanılırken nesneAdı.metodAdı yazılır.
		anahtar1.bilgileriEkranaYaz();
		anahtar2.bilgileriEkranaYaz();
		
		// peki şöyle yazılabilir mi?
		// Anahtar.bilgileriEkranaYaz();  --> hata verir, çünkü bilgileriEkranaYaz() metodu static olmadığı için sınıf adı ile çağırılamaz
											// nesne ası ile çağırılabilir
		System.out.println();
		
		// Nesnelerden oluşan diziler
		//
		int[] sayilarDizisi = { 2, 5, 9, 12 };
		System.out.println(sayilarDizisi[0]);
		for(int i = 0; i < sayilarDizisi.length; i++) {
			System.out.println(sayilarDizisi[i]);
		}
		System.out.println();
		
		Anahtar[] anahtarDizisi = { anahtar1, anahtar2, anahtar3};
		for(int i = 0; i < anahtarDizisi.length; i++) {
			System.out.println(anahtarDizisi[i].ad + " " + anahtarDizisi[i].no + " " + anahtarDizisi[i].renk);
		}
		
		System.out.println();
		
		// yukarıdaki satırı metod kullanarak daha kolay yazdırabiliriz
		for(int i = 0; i < anahtarDizisi.length; i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
		
		System.out.println();
		// yukardakileri for each ile yazdıralım
		for (Anahtar anahtar : anahtarDizisi) {
			anahtar.bilgileriEkranaYaz();
		}
		
		}

}
