package com.sinemvarol;

import java.util.Iterator;

public class Soru2 {

	private static int uceVeyaBeseBolunenSayilar() {
		int sayac = 0;
		for (int i = 34; i <= 97; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		System.out.println();
		return sayac;

	}

	private static int uceVeBeseBolunenSayilar() {
		int sayac = 0;
		for (int i = 34; i <= 97; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		System.out.println();
		return sayac;

	}

	private static int[] uceVeBeseBolunenSayilarinAdediveToplami() {
		int sayac = 0;
		int toplam = 0;
		for (int i = 34; i <= 97; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.print(i + " ");
				sayac++;
				toplam += i;
			}
		}
		System.out.println();
		int[] sonuclar = new int[2];
		sonuclar[0] = sayac;
		sonuclar[1] = toplam;
		return sonuclar;

	}

	public static int[] metod4(int[] sayilar) {
		int sayac = 0;
		int toplam = 0;
		for (int i = sayilar[0]; i <= sayilar[1]; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.print(i + " ");
				sayac++;
				toplam += i;
			}
		}
		System.out.println();

		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi[0] = sayac;
		sonuclarDizisi[1] = toplam;
		return sonuclarDizisi;

	}

	public static void main(String[] args) {

		// Soru 1 :
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e veya 5'e bölünebilen tüm sayıları
		// ekrana yazan bir metod
		// Metod bu aralıktaki 3'e veya 5'e bölünebilen sayıların kaç tane olduğunu
		// return etsin (döndürsün).

		System.out.println("34 ile 97 arasında (34 ve 97 dahil) 3'e veya 5'e bölünebilen tam sayı adedi: "
				+ Soru2.uceVeyaBeseBolunenSayilar());

		System.out.println();

		// Soru 2 :
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e ve 5'e bölünebilen tüm sayıları
		// ekrana yazan bir metod
		// Metod bu aralıktaki 3'e veya 5'e bölünebilen sayıların kaç tane olduğunu
		// return etsin (döndürsün).

		System.out.println("34 ile 97 arasında (34 ve 97 dahil) 3'e ve 5'e bölünebilen tam sayı adedi: "
				+ Soru2.uceVeBeseBolunenSayilar());

		System.out.println();

		// Soru 3:
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e ve 5'e bölünebilen tüm sayıları
		// ekrana yazan bir metod yazınız.
		// metod 3'e ve 5'e bölünen sayıların kaç tane olduğunu ve sayıların toplamını

		// aşağıdaki gibi arrayin değerlerini almadan hatalı yazdırıyor array
		// elemanlarını yazdırmıyor

		int[] dizi;
		dizi = Soru2.uceVeBeseBolunenSayilarinAdediveToplami();

		System.out.println("34 ile 97 arasında (34 ve 97 dahil) 3'e ve 5'e bölünebilen tam sayı adedi ve toplamı: ");
		for (int sayi : dizi) {
			System.out.println(sayi);

//		// Soru 4: inputları bir dizi olarak parametre halinde alınız
//			
			int[] dizi2;
			int[] aralikDizisi = { 34, 97 };
			dizi2 = Soru2.metod4(aralikDizisi);

			System.out.println("\nSoru cevap: ");
			for (int sayi2 : dizi2) {
				System.out.println(sayi2);
//		}
//		
//	}

			}

		}

	}
}
