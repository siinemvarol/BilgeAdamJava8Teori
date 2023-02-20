package com.sinemvarol;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	// Metodlar - Fonksiyonlar
	
	// public: Access Modifier (erişim belirleyici)  // public: Bütün package'lar kullanabilir
													// protected: Sadece aynı package içi kullanım sağlar
													// private: Sadece sınıf içi kullanım sağlar.
	
	// static: (zorunlu değil) static metodların hepsi program çalışır çalışmaz memoryde adreslenir ve değişmez
				// static olmasa idi, adres nesne oluşunca oluşacaktı
	
	// final: (zorunlu değil): metodun başında final yazılırsa o metod override edilemez demektir
				// final keyword'ü sınıfın başına gelirse o sınıftan yeni sınıf türetilemez demektir
				// final'ı daha çok değişkenlerde kullanırız mesela
	final static double PI = 3.14;
	final static int DUNYA_YARICAP = 40000;
	
	// Return type: Zorunludur. Hiçbir şey return etmeyecekse (döndürmeyecekse) void yazılmalıdır.
	
	// hello: Metod ismi yazılmak zorundadır.
	
	// Parantezler: (hello'dan sonraki parantezler) parantezler içine isterseniz parametre(ler) yazabilirsiniz (opsiyonel)
	// Aşağıdaki hello() örneğinde parametre yok.
	
	// { } : metodun içeriğini (code body) süslü parantezler içerisine yazmamız gerekir.
	
	public static final void hello() {
		System.out.println("hello from hello method in Main.java");
	}
	
	// Örnek metod:
	//
	// parametreli metod
	//
	// Bir sayının karesini hesaplayıp return etsin
	private static int kareAl(int sayi) {
		int sonuc = sayi * sayi;				// mesela burada sonuç int tipinde local bir değişkendir.
		return sonuc;							// Local değişkenlerin scope'u sadece tanımlandığı metod içindedir.
	}
	
	// Örnek metod 2:
	//
	// Random sayı üreten bir metod yazalım
	public static int randomNumber() {
		Random random = new Random();
		int result = random.nextInt(100);  // 0'dan 100'e kadar üretmek için 100 yazdık
		return result;
	}
	
	// Örnek metod 3:
	//
	// Peki üst limiti parametre olarak alan ve üst limite kadar random bir sayı belirleyen metodu yazalım
	// Method OVERLOADING: metod aşırı yüklenmesi
	
	public static int randomNumber(int ustLimit) { // java'da aynı metod ismi kullanabiliriz ama parametreleri farklı olmalıdır örnekteki gibi
		Random random = new Random();
		int result = random.nextInt(ustLimit); 
		return result;
	}
	
	// Aşağıdaki işlem yanlıştır
//	public static void randomNumber (int ustLimit) {   	// return type'ı önemli değil. hata veriyor: "Duplicate method randomNumber(int) in type Main"
//		System.out.println("hello");
//	}
	
	
//	// Aşağıdaki işlem yanlıştır
//	public static int randomNumber(int uLimit) {     // int yerine String vb. olsa hata vermez ama int olarak 2 tane tanımlayamam
//		Random random = new Random();
//		int result = random.nextInt(uLimit); 
//		return result;
//	}
	
//	// Aşağıdaki işlem yanlıştır
//	public static int randomNumber(int ustL) {     // overloading olmaz hata verir. sadece parametre ismini değiştirdim ustLimit iken ustL yaptım.
//		Random random = new Random();
//		int result = random.nextInt(ustL); 
//		return result;
//	}	
	
	 // Not: Aşağıdaki metod overloading değildir ! ismi farklı olduğu için farklı bir metottur.
	public static int rastgeleSayiUret(int ustLimit) { 
		Random random = new Random();
		int result = random.nextInt(ustLimit); 
		return result;
	}
	
	private static int randomNumberV3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen alt limit giriniz: ");
		int altLimit = scanner.nextInt();
		System.out.println("Lütfen üst limit giriniz: ");
		int ustLimit = scanner.nextInt();
		
		Random random = new Random();
		// çözüm 1
		//int result = random.nextInt(altLimit, ustLimit); 
		// çözüm 2
		int result1 = random.nextInt(ustLimit - altLimit) + altLimit;		// 300-1000 arası bir sayı üretmesini istiyorum. 
		return result1;													// (0-700 arasında random bir sayı) + 300 olarak bulabilirim
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(PI);	
						
		System.out.println("Merhaba");
		
		Main.hello();                          // bunun yerine hello() ile de çağırabilirim
												// aynı class içindeki static metodları çağırmak için uzun uzun package 
												// ya da class ismi yazmak zorunlu değil
		
		
		com.alikaya.YardimciSinif.hello(); 			// farklı paketten çağırırken bunu kullanmam lazım
													// ya da com.alikaya silip package'ı import edicem
		java.util.Scanner sc;						// Scanner scanner; yerine soldaki kullanılabilir
													// ya da java.util silip onun yerine import edebilirim
		
		// eğer YardimciSinif içindeki hello() metodu private veya protected olsa idi ona ulaşamazdık ve çağıramazdık	
		
		// com.alikaya.YardimciSinif.hello2(); bu metodu çağıramam çünkü protected tanımlandı başka package'da
		
		// com.alikaya.YardimciSinif.hello3(); not visible hatası veriyor private metod olduğu için
		
	
		int matSonuc = Main.kareAl(5);
		System.out.println("matSonuc: " + matSonuc);
		
		System.out.println("Random bir sayı 1 : " + Main.randomNumber());      // bu classtaki metodu bu satır ve aşağıdaki gibi çağırabilirim
		System.out.println("Random bir sayı 2 : " + randomNumber());
		
		int randomSayi3 = Main.randomNumber();
		System.out.println("Random bir sayı 3 : " + randomSayi3);
		
		// Peki üst limiti parametre olarak alan ve üst limite kadar random bir sayı belirleyen metodu yazalım
		System.out.println("Random sayı v.2 : " + Main.randomNumber(1000));
		
		System.out.println("\nHoşça kalın..");
		
		// DUNYA_YARICAP = 200;    --> final olan bir değişken değiştirilemez. her zaman ilk değeri kullanılır.
		
		
		// Bir local değişkenin scope'u tanımlandığı süslü parantezler içindedir
		{
			int x2 = 5;
			System.out.println("x2: " + x2);
		}
		
		// System.out.println(x2);  // cannot be resolved to a variable hatası veriyor. bu değişkeni bulamıyor. 
									// bir önceki parantez içinde tanımlandığı için ulaşamıyor
		
		// Soru
		// Kullanıcının girdiği alt ve üst limitler arasında random bir sayı üretip return eden bir metod
		
		System.out.println(randomNumberV3());
		
		// Soru
		// Main içinde kullanıcıdan bir String alalım ve bu Stringin tekrarlanma sayısını (tamsayı) alın.
		// Aldığımız bu iki değeri tekrarla isimli bir metoda gönderelim, metod gönderdiğimiz metni tekrar sayısı kadar ekrana yazsın
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime girin: ");
		String kelime = scanner.nextLine();
		System.out.println("Tekrar sayısı girin: ");
		int tekrarSayisi = scanner.nextInt();
		metniTekrarla(kelime,tekrarSayisi);
	}

	private static void metniTekrarla(String kelime1, int tekrarSayisi1) {
		for (int i = 0; i < tekrarSayisi1; i++) {
			System.out.println(kelime1);
		}
		
	}

}
