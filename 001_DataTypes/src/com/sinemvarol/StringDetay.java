package com.sinemvarol;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {

//		String text = "merhaba nasılsın";
//		Scanner scanner = new Scanner(System.in);
//		text = scanner.nextLine();
//		System.out.println(text);

		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
		// {'S', 'u', 'b', 'j', 'e', 'c', 't', ' ', 'i', 's', ':', ' ', 'S', 't', 'r',
		// 'i', 'n', 'g'}
		// java stringi yukarıdaki gibi char array'de tutuyor. index dizilimi 0, 1, 2,
		// ...
		// sonuncu elemanın index numarası: arrayde kaç eleman varsa bir eksiğidir.
		String text2 = "Subject is: String";
		String oneCharacter = "a"; // char[] dizi => { 'a' } ->> java bunu bir elemanlı char dizisi (char array)
									// olarak tutar.

		// String en çok kullanılan metodları / fonksiyonları:

		// * * * * * * * *
		// length metodu: text.length () --> textin uzunluğunu int cinsinden verir
		int length = text2.length();
		System.out.println(length);

		// * * * * * * * *
		// charAt metodu: Belirli bir indexteki karakteri döndürür.
		System.out.println("Character at index zero: " + text2.charAt(0));
		System.out.println("Character at index five: " + text2.charAt(5)); // charAt parantezinin içine length ya da 18
																			// yazınca hata
		System.out.println("Last character is: " + text2.charAt(17));
		System.out.println("Last character is: " + text2.charAt(text2.length() - 1)); // textin son karakterini döndürür

		// * * * * * * * * *
		// indexOf metodu: finds the index

		// s harfi nerede geçiyor, hangi indexte?
		System.out.println("where is letter s located firstly: " + text2.indexOf("s"));
		System.out.println("where is letter j located firstly: " + text2.indexOf("j"));
		System.out.println("where is letter z located firstly: " + text2.indexOf("z")); // aradığımız karakter yok ise
																						// -1 döner

		// Text içinde birden fazla harf aramak için
		System.out.println("where is letters ct located firstly: " + text2.indexOf("ct")); // bu bloğun başladığı indexi
																							// döndürür

		// Soru:
		// Metin stringi içinde x harfinin kullanılıp kullanılmadığını bulunuz.

		if (text2.indexOf('x') == -1) {
			System.out.println("x harfi metinde yoktur");
		} else {
			System.out.println("x harfi metnin içinde vardır");
		}

		// i harfi ilk nerede geçiyor
		System.out.println("i harfi ilk nerede geçiyor? : " + text2.indexOf("i"));

		System.out.println("i 10. indexten sonra ilk nerede geçiyor? : " + text2.indexOf("i", 10));

		// Soru:
		// i harfi metnin yarısından itibaren ilk geçtiği yerin indexi
		System.out.println(
				"i harfinin textin yarısından itibaren ilk geçtiği yer: " + text2.indexOf("i", text2.length() / 2));

		// * * * * * * * * *
		// substring metodu: Gets substring of a string
		// substring(baslangic index, bitis index) => başlangıç dahil, bitiş dahil değil

		System.out.println("First five characters of text: " + text2.substring(0, 5)); // 0 dahil, 5 dahil değil. 0, 1,
																						// 2, 3, 4. karakterleri alır

		String text3 = "Bugün Java ile String konusunu işleyeceğiz";

		// Metindeki Java ifadesini substring ile çekin
		System.out.println("text3teki Java ifadesi: " + text3.substring(6, 10));

		// Soru:
		String text4 = "test 1234";
		System.out.println(text4.substring(2, 7)); // 7.indexi almıyor. st 12 yazar

		// substring 2. kullanım şekli
		System.out.println(text4.substring(5)); // 5. indexten başlayıp sonuna kadar yazar

		// * * * * * * * * *
		// trim metodu: bir stringin başındaki ve sonundaki boşlukları (space)
		// siler/kırpar

		String sentence = "  Hello Java  ";
		System.out.println(sentence);
		sentence = sentence.trim(); // bu ifade yerine sadece sentence.trim() yazarsam sentence'ı değiştirmez.
		System.out.println(sentence);

		// Kullanıcı adı şifre yazan uygulamalarda şifre kullanmazsak sorun
		// yaşayabiliriz

		// * * * * * * * * *
		// toUpperCase ve toLowerCase metodu: bir stringin içindeki harflerin case'ini
		// değiştirmeye yarar

		String sentence2 = "Hello Java";
		System.out.println(sentence2.toLowerCase()); // hello java
		System.out.println(sentence2.toUpperCase()); // HELLO JAVA

		// Soru:
		// Aşağıdaki çıktıyı ekrana yazdıran bir döngü yazınız (for loop and string)
		/*
		 *
		 * 
		 * * * * * * * * * * * * * * * * * * * * * *
		 * 
		 */

		// çözüm 1
		String yildiz = "* ";

		for (int i = 1; i < 8; i++) {
			System.out.println(yildiz);
			yildiz = yildiz + "* ";
		}

		// çözüm 2

		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// çözüm 3
		String yildiz2 = "*";
		for (int i = 0; i < 7; i++) {
			System.out.println(yildiz2);
			yildiz2 = yildiz2 + " *";
		}

		// * * * * * * * * *
		// valueOf metodu: converts different Data types to String

		int number = 2233;
		String number2 = String.valueOf(number);
		System.out.println(number2);

		boolean deger1 = true;
		String deger2 = String.valueOf(deger1);
		System.out.println(deger2);

		// * * * * * * * * *
		// equals metodu: converts different Data types to String

//		String userName = "siinemvarol@gmail.com"; // database'de username bu şekilde tutuluyor olsun
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter username: ");
//		String userName2 = scanner.nextLine();
//
//		// Stringlerde == ile karşılaştırma yapılmaz !!!
////		if (userName2 == userName) {                            
////			System.out.println("Username does match");
////		}
////		else {
////			System.out.println("Username does not match");
////		}
//		
//		userName2 = userName2.toLowerCase();
//		userName2 = userName2.trim();
//		
//		// Yukarıdaki iki satır yerine birleştirip yapabilirim:
//		// userName2 = userName2.toLowerCase().trim();
//		
//		if (userName2.equals(userName)) {
//			System.out.println("Username does match");
//		} else {
//			System.out.println("Username does not match");
//		}
		
		// * * * * * * * * *
		// equalsIgnoreCase metodu: metin karşılaştırması yaparken küçük harf büyük harf ayrımını dikkate almaz
		
		String name1 = "vedat";
		String name2 = "Vedat";
		
		if (name1.equalsIgnoreCase(name2)) {                   // equalsIgnoreCase yerine equals kullanırsam isimler eşleşmiyor
			System.out.println("names do match");
		}
		else {
			System.out.println("names do not match");
		}
		
		// * * * * * * * * *
		// replace metodu: değiştirme yapar. büyük harf küçük harf duyarlıdır
		
		String s2 = "Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("ş", "s");
		System.out.println(s3);
		
		// Nerelerde kullanılır?
		
		// 1. kullanım: Kira sözleşmesi örneği		
		String sozlesme = "Ali kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);
		
		// 2. kullanım:
		// web url'lerinde Türkçe karakterlerde sorun çıkabiliyor..
		// Örn. https://www.isbasvuru.com/alikaya iş başvuru.pdf => Sıkıntı çıkar
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		// Boşluk karakteri - ile değiştirilmeli, Türkçe karakterler ingilizce ile değiştirilip sistemde öyle saklanmalı
		dosyaAdi= dosyaAdi.replace(" ", "-").replace("ş", "s");
		System.out.println(dosyaAdi);
		
		// * * * * * * * * *
		// contains metodu: Herhangi bir substringin hedef string içinde var olup olmadığını kontrol eder
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ kelimesi var mı? " + yeniMetin.contains("ağ"));
		System.out.println("tağ kelimesi var mı? " + yeniMetin.contains("tağ"));
		
		if (yeniMetin.contains("yağmur")) {
			System.out.println("Hava durumunda bugün yağmur görünüyor");
		}
		else {
			System.out.println("Bugün yağmur yok");
		}
		
		// * * * * * * * * *
		// startsWith metodu: Bir stringin bir stringle başlayıp başlamadığını kontrol eder
		String ad = "Ali Kaya";
		System.out.println("A var mı? : " + ad.startsWith("A"));    // true
		System.out.println("Ali var mı? : " + ad.startsWith("Ali"));    // true
		System.out.println("li var mı? : " + ad.startsWith("li"));      // false
		String kontrol = "Al";
		System.out.println(ad.startsWith(kontrol));
		
		// * * * * * * * * *
		// split metodu: verilen ifadeye göre stringi böler  [] : dizi (array) simgesi
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";                  //    0      1        2        3        4
		String[] isimler = liste.split(",");      //String dizisi yapar: {"Ali", "Burcu", "Ayşe", "Zeynep", "Kaan"}
		System.out.println(isimler[0]);
		System.out.println(isimler[2]);
		System.out.println(isimler[isimler.length-1]);    // String'te metod iken () var length sonunda. arraylerde yok.
		
		System.out.println("\n---------------\n");
		
//		for(int i=0; i<isimler.length; i++) {
//			System.out.println(isimler[i]);
//		}
		
		System.out.println("\n---------------\n");
		
		//Örnek: öğrenci listesi String olarak tutuluyor olsun. listeyi aytıştırmak istiyorum:
		String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,342";
		String[]ogrencilerArray = ogrencilerStr.split(";");
		System.out.println(ogrencilerArray[0]);
		System.out.println(ogrencilerArray[1]);
		System.out.println(ogrencilerArray[ogrencilerArray.length-1]);
		
		// ilk öğrencinin okul numarasını ekrana yazalım
		// System.out.println(ogrencilerArray[0].split(",")[1]);  // { "Ali Kaya", "123" }
		// ogrencilerArray[0] -->> "Ali Kaya,123"
		
		String[] ogrenciBilgileri = ogrencilerArray[0].split(",");   // ogrenciBilgileri --> { "Ali Kaya" , "123"}
		System.out.println(ogrenciBilgileri[0]);
		System.out.println(ogrenciBilgileri[1]);
		
		// Veli'nin okul numarasını yazdıralım
		String[] ogrenciBilgileriVeli = ogrencilerArray[1].split(",");   //  { "Veli Öz", "222" }
		System.out.println(ogrenciBilgileriVeli[1]);
		int ogrNo = Integer.parseInt(ogrenciBilgileriVeli[1]);
		
		// Veli'nin sadece ismini yazdıralım, soyismini yazdırmayalım
		System.out.println(ogrenciBilgileriVeli[0].split(" ")[0]);
		
		String[] ogrenciVeliIsim = ogrenciBilgileriVeli[0].split(" ");
		System.out.println(ogrenciVeliIsim[0]);
		
		// * * * * * * * * *
		// stringbuilder kullanımı : char arrayleriyle çalıştığı için memoryde stringlere ekleme yapmak yerine daha az yer kaplar
		//
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Merhaba");
		stringBuilder.append(" Dünya");
		stringBuilder.append(" Java!");
		System.out.println(stringBuilder);
		
		Scanner sc = new Scanner(System.in);
		stringBuilder.append(sc.nextLine());
		System.out.println(stringBuilder);
		
		System.out.println("\n---------------\n");
		
		// * * * * * * * * *
		// String Karşılaştırma Konusu - Detay
		//
		String x = "Ali";
		String y = "Veli";
		
		if(x==y) {
			System.out.println("x ve y eşit");
		}
		else {
			System.out.println("x ve y eşit değil");
		}
		
		String z = "Ali";
		if(x==z) {
			System.out.println("x ve z eşit");
		}
		else {
			System.out.println(" x ve z eşit değil");
		}
		
		String w = "Ali ".trim();
		System.out.println(w);
		if(x==w) {
			System.out.println("w ve x eşit");
		}
		else {
			System.out.println(" w ve x eşit değil");
		}
		
		// Çok dikkatli olmak gerekiyor
		// String içerik karşılaştırmada mutlaka equals metodu kullanılmalıdır !!!
		// sınavlarda / mülakatlarda çok sorulan sorulardan biridir.
		System.out.println("\n----------\n");
 		if (w.equals(x)) {
 			System.out.println("eşit");
 		}
 		else {
 			System.out.println("eşit değil");
 		}
		

	} 
}
