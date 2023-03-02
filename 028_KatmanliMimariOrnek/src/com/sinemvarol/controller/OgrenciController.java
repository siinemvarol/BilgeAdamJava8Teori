package com.sinemvarol.controller;

import java.util.Scanner;

import com.sinemvarol.repository.OgrenciRepository;
import com.sinemvarol.repository.entity.Ogrenci;

public class OgrenciController {

	private OgrenciRepository ogrenciRepository;
	
	public OgrenciController() {
		this.ogrenciRepository = new OgrenciRepository();
	}

	public void ogrenciEkleme() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek öğrencinin numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = new Ogrenci(adi, soyadi, id);
		
		this.ogrenciRepository.save(ogrenci);
	}

	public void ogrenciSil() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Silinccek öğrencinin no'sunu giriniz: ");
		int id = scanner.nextInt();
		this.ogrenciRepository.delete(id);
		
	}

	public void ogrenciGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Güncellenecek öğrencinin numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = new Ogrenci(adi,soyadi,id);
		this.ogrenciRepository.update(ogrenci);
		
	}

	public void ogrenciBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğrencinin numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğrenci: ");
		System.out.println(ogrenci);
		
	}

	public void ogrenciListesiniGoster() {
		System.out.println("\n - - - - - - - - - - - - - - ");
		System.out.println("\n - - - ÖĞRENCİ LİSTESİ - - - ");
		System.out.println("\n - - - - - - - - - - - - - - ");
		
		for (Ogrenci ogrenci : this.ogrenciRepository.findAll()) {
			System.out.println(ogrenci);
		}
		
	}

}
