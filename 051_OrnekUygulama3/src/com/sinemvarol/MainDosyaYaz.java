package com.sinemvarol;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainDosyaYaz {

	public static void main(String[] args) {
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			
			Otomobil oto1 = new Otomobil("Renault", "Clio", 2011);
			Otomobil oto2 = new Otomobil("Mercedes", "A180", 2012);
			Otomobil oto3 = new Otomobil("Opel", "Insignia", 2021);
			Otomobil oto4 = new Otomobil("Renault", "Clio", 2011);
			
			Motor m1 = new Motor (1111);
			oto1.setMotor(m1);
			
			Motor m2 = new Motor (22222);
			oto2.setMotor(m2);
			
			Motor m3 = new Motor (33333);
			oto3.setMotor(m3);
			
			Motor m4 = new Motor (44444);
			oto4.setMotor(m4);
			
//			out.writeObject(oto1);
//			out.writeObject(oto2);
//			out.writeObject(oto3);
//			out.writeObject(oto4);	
			
			// Otomobil sınıfından nesneleri ArrayList'e atıp serialize edelim			
			ArrayList<Otomobil> otoList = new ArrayList<Otomobil>();
			otoList.add(oto1);
			otoList.add(oto2);
			otoList.add(oto3);
			otoList.add(oto4);
			
			out.writeObject(otoList);
			
			// Bir de öğrenci sınıfından oluşan bir ArrayList yapıp serialize edelim
			Ogrenci ogrenci1 = new Ogrenci("Ali Kaya", 101, "Maden Mühendisliği");
			Ogrenci ogrenci2 = new Ogrenci("Zeynep Kaya", 105, "Maden Mühendisliği");
			Ogrenci ogrenci3 = new Ogrenci("Fatoş Kaya", 108, "Maden Mühendisliği");
			ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
			ogrenciList.add(ogrenci1);
			ogrenciList.add(ogrenci2);
			ogrenciList.add(ogrenci3);
			
			out.writeObject(ogrenciList);
						
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası");
			e.printStackTrace();
		}
		
		System.out.println("Process complete...");

	}

}
