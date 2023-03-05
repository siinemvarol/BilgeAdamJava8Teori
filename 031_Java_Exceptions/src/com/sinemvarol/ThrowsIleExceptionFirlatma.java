package com.sinemvarol;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {
	
	// hız değeri 120'den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) throws SQLException {

		if (hiz > 120) {
			throw new SQLException();			// SQL exception, checked exception olduğu için
		} else {								// metodun başına ekstra throws yazmamız gerekir
			System.out.println("iyi yolculuklar..");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı girin: ");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("Çok hızlı gidiyorsun, hızını azalt!");
		//	e.printStackTrace();
		}



	}

}
