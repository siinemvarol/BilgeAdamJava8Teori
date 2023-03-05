package com.sinemvarol;

public class UncheckedExceptionsMain {
	
	// Unchecked exception'ları programcının öngörmesi ve kontrol etmesi gerekir.
	// Java bu tarz exceptionlar üzerinde hata veya uyarı vermez !
	// Bunlar Runtime Exception sınıfından türerler.

	public static void main(String[] args) {
		
		String s = null;
//		System.out.println(s.length());     	//NullPointerException
		
		
		try {
			System.out.println(s.length()); 
		} catch (NullPointerException e) {
			System.out.println("hatayı yakaladık");
			// Loga bu hatayı yaz!!
		}
		
		System.out.println("programın sonu..");


	}

}
