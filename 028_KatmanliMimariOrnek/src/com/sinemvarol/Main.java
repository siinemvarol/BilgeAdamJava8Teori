package com.sinemvarol;

import java.util.Scanner;

import com.sinemvarol.controller.OgrenciController;
import com.sinemvarol.controller.OgretmenController;

public class Main {
	
	public static void main(String[] args) {
		
		OgrenciController ogrenciController = new OgrenciController();
		OgretmenController ogretmenController = new OgretmenController();
		
		int secim = 0;
		do {
			System.out.println("\n* * * OKUL BİLGİ SİSTEMİ * * * ");
			System.out.println("1. Öğrenci Ekleme");
			System.out.println("2. Öğrenci Silme");
			System.out.println("3. Öğrenci Bilgileri Güncelleme");
			System.out.println("4. Öğrenci Arama");
			System.out.println("5. Öğrenci Listesini Görüntüleme");
			
			System.out.println("6. Öğretmen Ekleme");
			System.out.println("7. Öğretmen Silme");
			System.out.println("8. Öğretmen Bilgileri Güncelleme");
			System.out.println("9. Öğretmen Arama");
			System.out.println("10. Öğretmen Listesini Görüntüleme");
			System.out.println("11. Çıkış");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Seçiminiz: ");
			secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				ogrenciController.ogrenciEkleme();
				break;
			case 2:
				ogrenciController.ogrenciSil();
				break;
			case 3:
				ogrenciController.ogrenciGuncelle();
				break;
			case 4:
				ogrenciController.ogrenciBul();
				break;
			case 5:
				ogrenciController.ogrenciListesiniGoster();
				break;
			case 6:
				ogretmenController.ogretmenEkleme();
				break;
			case 7:
				ogretmenController.ogretmenSil();
				break;
			case 8:
				ogretmenController.ogretmenGuncelle();
				break;
			case 9:
				ogretmenController.ogretmenBul();
				break;
			case 10:
				ogretmenController.ogretmenListesiniGoster();
				break;

			default:
				break;
			}
					
			
		} while (secim != 11);
	}

}
