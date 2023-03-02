package com.sinemvarol.controller;

import java.util.Scanner;

import com.sinemvarol.repository.OgretmenRepository;
import com.sinemvarol.repository.entity.Ogrenci;
import com.sinemvarol.repository.entity.Ogretmen;

public class OgretmenController {

	private OgretmenRepository ogretmenRepository;

	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}

	public void ogretmenEkleme() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek öğretmenin TC no giriniz: ");
		int tcKimlikNo = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(tcKimlikNo, adi, soyadi);

		this.ogretmenRepository.save(ogretmen);

	}

	public void ogretmenSil() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Silinecek öğretmenin TC Kimlik No'sunu giriniz: ");
		int tcKimlikNo = scanner.nextInt();
		this.ogretmenRepository.delete(tcKimlikNo);
		
	}

	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin TC Kimlik Numarasını giriniz: ");
		int tcKimlikNo = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(tcKimlikNo,adi,soyadi);
		this.ogretmenRepository.update(ogretmen);
		
	}

	public void ogretmenBul() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğretmenin TC Kimlik Numarasını giriniz: ");
		int tcKimlikNo = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(tcKimlikNo);
		System.out.println("\nBilgilerini görmek istediğiniz öğretmen: ");
		System.out.println(ogretmen);
		
	}

	public void ogretmenListesiniGoster() {
		System.out.println("\n - - - - - - - - - - - - - - ");
		System.out.println("\n - - - ÖĞRETMEN LİSTESİ - - - ");
		System.out.println("\n - - - - - - - - - - - - - - ");
		
		for (Ogretmen ogretmen : this.ogretmenRepository.findAll()) {
			System.out.println(ogretmen);
		}
		
	}

}
