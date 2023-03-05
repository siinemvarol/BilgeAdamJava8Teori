package com.sinemvarol;

import java.util.Scanner;

public class Main {
	
	public static void hizKontrol(int hiz) throws AsiriHizException {
		if (hiz > 150) {
			throw new AsiriHizException("Çook aşırı hız yapılmak isteniyor!!");
		} else if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor!!");
		} else {
			System.out.println("iyi yolculuklar..");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı girin: ");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
