package com.sinemvarol;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ali", 1123, "Bilgisayar Mühendisliği");
		Ogrenci ogrenci2 = new Ogrenci("Zeynep", 1523, "Elektronik Mühendisliği");
		Ogrenci ogrenci3 = new Ogrenci("Fatma", 1123, "Maden Mühendisliği");
		Ogrenci ogrenci4 = new Ogrenci("Kaan", 1123, "Matematik Mühendisliği");
		Ogrenci ogrenci5 = new Ogrenci("Batuhan", 1123, "Bilgisayar Mühendisliği");
		
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		ogrenciList.add(ogrenci4);
		ogrenciList.add(ogrenci5);
						
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrencilerListe.bin"))){
			
			out.writeObject(ogrenciList);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazılamadı!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen hata!");
			e.printStackTrace();
		}
		System.out.println("arrayList ve içindeki Ogrenci nesneleri dosyaya yazıldı");

	}

}
