package com.sinemvarol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnek1 {

	//

	private static void dosyadanBirSatirOku() {

		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {

			String s = reader.readLine();
			System.out.println(s);

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosyadan okuma hatası!");
			e.printStackTrace();
		}

	}

	private static void dosyaninTamaminiOku() {

		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {

			boolean condition = true;

			while (condition) {
				String s = reader.readLine();
				if (s == null) {
					condition = false;
					break;
				}
				System.out.println(s);
			}

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosyadan okuma hatası!");
			e.printStackTrace();
		}

	}
	
	private static void dosyaninTamaminiOku2() {

		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {

			String s = null;
			
			try {
				while ( ( s = reader.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
					

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadı.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosyadan okuma hatası!");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		dosyadanBirSatirOku();

		System.out.println("- - - - -");
		dosyaninTamaminiOku();
		
		System.out.println("- - - - -");
		dosyaninTamaminiOku2();

	}

}
