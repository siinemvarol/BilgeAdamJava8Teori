package com.sinemvarol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void dosyadanTekBirByteOkuma() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");

			char c = (char) fileInputStream.read(); // 1 byte'ı int olarak olur. Bunu char'a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.println(c);

			// Dosyanın sonuna ulaşıldığında read() -1 döner
			int okunan = fileInputStream.read();
			// System.out.println(okunan);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (IOException e) {
				System.out.println("Kapatma sırasında hata oluştu!");
				e.printStackTrace();
			}
		}
	}

	public static void dosyaninOrtasindanByteOkuma() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");

			fileInputStream.skipNBytes(8);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

			fileInputStream.skipNBytes(2);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (IOException e) {
				System.out.println("Kapatma sırasında hata oluştu!");
				e.printStackTrace();
			}
		}
	}

	public static void dosyaninTumunuOkuma() {

		FileInputStream fileInputStream = null;

		int okunan;
		String metin = "";

		try {
			fileInputStream = new FileInputStream("dosya.txt");

			while ((okunan = fileInputStream.read()) != -1) {
				metin = metin + (char) okunan;
			}

			System.out.println(metin);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (IOException e) {
				System.out.println("Kapatma sırasında hata oluştu!");
				e.printStackTrace();
			}
		}

	}

	public static void dosyaninBelirtilenKisminiOku(int start, int count) {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");
			fileInputStream.skipNBytes(start - 1);
			for (int i = 0; i < count; i++) {
				System.out.println((char) fileInputStream.read());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (IOException e) {
				System.out.println("Kapatma sırasında hata oluştu!");
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		// dosyadanTekBirByteOkuma();
		// dosyaninOrtasindanByteOkuma();
		dosyaninTumunuOkuma();

		System.out.println("Hoşça kalın");

		// Ödev: Bir metod yazın
		// Bir dosyanın n. karakterinden başlayıp m tane karakter okusun ve ekrana
		// yazdırsın
		// örn. dosyaninBelirtilenKisminiOku(7,3); // 7. karakterden başlayıp 3 karakter
		// okur
		System.out.println("\n- - - - -");
		dosyaninBelirtilenKisminiOku(23,4);
	}

}
