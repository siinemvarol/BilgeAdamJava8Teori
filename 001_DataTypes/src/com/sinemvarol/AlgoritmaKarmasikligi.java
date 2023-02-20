package com.sinemvarol;

public class AlgoritmaKarmasikligi {
	
	public static void main(String[] args) {
		
		int islemAdedi = 100000;
		String metin = "Hello";
		
		// 1. algoritmanın çalışma süresi hesaplanıyor = 4300 milisaniye- 4700 milisaniye arasında çıkıyor
//		long startTime = System.currentTimeMillis();		
//		for(int i = 0; i < islemAdedi; i++) {
//			metin = metin + i;
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("işlem süresi: " + (endTime-startTime) + " milisaniye.");
		
		// 2. algoritmanın çalışma süresi hesaplanıyor = 3 milisaniye - 10 milisaniye arasında çıkıyor
		long startTime = System.currentTimeMillis();
		StringBuilder sB = new StringBuilder();
		sB.append("Hello");
		for (int i=0;i<islemAdedi;i++) {
			sB.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("işlem süresi: " + (endTime-startTime) + " milisaniye.");
	}

}
