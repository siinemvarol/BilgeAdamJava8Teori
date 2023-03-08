package com.sinemvarol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	// TRY WITH RESOURCES KULLANIMI

	// Closeable interface'ini implement eden herhangi bir sınıfı try-with-resources
	// kalıbı ile kullanabilirsiniz.
	// Bu şekilde close yapmak için extra bir finally kod bloğu yazmak zorunda
	// kalmayız.

	/*
	 * try(declare resources here){
	 * 
	 * } catch (Exception e) { // exception handling }
	 */

	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("markalar.txt", true)) {

			Scanner scanner = new Scanner(System.in);
			String marka = "";

			// Kullanıcıdan marka girmesini isteyin
			// Kullanıcı -1 girene kadar kullanıcının girdiği markayı markalar.txt dosyasına
			// yazdırın
			while(true) {
				System.out.println("Lütfen bir marka giriniz: ");
				marka = scanner.nextLine();
				
				if (marka.equals("-1")) {
					System.out.println("Programdan çıkılıyor lütfen dosyayı kontrol ediniz...");
					break;
				}
				writer.write(marka + "\n");
			}

		} catch (IOException e) {
			System.out.println("I/O exception aldık");
			e.printStackTrace();
		}

	}

}
