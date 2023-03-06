package com.sinemvarol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_05 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		// Dosyayı açmak için:
		// 2. yol: FileOutputStream içine parametre olarak String vermek

		try {
			// fileOutputStream = new FileOutputStream("C:\\test3\\dosya.txt"); // istediğim
			// dizine dosya yazdırma
			fileOutputStream = new FileOutputStream("dosya.txt", false); // Dosya mevcutsa içeriğini silmez ekleme yapar
																			// (append)

			// Dosyaya String yazdırma
			// Bunun için bir String oluşturacağız ve
			// oluşturduğumuz Stringi byte array'e dönüştüreceğiz

			String mesaj = "Hello World! \nMerhaba Java";
			byte[] byteArray = mesaj.getBytes();
			fileOutputStream.write(byteArray);

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
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılması sırasında bir hata oluştu.");
			}
		}
		System.out.println("hoşça kalın..");

	}

}
