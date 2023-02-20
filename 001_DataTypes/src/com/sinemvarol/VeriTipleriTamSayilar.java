package com.sinemvarol;

public class VeriTipleriTamSayilar {

	public static void main(String[] args) {
		
		//scope: kapsam

		System.out.print("Hello Java 1");
		System.out.print("Hello Java 2");
		System.out.println("Hello Java 3");
		System.out.print("Hello Java 4");
		
		System.out.println("Hello" + " " + "Java");
		
//		//Değişken tanımlama
		
		// BYTE : 1 byte (8 bitten oluşur)
				
		byte byteValue = 0; // 1 byte.lokal değişken .  sayı olarak en küçük değişken byte'tır
						// camelCasing Ör: networkUdpPort, threadSayisi, maximumSayi, maxTamSayi

		byteValue = 3;
		System.out.println(byteValue); // bir lokal değişkenin ilk değer ataması olmadan ekrana yazdırılmaz	
		
		byte maxURLSayisi = 100;
		
		byte ogrenciSayisi; //Doğru
		//Yanlış tanımlamalar
		//byte ogrenci Sayisi;
		//byte *ogrenciSayisi;
		//byte öğrenciSayısı;
		//byte 1ogrenciSayisi;   ogrenciSayisi1 => dogru
		
		byteValue = 1;
		System.out.println(byteValue);
		
		// 11111111 max 00000000 min 
		//    255      0     max min alabileceği değerlerdi ama negatif tamsayılar da tutuluyor. bu geçerli değil.
		//^: Sign bit. En soldaki bit sign bit (artı mı eksi mi) olarak görev yapar.
		// Sign bit 0 ise pozitif sayıdır. Örn: 00000001 : 1, 00000011 : 3, 01111111 : 127
		// Sign bit 1 ise negatif sayıdır.
		// 10000000 : -128     10000001: -128+1=-127     100000010: -126, 11111111: -1
		// Byte'ın alabileceği değer aralığı: -128 ile 127 arasındadır. -2^7 ile 2^7-1 arasındadır
		byteValue = 127;
		
		// SHORT : 2 byte'lık yer kaplar 10000000 00000000 = -2^15
		// -2^15 ile 2^15-1 aralığında değer alabilir.
		// -32768 ile 32767 arasında değer alabilir.
		short shortValue = 22; 
		short shortValue1 = 30, shortValue2 = 244, shortValue3 = 55;
		
		// Büyük ilkel veritipi = küçük ilkel veritipi diyebiliriz, ancak tersini yapamayız
		shortValue = byteValue; // ok bunu yaabiliyor
		
		// byteValue = shortValue; // Direkt olarak bu şekilde atama yapamayız. sağdakinin değeri daha büyük. casting gerekiyor...
		byteValue = (byte) shortValue; // sağdakinin başına veri tipini yazarsam atama yapmama izin veriyor. çevireceğim short değerinin
										// byte'ın alabileceği değer aralığında olduğundan eminsem yapmalıyım, java hata vermiyor 
										//bana bırakıyor.
		System.out.println(byteValue);
		
		// Peki shortValue 127'den büyük olsaydı ne olurdu?
		shortValue = 129;   // 0000 0000 1000 0001 = 129 ama byte için 1000 0001 = -127 anlamı ifade eder.
							// Yanlış işlem yapmış oluruz. Dolayısıyla byte'ın alabileceği max değerler dışında kullanma.
		byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		//INT : 4 byte (integer)
		// -2^31 ile 2^31 -1 aralığında değer alabilir
		// -2147483648 ile 2147483647 aralığında değer alabilir
		System.out.println(Integer.MIN_VALUE); // Integer : Wrapper class'lar
		System.out.println(Integer.MAX_VALUE); // Integer : Wrapper class'lar
		int intValue = 7;
		int i1, i2, i3;
		i1 = 0;
		i2 = 5;
		
		intValue = shortValue; // yapabilirim çünkü sağdaki short 2 byte ve int 4 byte
		// shortValue = intValue;
		// shortValue = (short) intValue; // intValue, shortValue'nun alabileceği değerler aralığında olmalı
		
		// Byte toplama
		byteValue = 12;
		byte b2;
		// b2 = byteValue + byteValue; yapılamaz hata verir. elde edilecek toplam byte değer aralığında olsa bile. Neden?
		// çünkü java sağ tarafta byte + byte türünde toplama gördüğünde bunun sonucunu otomatik olarak int'e atar
		b2 = (byte)(byteValue + byteValue); // iki byte'ı toplayacaksam cating ile yazdırabilirim ama toplamın byte'ın alabileceği değer
											// aralığında olduğundan emin olmalıyım.
		System.out.println(b2);
		
		short sh1 = 3;
		short sh2 = 2;
		short sh3;
		// sh3 = sh1 + sh2; // iki short'u toplamaya çalışırken hata alırız, casting yapmamız gerekir
							// casting işlemi yaparken java insiyatifi bize bırakır
							//kontrolü bizim sağlamamız gerekir. toplam değer short'un alabileceği değerleri geçmemeli.
		sh3 = (short) (sh1 + sh2); // int'e kadar bu tarz hatalar alınır. int'ten itibaren alınmaz
		System.out.println("sh3: " + sh3);
		
		int x1 = 33;
		int x2 = 44;
		int x3;
		x3 = x1 + x2; //sorun yok!
		System.out.println(x3);
		
		// LONG : 8 BYTE 
		// -2^63 ile 2^63 -1 aralığında değer alır.
		System.out.println("\n\nMin Long Değeri: " + Long.MIN_VALUE);
		System.out.println("Max Long Değeri: " + Long.MAX_VALUE);
		long longValue = 7;
		System.out.println(longValue);
		
		// longValue = 9223372036854775807; // bu aslında long'un alabileceği vir değer ama integer'ın alabileceği değerlerden yüksek 
										// değerleri atayamıyorum. atamaları da java değerine göre yapıyor
										// int'in sınırlarını geçtiğinde hata alıyorum
		longValue = 9223372036854775807L; // sonuna büyük L ya da küçük l harfi yazarak bu long sayısının atamasını yapabilirim
		
		
		//Şu tarz hatalar da olabilir:
		// long myTimer = 372036854775807 * 2; => hatalı çünkü 3 ile başlayan sayı int'in alabileceği değer aralığı dışında
		//Hatayı düzeltmek için L ekleyin
		long myTimer = 372036854775807L *2;
		
		// Şu tip hatalar da olabilir
		int carpan = 100000;
		long carpim = carpan * carpan;
		System.out.println("carpım :" + carpim); // Yanlış sonuç verir. Neden? Sağ taraftaki int sounu burda da yaşandı
		//çözüm:
		//çarpılan sayıların ilkine long tipinde bir sayı eklenirse sağ taraf long olur
		carpim = 1L * carpan * carpan;
		System.out.println("carpım :" + carpim);
		
		//long altçizgi kullannımı. okumayı kolaylaştırmak için altçizgi yapabiliyorum
		long x = 123_234_221L;
		System.out.println("x: " + x);
	}

}
