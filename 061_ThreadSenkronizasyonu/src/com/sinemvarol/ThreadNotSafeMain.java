package com.sinemvarol;

public class ThreadNotSafeMain {

	private int count = 0;

	public void threadleriCalistir() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread 1 is over..");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
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

		// bu şekilde çalıştırınca 10000 yazmaz çünkü şu anda senkron çalışmıyorlar
		// count++ ile iki thread de aynı anda count değişkenine erişmeye çalışıyorlar
		// 10000-9156 = 844 farkı bu iki thread'in aynı anda aynı count değerini alıp
		// arttırmaya çalışmış olmalarının sonucudur
		
		// Bu tarz uygulamalara Thread Not Safe denilir.
		// Bunun çözümü senkronizasyon yapmaktır.
		
		System.out.println("Count değişkeninin son değeri: " + count);
	}

	public static void main(String[] args) {

		ThreadNotSafeMain main = new ThreadNotSafeMain();

		main.threadleriCalistir();

	}

}
