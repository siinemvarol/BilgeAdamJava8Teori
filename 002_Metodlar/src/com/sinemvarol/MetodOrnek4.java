package com.sinemvarol;

import java.util.Scanner;

public class MetodOrnek4 {
	
	private static long dikdortgenAlanHesapla(long kisaKenar, long uzunKenar) {
				
		return (kisaKenar*uzunKenar);
	}
	
	private static int kareAlanHesapla() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen karenin kenar uzunluğunu giriniz: ");
		int kenar = input.nextInt();
		return (kenar*kenar);
	}
		

	public static void main(String[] args) {
		// Soru 1 : dikdörtgenin alanını hesaplayan bir metod yazınız
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen uzun kenarı giriniz: ");
//		long inputGirilenUzunKenar = input.nextLong();
//		System.out.println("Lütfen kısa kenarı giriniz: ");
//		long inputGirilenKisaKenar = input.nextLong();
//		System.out.println("Alan: " + dikdortgenAlanHesapla(inputGirilenKisaKenar,inputGirilenUzunKenar));
		
//		System.out.println("Karenin alanı : " + kareAlanHesapla());
		// Soru 2 : n tane kare alanı tutan bir dizi oluşturun. bu dizideki her bir değer için 
		// kullanıcıdan kare kenar uzunluğu alıp alanlarını hesaplayıp dizide saklayın
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kaç tane karenin alanını arrayde tutmak istersiniz? : ");
		int n = input.nextInt();
		System.out.println();
		
		int[] kareAlanlariDizi = new int[n];       // --> { 0, 0, 0, 0... } -> n tane 0 tutuyor arrayde şu anda 
		
		for (int i = 0; i < n; i++) {
			kareAlanlariDizi[i] = kareAlanHesapla();
		}
		
		for (int i = 0; i < kareAlanlariDizi.length; i++) {
			System.out.println((i + 1) + ". karenin alanı: " + kareAlanlariDizi[i]);
		}
		
		
	}

}
