package com.sinemvarol;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma2 {
	
	// hız değeri 120'den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) throws SQLException {

		if (hiz > 120) {
			throw new SQLException();			// SQL exception, checked exception olduğu için
		} else {								// metodun başına ekstra throws yazmamız gerekir
			System.out.println("iyi yolculuklar..");
		}
	}

	public static void main(String[] args) throws SQLException { // throws SQLException ekleyince
																// yine de exception atıp çöküyor
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı girin: ");
		int hiz = scanner.nextInt();
		
		hizKontrol(hiz);



	}

}
