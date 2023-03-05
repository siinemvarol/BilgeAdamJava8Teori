package com.sinemvarol;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		// 4. BÖLÜM
		//
		// BİRDEN ÇOK EXCEPTION YAKALAMA
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bolen giriniz: ");
		int bolen = scanner.nextInt(); 		// burda harf girersem hata veriyor. eğer bu ve alttaki satırı try catch içine
											// alırsam son exception bunu yakalıyor
		String s = null;

		try {
			int sayi = 25 / bolen;
			System.out.println("Heyy ben 21. satırdaki print koduyum..");
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[0]);
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırları dışına çıkılıyor..");
		} catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası !");
		} catch (Exception e) { 		// tahmin edemediğim bir hatayı yakalamak için en sona Exception ekliyorum
			System.out.println("Tahmin edilemeyen bir hata oluştu!");

		}
		System.out.println("\nBye..");

	}

}
