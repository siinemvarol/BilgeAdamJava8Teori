package com.sinemvarol;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {
		
		/* WHILE DÖNGÜSÜ
		 * if gibi bir koşul var en başta, bu koşul sağlanırsa döngü döner 
		
		while (condition) {
			// kodlar...
		}              
		
		// for döngüsünden farkı:
		// Koşul içerisindeki kod parçasında koşulun devam edip etmemesi durumunu değiştirebiliriz
		 * 
		// Döngünün devam edip etmeme durumu, döngü içerisinde kod metninde belirlenecekse (ya da değişecekse)
		// while ya da do while kullanılır.
		// Döngü belirli sayıda dönecekse for kullanılır.

		   */
		
//		int sayi1 = 1;
//		while (sayi1<5) {
//			System.out.println(sayi1);
//			sayi1++;
//		}
		
//		boolean alarmDurumu = false;
//		while(alarmDurumu ==false) {
//			//Sensör sıcaklığını kontrol et
//			if (sensorSicaklik >= 70) {
//				alarmDurumu = true;
//			}
//			// 1 sn. bekle kodu
//		}
//		// ALARM VER!!
		
		// Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini hesaplayıp ekrana yazdıran bir kod parçası yazınız
		
		
//		int number = 1;													// soldaki kod bloğunda önce 1'i yazdırıp kodu öyle başlatıyorum
		Scanner scanner = new Scanner(System.in);						// bu istemediğim bir durum. kullanıcıdan aldığım sayıyla başlatmak		
//		while (number != 0) {													// istiyorum.
//			System.out.println(number + " ın karesi: " + number * number);
//			number = scanner.nextInt();
//		}
//		System.err.println("exit");		

//		int number2 = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		
//		while ((number2 = scanner.nextInt()) != 0) {
//			System.out.println("Square of " + number2 + " is: " + number2 * number2 );
//			System.out.println("Please enter a number: ");
//		}
//		System.err.println("exit");
		
		
		// DO WHILE DÖNGÜSÜ
		// while içindeki kısım en az 1 kere mutlaka çalışır, daha sonra koşula göre çalışır...
		/*
		 do {
		     // kodlar
		 } while (condition); 
		 */
		
//		int sayac = 0;
//		do {
//			System.out.println(sayac);
//			sayac++;
//		} while (sayac < 5);
		
		
		// Aşağıdaki soruyu do while ile yapınız
		// Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini hesaplayıp ekrana yazdıran bir kod parçası yazınız
		// 0 ise döngüden çıksın
		
		
		int number3 = 1;
		do {
			System.out.println("Lütfen bir sayı girin: ");
			number3 = scanner.nextInt();
			if (number3 == 0)
				break;
			System.out.println("Girilen sayının karesi: " + number3 * number3);
		} while (number3 != 0);
		System.err.println("exit do while");
				
	}

}
