package com.sinemvarol;

import java.util.Scanner;

public class DiziOrnekleri2 {

	public static void main(String[] args) {
		
		// Soru:
		// Kullanıcı bir sayı girsin. Bu sayının binary olup olmadığını bulan bir program yazınız.
		// Örnek:  10100 --> binary
		// 			123 --> binary değil
		
		// contains ile de alternatif çözümü yaz
		
		System.out.println("Lütfen bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String temp = String.valueOf(number);
		boolean sayiBinaryMi = true;
		
		for(int i = 0; i < temp.length(); i++) {
			char rakam = temp.charAt(i);
			if (rakam == '0' || rakam == '1') {     // eğer 0 ve 1 değerlerini tırnak içine almazsam outputum yanlış çıkıyor
				// hiçbir şey yapma
			}
			else {
				sayiBinaryMi = false;
				break;
			}
		}
		if (sayiBinaryMi) {   // (sayiBinaryMi == true) --> aynı ifade
			System.out.println("sayı binary");
		}
		else {
			System.out.println("sayı binary değil");
		}

	}

}
