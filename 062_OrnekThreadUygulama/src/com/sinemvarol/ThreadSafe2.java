package com.sinemvarol;

import java.util.Random;

public class ThreadSafe2 {
	
	private int count = 0;
	
	protected synchronized void uretimTuketim(int degisimSayisi) {
		count += degisimSayisi;
		if (degisimSayisi < 0) {
			System.out.println("Stoktan mal çıkışı gerçekleşti..");
		} else {
			System.out.println("Üretim sonucu stoğa mal girişi gerçekleşti..");
		}
		System.out.println("Güncel stok: " + count);		
	}
	
	private void threadleriCalistir() {
		
		// uretici thread
		Thread ureticiThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("üretici thread çalıştı..");
				
				for (int i = 0; i < 100; i++) {
					Random random = new Random();
					int uretimSayisi = random.nextInt(10);
					uretimTuketim(uretimSayisi);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			System.out.println("üretici thread sonlandı..");	
			}
			
		});
		
		// tuketici thread
		Thread tuketiciThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("tüketici thread çalıştı..");
				
				for (int i = 0; i < 100; i++) {
					Random random = new Random();
					int tuketimSayisi = random.nextInt(5)*-1;
					uretimTuketim(tuketimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("tüketici thread sonlandı..");
			}
			
		});
		
		ureticiThread.start();
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tuketiciThread.start();
		
		try {
			ureticiThread.join();
			tuketiciThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
				
	}

	public static void main(String[] args) {
		ThreadSafe2 main = new ThreadSafe2();
		
		main.threadleriCalistir();	

	}

}
