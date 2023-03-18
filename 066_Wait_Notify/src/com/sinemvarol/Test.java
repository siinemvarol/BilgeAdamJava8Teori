package com.sinemvarol;

import java.util.Scanner;

public class Test {

	private Object lock = new Object();

	public void thread1Metod() {

		synchronized (lock) {
			System.out.println("Thread1 is running..");
			System.out.println("Thread1 waits..");

			// wait() ile diyoruz ki ben uyuyacağım lock'ı bırakabilirim, isteyen alabilir
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// işlemler ...
			System.out.println("Thread1 is awake and continues..");
		}
	}
	
	public void thread2Metod() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		synchronized (lock) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Thread2 is running..");
			System.out.println("Lütfen bir sayı girin: ");
			scanner.nextInt();
			lock.notify();
			System.out.println("Thread2 quits..");

		}
	}

}
