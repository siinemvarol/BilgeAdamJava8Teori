package com.sinemvarol;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {

	// hız değeri 120'den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) {

		if (hiz > 120) {
			throw new ArithmeticException();			// unchecked exception
		} else {
			System.out.println("iyi yolculuklar..");
			// arabanın hızını parametre olarak gelen değere yükselt..
			// veya sıcaklıkla ilgili işlemlerinizi yapın..
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı girin: ");
		int hiz = scanner.nextInt();

		//
//		hizKontrol(hiz);

		//
		// Throw ile atılan exceptionlarda try-catch yazmayabiliriz ama bu durumda
		// exception yenilebilir ve program çöker.
		try {
			hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsun, lütfen hızını azalt !");
		}
		System.out.println("Hoşça kal!");

	}

}
