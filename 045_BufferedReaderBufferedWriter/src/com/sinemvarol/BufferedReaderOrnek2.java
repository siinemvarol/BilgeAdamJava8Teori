package com.sinemvarol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciList = new ArrayList<>();

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("liste.txt")))) {

			// scanner.hasNextLine() --> okunacak satır kaldıysa true olur, aksi halde false
			// olur
			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(",");
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		}
		
		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}

	}

}
