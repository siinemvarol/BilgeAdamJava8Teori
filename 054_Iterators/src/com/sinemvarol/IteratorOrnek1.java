package com.sinemvarol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOrnek1 {

	// Iterable interface'ini implemen eden Collection sınıfları istendiğinde bize
	// bir Iterator sağlamakla mükelleftir.

	// Java Iterator, collection sınıfları içindeki elemanlar arasında gezinmemize
	// yarar. En önemli özelliklerinden biri de Collection elemanlarını iteration
	// sırasında remove edebilmeleridir.

	public static void main(String[] args) {
	
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(5);
		listInteger.add(12);
		listInteger.add(24);
		
		Iterator<Integer> iterator = listInteger.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
