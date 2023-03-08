package com.sinemvarol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("liste.txt")){
			
			// tüm satırları okuyalım
			int okunan;
			while ( ( okunan = reader.read() ) != -1) {
				char okunanChar = (char) okunan;
				System.out.print(okunanChar);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyayı okurken hata oluştu");
			e.printStackTrace();
		}

	}

}
