package com.sinemvarol;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOrnek {
	
	// ListIterator
	/*
	 * next() : ileri
	 * previous() : geri
	 * hasNext() : ileride eleman var mı?
	 * hasPrevious() : geride eleman var mı?
	 * 
	 */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Müjdat");
		list.add("Necip");
		list.add("Serhan");
		System.out.println(list);
		
		// listeyi baştan sona gezmek için:
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println();
		
		// listeyi sondan başa gezelim
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		

	}

}
