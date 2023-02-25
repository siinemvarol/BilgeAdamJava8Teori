package com.sinemvarol;

public class Main {
	
	public static void hayvani2KezBesle(Hayvan h) {
		h.yemekYe();
		h.yemekYe();
	}
	
	// Şimdiye kadar gördüğümüz sınıflar concrete yani somut sınıflardı.
	//
	// Abstract sınıflar ise soyut sınıflardır.
	// Abstract bir sınıftan new ile nesne (object) oluşturulamaz.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Aşağıdaki örnekte de görüldüğü üzere abstract bir sınıftan nesne oluşturulamaz
		// Hayvan h = new Hayvan("hayvanadi", 5 ,25);			// cannot instentiate the type Hayvan hatası verir
		// h.sesCikar();
		
		Hayvan h = new Kedi ("tekir", 1, 30);
		h.sesCikar();
		h.yemekYe();
		
		Kus kus = new Kus("birdy", 3, 10);
		kus.yemekYe();
		
		//k.sutIc();    --> k bir hayvan olduğu için polimorfik metodları kullanabilirim çünkü
		
		System.out.println();
		
		Main.hayvani2KezBesle(kus);
		Main.hayvani2KezBesle(new Kopek("Tony", 5, 57));
		
		Kedi kedi = new Kedi("Minnos", 3, 30);
		kedi.sutIc();
		
		// Advanced konu: Casting 
		// nesnenin önüne parantez koyarak istediğimiz sınıfa cast ederiz, dönüştürürüz. Ancak burada dikkatli olmalıyız
		// Casting işleminde sorumluluk yazılımcıya ait, Java sorumluluk kabul etmez !
		((Kedi)h).sutIc();
		Kedi k = (Kedi) h;
		k.sutIc();
		
		Hayvan h2 = new Kopek("Lassie", 8, 77);
		Kedi ke = (Kedi)h2;
	//	ke.sutIc();		// java.lang.ClassCastException hatası verir. bkz. aşağıdaki satır
	//	((Kedi)h2).sutIc();  // --> bu işlem runtime exception/hata verir, çünkü h2 nesnesi aslında Kopek sınıfından bir nesne
							// Biz bu kopek nesnesini Kedi'ye cast ederek hatalı bir işlem yapmış oluyoruz..
				
		
	}

}
