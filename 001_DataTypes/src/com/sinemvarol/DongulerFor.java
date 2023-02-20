package com.sinemvarol;

import java.util.Scanner;

public class DongulerFor {

	public static void main(String[] args) {
		
//		System.out.println("Merhaba 0");
//		System.out.println("Merhaba 1");
//		System.out.println("Merhaba 2");
//		System.out.println("Merhaba 3");
		
		// Bir şeyi n kere yazdıracaksam kaç kere saydığımı kontrol edebilmek için bir değişkene ihtiyacım var
		// O değişken de genelde for döngülerinde i veya j isminde tutulur/kullanılır.
		
		// for loop - for döngüsü
		for (int i=0; i < 4; i++) {
			System.out.println(i);
		}
		
		// int i;  // ambiguity --> Döngülerde kullandığımız sayaç değişken isimlerini kod içinde kullanmamalıyız kafa karışıklığını önlemek için.
		System.out.println("\n* * * *\n");
		
		//Soru
		for (int i=0; i<3; i++); // Hiçbir işe yaramayan döngü oldu
		
		
		for (int i=0; i<3; i++)            // Soldaki blok 3 kere Merhaba 1 kere Dünya yazar. For döngüsünün altındaki satır döngüye girer 
			System.out.println("Merhaba");    // süslü parantez olmasa da
			System.out.println("Dünya");
			
//		int x = 0; 
//		if (x > 1)                                // if bloğuna süslü parantez koyulmadığı için bir alt satırın koşulunu kontrol eder
//			System.out.println("1'den büyük");   
//		System.out.println("0'dan da büyük");       // parantez içinde olmadığı için bu satırın koşulunu kontrol etmez
		
		// sonsuz döngü
//		for (;;) {
//			System.out.println("Merhaba");
//			System.out.println("Dünya");
//		}
			
			// for (int i=0;i<5;i++)
			// Aşağıdaki kod çalışır ama tavsiye edilmez
//			int i=0;
//			for(;i<5;) {
//				System.out.println("Hello " + i);
//				i++;
//			}
			
			// Örnek
			// 1'den 10'a kadar olan sayıların toplamını for ile bulalım
			int toplam = 0;
			for(int i=1; i <= 10; i++) {
				toplam = toplam + i;				
			}
			System.out.println("Toplam: " + toplam);
			
			// Soru
			// 1'den 10'a kadar olan tüm tek sayıları ekrana yazdırın
			
			for (int i =1; i <= 10; i++) {
				if (i%2==1) {
					System.out.println(i);
				}
			}
			// Yukarıdaki örneğin alternatifi
//			for (int i=1; i <= 10; i+=2) {
//				System.out.println(i);
//			}
			
			// Ekrana aşağıdaki şekli çizdiren döngü içeren kodu yazınız
			// ****
			// ****
			// ****
			
			for (int i=1; i <= 12; i++) {
				System.out.print("* ");
				if (i%4==0) {
					System.out.println();
				}
			}
			
			// Soru:
			// Aşağıdaki kodu çalıştırınca kaç kere test yazar? -->> 1 kere yazar. ilk girince 10, ikinciye 11 < 11 koşulunu 
			// sağlamadığı için dönmez ve çıkar
			// Bu şekilde for döngüsü içinde index'i değiştirmek tavsiye edilmez.
			// Eğer kod bloğu içinde indexi (sayacı) değiştirmeniz gereken durumlar oluyorsa "while" veya "do while" 
			// döngülerinden biri kullanılmalıdır.
			for (int i=0;i<11;i++) {
				i = 10;
				System.out.println("test");
			}
			
			// Soru:
			// Kullanıcıdan iki tane sayı alın. Biri başlangıç biri bitiş olsun.
			// Başlangıç ve bitiş sayıları arasında 7'ye bölünebilen sayıları ekrana yazdıralım.
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Lütfen 1-50 arasında bir sayı girin: ");
			int sayi1 = scanner.nextInt();
			
			System.out.println("Lütfen 100'den büyük bir sayı girin: ");
			int sayi2 = scanner.nextInt();
			
			for (int j=sayi1; j < sayi2; j++) {
				if (j%7==0) {
					System.out.println(j);
				}
			}
		

	}

}
