package com.sinemvarol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOgrenci {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciList = new ArrayList<>();

		// Scanner sınıfı Closeable interface'ini implement ettiği için
		// try-with-resources kullanabiliyorum
		// ( + Scanner bir InputStream ile çalıştığı için tabi ki)
		try (Scanner scanner = new Scanner(new FileReader("liste.txt"))) {
			
			// tüm satırları nasıl okuruz?
			while (scanner.hasNext()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(",");	// Ali Kaya, 111 --> array[0] -> "Ali Kaya" ve array[1] ->> " 111"
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));	// array[1].trim() -> "111"
				ogrenciList.add(ogrenci);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		}
		
		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}

	}

}
