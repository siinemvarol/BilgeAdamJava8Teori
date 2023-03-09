package com.sinemvarol;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread çalışıyor..");

		Yazici yaziciThread1 = new Yazici("Yazici Thread-1");
		Yazici yaziciThread2 = new Yazici("Yazici Thread-2");

		yaziciThread1.start();
		yaziciThread2.start();

		try {
			yaziciThread1.join(); // join ile main thread'in, diğer thread'lerin bitmesini beklemesi sağlanır.
			yaziciThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main thread bitti, çıkıyor..");
	}

}
