package com.sinemvarol;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	
	/*		
	add() / offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.) offer exception atmaz ekleyemezse add atar.
    clear() metodu --------> Kuyruğu Temizler.
    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
    size()------> Kuyruğun içindeki eleman sayısını döner.	    
    
    
     Integer lerde en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
	Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, 
	en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.
	 */

	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>();		// sağ tarafta new Queue<Integer>(); yapamıyorum
																	// Queue'dan değil PriorityQueue'dan obje oluşturabilirim
		queue.offer(5);
		queue.offer(2);
		queue.offer(1);
		queue.offer(100);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.contains(102));
		System.out.println(queue.contains(100));
		
		System.out.println("\n- - - - - ");
		
		// ÖNEMLİ NOT:
		// Queue içinde for each ile dolaşırsanız yanlış sıralama görebilirsiniz.
		for (Integer sayi : queue) {			// bunun yerine -> for (int sayi : queue){ yazabilirim
			System.out.println(sayi);
		}
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman çıkarılıyor: " + queue.poll());
		}
		
		// İÇİNDE KENDİ SINIFLARIMIZI TUTAN PRIORITY QUEUE YAZMA
		Queue<Ogrenci> ogrenciQueue = new PriorityQueue<Ogrenci>();
		ogrenciQueue.offer(new Ogrenci("Ali", 107));
		ogrenciQueue.add(new Ogrenci("Veli", 105));
		ogrenciQueue.offer(new Ogrenci("Zeynep", 101));
		ogrenciQueue.add(new Ogrenci("Kaan", 120));
		
		System.out.println("\n- - - - - ");
		while (!ogrenciQueue.isEmpty()) {
			System.out.println("Eleman çıkarılıyor: " + ogrenciQueue.poll());
		}

	}

}
