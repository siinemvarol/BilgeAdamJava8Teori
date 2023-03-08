package com.sinemvarol;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	// FileWriter ile sadece text dosyaları yazılabilir
	// write() metodunun içine direkt String verilebilir

	public static void main(String[] args) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter("dosya.txt", true);

			// FileWriter ile dosyay veriyi byte'a çevirmeden direkt String olarak
			// yazabiliriz
			fileWriter.write("Bartu Sungur\n");
			fileWriter.write("Ahmet Ozan");

		} catch (IOException e) {
			System.out.println("Dosya açılırken veya yazarken hata oluştu.");
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu!");
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("bye...");

	}

}
