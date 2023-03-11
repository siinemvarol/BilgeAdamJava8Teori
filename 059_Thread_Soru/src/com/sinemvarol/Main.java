package com.sinemvarol;

public class Main {
	
	/* 3 tane farklı thread sınıfı oluşturun
	
	1.sınıf: 0-50 arasında 3'erli saysın
	2.sınıf: 0-50 arasında 5 erli saysın
	3.sınıf: 0-50 arasında 7şerli saysın
	Aralarda 1 sn beklesin her 3 sınıf da.. */
	

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Thread1("Thread-1"));
		Thread thread2 = new Thread(new Thread2("Thread-2"));
		Thread thread3 = new Thread(new Thread3("Thread-3"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted hatası !");
			e.printStackTrace();
		}
		
		System.out.println("Main thread çalışması bitti, çıkıyor..");

	}

}
