package com.sinemvarol;

public class ThreadSafeMain {

	private int count = 0;
	
	// synchronized metodları aynı anda sadece bir thread çalıştırabilir
	// Oda-anahtar (kilit) mekanizması gibi düşünelim.
	// Metoda ilk giren thread odayı kitler ve anahtarı alır (lock)
	// Bu şekilde yaptığımız zaman program Thread-Safe olur.
	
	public synchronized void threadlerBurayaSenkronOlarakGirer() {
		count++;
	}

	public void threadleriCalistir() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread 1 is over..");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread 2 is over..");
			}

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Count değişkeninin son değeri: " + count);
	}

	public static void main(String[] args) {

		ThreadSafeMain main = new ThreadSafeMain();

		main.threadleriCalistir();

	}

}
