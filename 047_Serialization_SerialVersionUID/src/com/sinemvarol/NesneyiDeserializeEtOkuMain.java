package com.sinemvarol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneyiDeserializeEtOkuMain {

	public static void main(String[] args) {
	
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			// yazdığımız sırayla okumalıyız
			Otomobil oto1 = (Otomobil) inputStream.readObject();
			Otomobil oto2 = (Otomobil) inputStream.readObject();
			Otomobil oto3 = (Otomobil) inputStream.readObject();
			
			System.out.println(oto1);
			System.out.println(oto2);
			System.out.println(oto3);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası..");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Serilization hatası..");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		}

	}

}
