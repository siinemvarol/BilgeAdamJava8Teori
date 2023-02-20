package com.sinemvarol;

public class VeriTipleriOndalikSayilar {

	public static void main(String[] args) {
		
		// FLOAT 4 byte
		// Precision (noktadan sonraki hassasiyet): 7 decimal digits
		// Bilimsel hesaplamalarda kullanırsak veri kaybedebiliriz, sonuç yanlış çıkabilir.
		// memoryde olabildiğince az yer tutup, düşük ondalıklı hesaplar yapmak için kullanılır.
		//Fizikçiler veya kimyacılar, atom molekülle uğraşanlar kullanmaz.
		float floatValue = 1.2f; // sondaki F veya f harfini eklemezsem integer olarak görür ve hata verir
		System.out.println("float value: " + floatValue);
		System.out.println("Float min: " + Float.MIN_VALUE);
		System.out.println("Float max: " + Float.MAX_VALUE);
		
		floatValue = 22;
		System.out.println(floatValue);
		floatValue = 22.4f; // ondalık sayılarda default atama yapıyor sağ taraf değeri double
		
		// DOUBLE 8 BYTE
		// Precision (noktadan sonraki hassasiyet) 15 decimal (ondalık) digits
		double doubleValue = 1.2;
		doubleValue = 23213424344232.234561789097652;
		System.out.println("Double min: "+ Double.MIN_VALUE);
		System.out.println("Double max: "+ Double.MAX_VALUE);
		
		doubleValue = 2345.55778;
		doubleValue = 12.334e8;
		System.out.println(doubleValue);
		
		//Örnek
		doubleValue = 23.123456789;
		floatValue = (float)doubleValue;
		System.out.println(floatValue); // virgülden sonra 6 digit yazdırıyor. çok güvenilir değil 
		
		floatValue = 1.1234567f;
		System.out.println(floatValue);
		
		String kusuratliSayi = String.format("Sayı: %.2f", floatValue);
		System.out.println(kusuratliSayi);
		
		final double PI = 3.14; //başında Final kullanılırsa artık PI değişken olmaz, sabit constant denir.
		final int maxOgrenciSayisi = 24;
		// maxOgrenciSayisi = 55; //yapılamaz çünkü FINAL olarak tanımlandı
		System.out.println(maxOgrenciSayisi);

	}

}
