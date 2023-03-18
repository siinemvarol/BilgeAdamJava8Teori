package com.sinemvarol;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock {

	Random random = new Random();

	// ArrayBlockingQueue: içindeki multi-locklar sayesinde thread-safe bir yapıdır
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); // (capacity): bu queue'da max capacity kadar
																		// eleman tutulabilir
	
	// produce() metodu random bir sayı üretip queue'ya ekleyecek
	
	public void produce() {
		
		while(true) {
			Integer value = random.nextInt(1000);
			
			try {
				queue.put(value);
				System.out.println("Producer stoğa mal ekliyor..: " + value);
				System.out.println("Stoğun güncel size: " + queue.size());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	// consumer() stoktan integer değer çekip tüketir
	public void consume() {
		
		while(true) {
			try {
				Thread.sleep(3000);
				
				Integer value;
				value = queue.take();	// take() ile kuyruğum başındaki elemanı alıyorum
				System.out.println("--- Consumer stoktan mal tüketiyor: " + value);
				System.out.println("Stoğun güncel size: " + queue.size());
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
