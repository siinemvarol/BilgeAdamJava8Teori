package com.sinemvarol;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread çalışıyor..");

		Thread yazici1 = new Thread(new Yazici("Printer-1")); // thread'in içine Runnable sınıfını implement eden
																// herhangi bir sınıf verebilirsin
		Thread yazici2 = new Thread(new Yazici("Printer-2"));
		
		yazici1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		yazici2.start();
		
		try {
			yazici1.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted hatası !");
			e.printStackTrace();
		}
		
		System.out.println("Main thread çalışması bitti, çıkıyor..");

	}

}
