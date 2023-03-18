package com.sinemvarol;

import java.util.concurrent.Semaphore;

public class AgUzerindenDosyaKopyalayici {

	private Semaphore semaphore;

	public AgUzerindenDosyaKopyalayici(int threadSayisi) {
		semaphore = new Semaphore(threadSayisi); // bu semaphore'u kullanan kod bloğuna aynı anda threadSayisi kadar
													// thread girebilir!
	}
	
	public void dosyaKopyalayiciThreadMetodu(String ip) {
		try {
			semaphore.acquire();
			System.out.println("Thread dosya kopyalamaya başlıyor, hedef: " + ip);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread dosya kopyalamayı bitirdi çıkıyor. Hedef IP: " + ip);
		semaphore.release();
	}

}
