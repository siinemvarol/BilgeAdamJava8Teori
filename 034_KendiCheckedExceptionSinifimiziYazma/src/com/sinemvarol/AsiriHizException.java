package com.sinemvarol;

import java.io.IOException;

// Checked Exception sınıflarından birinden türeteceğiz
public class AsiriHizException extends IOException{
	
	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("bu bir checked AsiriHizException'ıdır!!");
	}
	
	

}
