package com.sinemvarol;

public class VeriTipleriBoolean {

	public static void main(String[] args) {
		
		// BOOLEAN (bool) : en küçük veri tipi. 1 bit yer kaplar. 1 ya da 0 değeri tutuyor. mantıksal bir değer tutuyor. 
		// açık-kapalı, doğru-yanlış, 1-0 şeklinde kullanılır.
		// boolean olarak neler tutulabilir?
		// Örn. bir kullanıcının sistemde aktif olup olmadığı (online-offline), veritabanında bir verinin silinip silinmediği
		
		boolean boolDegisken;
		boolDegisken = true; // true veya false olarak sadece 2 değerden birini alabilir
		System.out.println(boolDegisken);
		
		boolean agirMi = false;  // initialize: (ilk değer verme) değişkeni tanımladığım satırda ona bir değer atıyorsam "initialize"
//		boolean agirMi2;
//		agirMi2 = false; // yukarıda tek satırdaki tanımı iki satır halinde de yapabilirim. aynısı.
		
		int agirlik = 90;
		agirMi = (agirlik >= 85);    //paranteze almak zorunlu değil
		System.out.println("Ağır mı: " + agirMi);     // int agirlik = 84 yapınca false döndürüyor
		
		// == >= <= > < karşılaştırmalarını kullanabilirim
		
		boolean durum = (agirlik==50);
		System.out.println("Durum: " + durum);     //ağırlığım 50 olmadığı için false dönüyor. int agirlik 50 olursa true dönüyor.
		
		// durum = agirlik != 50; bu satırın sonucunu yazdırmak istersem 50 ye eşit olmadığında true olur, 50'ye eşitse false olur
		
		int boy = 180;
		boolean uzunKilolu = (boy >= 180 && agirlik >= 85);
		System.out.println("Şahıs uzun ve kilolu mu? : " + uzunKilolu);
		
		// Soru 
		char cinsiyet = 'K';     // erkek için 'E' de olabilirdi
		if (uzunKilolu && cinsiyet == 'K') {
			System.out.println("Şahıs kadın, uzun ve kiloludur");
		}
		
		// if --> Ternary kullanımı
		// Örnek:
		int yas = 19;
		String deger;
		if (yas >= 18) {
			deger = "Yetişkin";
		}
		else {
			deger = "Yetişkin değil";
		}
		
		// yukardaki işlemin Ternary ile yapılması
		yas = 11;
		deger = yas >= 18 ? "Yetişkin" : "Yetişkin değil";
		System.out.println(deger);
		
		// Microsoft USA'in mülakatında sorduğı sınav sorusu (SWAP numbers question)
		// 3. değişken kullanmadan sayi1 ve sayi2 sayilarının yerlerini değiştirin
		
		int sayi1 = -5;
		int sayi2 = 3;
		
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println("\n\n****************************\n\n");
		
		
		
		int x = 10;
		int y = 3;
		
		int result = x / y;
		System.out.println(result);
		int kalan = x%y;
		System.out.println(kalan);
		
		double res = x / y;         //
		System.out.println("res: " + res);     // küsürat göstemek istemiştim ama göremedim. çünkü eşitliğin sağ tarafı hep int olur
		
		// Çözüm 1:
		// x ve y'yi double yapabilirim,
		double xx = 10;
		double yy = 3;
		res = xx / yy;
		System.out.println("res: " + res);
		
		// Küsüratı azaltıp gösterelim
		String kusurat = String.format("%.3f", res);
		System.out.println("res : " + kusurat);
		
		System.out.println("\n\n------------------------------");
		int sayisalDeger = 4;
		sayisalDeger = sayisalDeger + 1;
		System.out.println("sayısal değer: " + sayisalDeger);
		
		// += ++ -- -= ...
		 
		sayisalDeger += 1;     // sayisalDeger = sayisalDeger + 1; işleminin aynısı
		System.out.println("sayısal değer: " + sayisalDeger);
		
		sayisalDeger ++;      // sayisalDeger = sayisalDeger + 1; işleminin aynısı
		System.out.println("sayısal değer: " + sayisalDeger);
		
		sayisalDeger += 5;
		System.out.println("sayısal değer: " + sayisalDeger);
		
		sayisalDeger--;
		System.out.println("sayısal değer: " + sayisalDeger);
		
		// *= /= %= yukarıdaki mantığa benzer şekilde çalışır....
		
//		int a = 3;
//		int b = a++;     // önce atamayı yapar, sonra ++ işlemini gerçekleştirir. a ++ -> a = a+1
//		System.out.println("a: " + a + " b: " + b);
		
//		int a = 3;
//		int b = ++a;        // önce a:4 olur. sonra b'ye değeri atar yani 4'ü
//		System.out.println("a: " + a + " b: " + b);
		
		int a = 3;
		int b = 4;
		int z = 5;
		// int tpl = a++ + ++b + --z;   // tpl: 3 + 5 + 4=12           a:4    b: 5   z:4
		int tpl = a++ + ++b + --z + b;   // tpl: 3 + 5 + 4 + 5 =17           a:4    b: 5   z:4
		
		System.out.println("tpl : " + tpl);
		
		

	}

}
