package com.sinemvarol;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread çalışıyor..");

		Yazici yaziciThread1 = new Yazici("Yazici Thread-1");
		Yazici2 yaziciThread2 = new Yazici2("Yazici Thread-2");

		yaziciThread1.start();
		yaziciThread2.start();

		try {
			yaziciThread1.join();
			yaziciThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main thread bitti, çıkıyor..");
	}

}
