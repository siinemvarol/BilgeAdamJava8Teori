package com.sinemvarol;

import java.util.Scanner;

public class Main1 {

	// TRY - CATCH kod bloğu

//	try {
//					// buraya ne yapmak istediğimi yazıyorum
//	} catch (Exception e) {
//		// TODO: handle exception		// hata geldiğinde ne yapmak istediğimi yazıyorum
//	}

	public static void main(String[] args) {

		// 1. BÖLÜM
//		int y = 25/0;					// java.lang.ArithmeticException

		try {
			int y = 25 / 0;
		} catch (Exception e) { 		// Exception ile kesin yakalarım
			System.out.println("sıfıra bölme hatası..");
		}

		try {
			int y = 25 / 0;
		} catch (ArithmeticException e) { 	// türünü biliyorsam ArithmeticException olarak kullanabilirim
			System.out.println("sıfıra bölme hatası..");
		}

		// 2. BÖLÜM
		//
		// Aldığımız exception'ların detayını görmek için printStackTrace metodunu
		// kullanabilirsiniz.
		System.out.println();
		int[] arr = { 1, 2, 3, 4 };
//		System.out.println(arr[4]); 		// java.lang.ArrayIndexOutOfBoundsException

		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) { 		// ya da IndexOutOfBoundsException diyebilirim
			System.out.println("array'in sınırı dışına çıkılma hatası..");
			// Log dosyasına veya veri tabanındaki log tablosuna kayıt açılır.
			e.printStackTrace(); 		// hata metnini yazdırır. gerçekten hata vermez.
			String logaYazilacakMesaj = e.toString();
			System.out.println(logaYazilacakMesaj);
		}
		System.out.println("Hoşça kal!");
		
		// 3. BÖLÜM
		//
		// BİRDEN ÇOK EXCEPTION YAKALAMA
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bolen giriniz: ");
		int bolen = scanner.nextInt();
		
		try {
			int sayi = 25 / bolen;
			int[]array = { 1, 2, 3, 4 };
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırları dışına çıkılıyor..");
		} catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası !");
		} catch (Exception e) {							// tahmin edemediğim bir hatayı yakalamak için en sona Exception ekliyorum
			System.out.println("Tahmin edilemeyen bir hata oluştu!");
			e.printStackTrace();
		}
		System.out.println("\nBye..");

	}

}
