package com.sinemvarol;

import java.util.Scanner;

public class Main {

	public static void hizKontrol(int hiz) {
		if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor!!");
		} else {
			System.out.println("iyi yolculuklar..");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı girin: ");
		int hiz = scanner.nextInt();
		
//		Main.hizKontrol(hiz);		// try-checked içine almazsam program çöker.
		
		try {
			Main.hizKontrol(hiz);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Bye..");
		
	}

}
