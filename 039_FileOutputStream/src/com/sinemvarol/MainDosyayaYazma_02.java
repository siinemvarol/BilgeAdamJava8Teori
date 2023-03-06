package com.sinemvarol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_02 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		// Dosyayı açmak için:
		// 2. yol: FileOutputStream içine parametre olarak String vermek

		try {
			// fileOutputStream = new FileOutputStream("C:\\test3\\dosya.txt"); // istediğim
			// dizine dosya yazdırma
			fileOutputStream = new FileOutputStream("dosya.txt");

			fileOutputStream.write(74); // J
			fileOutputStream.write(65); // A
			fileOutputStream.write(86); // V
			fileOutputStream.write(65); // A
			fileOutputStream.write(10); // NEW LINE
			fileOutputStream.write(72); // H
			fileOutputStream.write(73); // I
			fileOutputStream.write(10); // NEW LINE

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Dosya / dizin bulunamadı");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Dosya yazma hatası");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılması sırasında bir hata oluştu.");
			}
		}
		System.out.println("hoşça kalın..");

	}

}
