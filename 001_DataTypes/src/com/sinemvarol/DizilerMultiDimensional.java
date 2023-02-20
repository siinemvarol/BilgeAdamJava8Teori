package com.sinemvarol;

public class DizilerMultiDimensional {

	public static void main(String[] args) {
		
		int[] tekBoyutluDizi1 = new int[4];    // {0, 0, 0, 0}
		int[] tekBoyutluDizi2 = {3, 7, 12, 95, 23};
	
		// Çok boyutlu dizi (matris, matrix)
		int[][] cokBoyutluDizi1 = new int [2][3]; // satır ve sütun sırayla. 2 satırlık ve 3 sütunluk matrix oluşturdum.
													// { {0, 0, 0}, {0, 0, 0}}
		
		// çok boyutlu dizi tanımlamanın ikinci yöntemi: 2 satır 3 sütunlu bir dizi
		int [][] cokBoyutluDizi2 = { {1,2,3},
									 {4,5,6} };
		// int [][] cokBoyutluDizi2 = { {1,2,3}, {4,5,6} };  -->> üst satırdakiyle aynı tanımlama
		
		// Örnek 2: 4 satır, 3 sütunlu bir dizi
		int [][] cokBoyutluDizi3 = { {1,2,3},
				             		 {4,5,6},
				             		 {7,8,9},
				             		 {10,11,12} };
				
		// 0 0 0
		// 0 0 0
		
		cokBoyutluDizi1[0][0] = 1; 
		// 1 0 0
		// 0 0 0
		
		cokBoyutluDizi1[1][2] = 8;
		// 1 0 0
		// 0 0 8
		
		System.out.println(cokBoyutluDizi1[0][0]);
		System.out.println(cokBoyutluDizi1[1][2]);
		System.out.println(cokBoyutluDizi1[0][1]);
		
		// Örnek uygulama
		// Bir sınıf listesi yapalım. İçeriği şu şekilde olsun;
		// sıraNo: ÖğrenciNo:  Ad:       Soyad:
		//   1      101        Ali        Kaya
		//   2      102        Veli        Öz
		//   3      103        Zeynep    Çalışkan
		
		String [][] sinifListesi = new String[3][4];     // 3 satır 4 sütunlu matris (2 boyutlu String dizisi) oluşturdum
		
		// içine kayıtları atalım
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";
		
		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";
		
		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";
		
		
		// Yukarıdaki öğrenci bilgilerini ekrana yazdıralım
		System.out.println("Öğrenci Listesi -- Manuel");
		System.out.println("---------------");
		System.out.println(sinifListesi[0][0] + " " + sinifListesi[0][1] + " " + sinifListesi[0][2] + " " + sinifListesi[0][3]);
		System.out.println(sinifListesi[1][0] + " " + sinifListesi[1][1] + " " + sinifListesi[1][2] + " " + sinifListesi[1][3]);
		System.out.println(sinifListesi[2][0] + " " + sinifListesi[2][1] + " " + sinifListesi[2][2] + " " + sinifListesi[2][3]);
		// Böyle satır satır yazmak çok uzun sürüyor, burada 3 değil 500 kayıt olsaydı ne yapacaktık?
		
		// Çözüm: İç içe for döngüleri
		//
		System.out.println("\nÖğrenci Listesi -- iç içe for loop");
		System.out.println("---------------");
		
		for (int i = 0; i < 3; i++) {						// Satır satır yazdırdığım için ilk döngün satır sayısı kadar dönsün
			for (int j = 0; j < 4; j++) {               		// İkinci döngüm sütun sayısı kadar olmalı, çünkü her bir satırda 
				System.out.print(sinifListesi[i][j] + " "); 		// o satır için sütunları yazdırıyoruz
			}
			System.out.println();
		}
		
		// Code Refining:
		//
		// Burada 3 (satır) ve 4 (sütun) sayılarını kod içine yukarıdaki gibi gömmek doğru değil.
		// Bunun yerine dizilerin length özelliğini kullanalım:
		System.out.println("\nÖğrenci Listesi -- iç içe for loop (code refining)");
		System.out.println("---------------");
		
		for (int satir = 0; satir < sinifListesi.length; satir++) {				// sinifListesi.length satır sayısını verir
			for (int sutun = 0; sutun < sinifListesi[satir].length; sutun++) {   // sinifListesi[satir].length ise satir index numaralı
				System.out.print(sinifListesi[satir][sutun] + " ");					// satırdaki sütun sayısını verir
			}
			System.out.println();
		}			
		
		
		System.out.println("\n***************\n");
		// Ek bilgi:
		// Herhangi bir String ifade içindeki sayıyı primitive veri tipine çevirmek için wrapper (sarmalayıcı)
		// classlar kullanılır
		int siraNo = Integer.parseInt(sinifListesi[0][0]);
		System.out.println(siraNo);
		
		String sayiStr = "12.345";
		double sayi2 = Double.parseDouble(sayiStr);
		System.out.println(sayi2);
		
		String sy = "12.33229";
		float xx = Float.parseFloat(sy);
		System.out.println(xx);
		
		// WRAPPER SINIFLAR
		//        byte    Byte
		//        short    Short
		//        int       Integer
		//        long    Long
		//        float    Float
		//        double    Double
		//        boolean    Boolean
		//        char    Character
		
		// 3 boyutlu array örneği:
		int [][][] dizi3Boyut = new int [3][3][3];
		dizi3Boyut[0][0][0] = 23;
		System.out.println(dizi3Boyut[0][0][0]);		
		
 	}

}
