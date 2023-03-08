package com.sinemvarol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {
		
	//	ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrencilerListe.bin"))){
			
	//	ogrenciList = (ArrayList<Ogrenci>) inputStream.readObject();
			
			ArrayList<Ogrenci> list = (ArrayList<Ogrenci>) inputStream.readObject();
			
			for (Ogrenci ogr : list) {
				System.out.println(ogr);
			}
			
					
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası..");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Serilization hatası..");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		}
		
		System.out.println("\nmain son satır çalışıyor mu");

	}

}
