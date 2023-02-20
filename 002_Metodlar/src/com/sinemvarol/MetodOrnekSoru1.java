package com.sinemvarol;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnekSoru1 {

	private static void randomNumber7() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Üst limit girin: ");
		int ustLimit = scanner.nextInt();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int result = 1;
			do {
				result = random.nextInt(ustLimit);
			} while ((result % 7) != 0);
			System.out.println("Sayı " + i + " : " + result);

		}

	}

	public static void main(String[] args) {
		// Rastgele 7'nin katı olan 10 tane tam sayı üreten ve ekrana yazdıran bir metod
		// yazınız.
		// üst limiti parametre olarak kullanıcıdan alın

		randomNumber7();

	}

}
