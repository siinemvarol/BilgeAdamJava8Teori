package com.sinemvarol;

public class FinallyMain {

	// Finally bloğu içindeki kodlar try-catch statement'ların sonlarında mutlaka
	// çalışır.

	// FINALLY KULLANIMI
	// Dosya kapama, veri tabanı bağlantısı kapama, açık bir network socketini
	// kapama gibi işlemler mutlaka finally kod bloğu içinde yapılır
	// connection.close();      -->> finally içine yazılır genelde

	public static void main(String[] args) {

		try {
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("Bir exception oluştu!");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır..");
		}

		System.out.println("Bye 1!");

		System.out.println("- - - - - ");

		try {
			int y = 5 / 1;
		} catch (Exception e) {
			System.out.println("Bir exception oluştu!");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır..");
		}

		System.out.println("Bye 2!");

		System.out.println("- - - - - ");

		try {
			int z = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("NullPointerException aldık..");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır..");
			// connection.close();
		}

		System.out.println("Bye 3!");

	}

}
