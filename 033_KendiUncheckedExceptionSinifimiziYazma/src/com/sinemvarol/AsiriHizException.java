package com.sinemvarol;

// Unchecked Exception sınıflarından birinden türetiyoruz
public class AsiriHizException extends ArithmeticException {
	
	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız Unchecked Exception'ıdır. Yüksek hız tespit edildi!");
	}

	
	
	
	
}
