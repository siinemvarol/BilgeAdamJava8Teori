package com.sinemvarol;

public class Main {
	
	public static void kisaSureliUc(IUcabilir kus) {
		System.out.println("\n- - - - -\n");
		kus.kanatCirp();
	}
	
	// Polymorphism over inheritance
	public static void hayvan2KezSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		hayvan.sesCikar();
	}
	
	// polymorphism over Interfaces
	public static void yirticiSaldirisi (IYirticiHayvan yirticiHayvan) {
		yirticiHayvan.saldir("tavşan");
	}
	
	public static IYirticiHayvan yirticiHayvanOlustur() {
		IYirticiHayvan yirticiHayvan = new Kartal("Amerikan kartalı", 55, 88);
		return yirticiHayvan;
		
	}
	
	public static void belirtilenSureKadarKuyrukSalla (IKuyrukluHayvan kuyrukluHayvan, int saniye) {
		System.out.println("\n* * * * * *\n");
		for (int i = 0; i < saniye; i++) {
			kuyrukluHayvan.kuyrukSalla();
			try {
				Thread.sleep(1000);			// programı 1000 milisaniye kadar bekletiyor
			} catch (InterruptedException e) {				// try catch kısmını hata verdiği için ekledik
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		// 
		}
	}

	public static void main(String[] args) {
		
	//	IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);	// aşağıdaki yerine boyle de tanımlayabilirim
																				// dezavantajı Guvercin'in özelliklerini kullanamam
																				// IUcabilir olarak tanımlarsam hayvan2KezSesCikarsin(Hayvan)
																				// metodunu tanımlayamıyorum
		Guvercin beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);
	//	Guvercin beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);		
		beyazPacaliGuvercin.gagala("yem");
		
	//	IUcabilir serce = new Serce("Minik Serçe", 1, 8);
		Serce serce = new Serce("Minik Serçe", 1, 8);
		serce.gagala("yem");
		
		AnkaraKedisi kedi = new AnkaraKedisi("Tekir", 5, 40);
		
		Main.kisaSureliUc(beyazPacaliGuvercin);
		Main.kisaSureliUc(serce);
	//	Main.kisaSureliUc(kedi); 	// Çağıramayız çünkü AnkaraKedisi sınıfı IUcabilir interface'ini implement etmiyor
		
		Main.hayvan2KezSesCikarsin(kedi);
		Main.hayvan2KezSesCikarsin(serce);
		Main.hayvan2KezSesCikarsin(beyazPacaliGuvercin);
		
		// Yırtıcı saldırısı
		Kartal kartal = new Kartal("Kara Kartal", 50, 90);
		Main.yirticiSaldirisi(kartal);
		
		GoldenRetriever golden = new GoldenRetriever("Goldie", 30, 120);
		Main.yirticiSaldirisi(golden);
		
		//
		System.out.println("\n- - - - -\n");
		IYirticiHayvan yhayvan = Main.yirticiHayvanOlustur();
		yhayvan.saldir("sincap");
		
		// Kuyruk salla
		Main.belirtilenSureKadarKuyrukSalla(kedi, 7);
		
	}

}
