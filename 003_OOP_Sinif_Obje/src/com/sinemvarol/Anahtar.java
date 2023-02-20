package com.sinemvarol;

// SINIF : CLASS (TASARIM)
public class Anahtar {
	
	// Sınıf static değişken
	// static özellikler nesneye özgü değil sınıfa özgüdür
	public static final int uzunluk = 10; // bu, benim bütün anahtarlarımın uzunluğu 10 demek. // ...final int tanımlasaydım Main classta değerini değiştiremezdim

	// özellik / üye değişken
	public String renk;
	public int no;
	public String ad;
	
	// static üye metod
	public static void uzunluguEkranaYaz() {
		System.out.println(Anahtar.uzunluk);         //burda parantez içine sadece uzunluk da yazabilirim. Anahtar classı içinde olduğum için.
		
		// static metodlar içinde static olmayan değişkenler kullanılmaz !!
		// System.out.println(renk); --> hata verir çünkü renk static olmayan bir özellik
	}
	
	// non-static (static olmayan) bir üye metod:    // aşağıdaki, anahtar sınıfından üretilen nesnelere yönelik bir metod oldu
	public void bilgileriEkranaYaz() {
		System.out.println("No: " + no + " Adı: " + ad + " Renk: " + renk);
	}
}
