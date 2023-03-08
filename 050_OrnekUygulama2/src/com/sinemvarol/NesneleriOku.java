package com.sinemvarol;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneleriOku {

	public static void main(String[] args) {
		
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			Otomobil oto = null;
			
			while ((oto = (Otomobil) input.readObject())!= null) {
				if (oto != null) {
					System.out.println(oto);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Dosya sonu..");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Serialization hatası");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen hata oluştu!");
		}
		
		System.out.println("son..");

	}

}
