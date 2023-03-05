package com.sinemvarol;

public class CheckedExceptionsMain {

	// Checked exception'lar, direkt Exception sınıfından türerler.
	// Bunlar program compile edilirken yakalanması ve handle edilmesi
	// (ilgilenilmesi) zorunlu exceptionlardır.

	// Bu tarz exceptionlar mutlaka run edilmeden önce try catch blokları içinde
	// handle edilmelidir.
	// Aksi taktirde compile hatası alırsınız, programınızı çalıştıramazsınız (run
	// edemezsiniz).
	
	// NOT: Checked Exception'lar, Runtime Exception'dan türemezler.
	
	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(2);

	}

}
