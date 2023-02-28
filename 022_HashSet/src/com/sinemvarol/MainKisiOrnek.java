package com.sinemvarol;

import java.util.HashSet;

public class MainKisiOrnek {

	public static void main(String[] args) {
		Kisi k1 = new Kisi(1, "Ali");
		Kisi k2 = new Kisi(2, "Veli");
	//	Kisi k3 = new Kisi(3, "Çağrı");

		HashSet<Kisi> hashSetKisi = new HashSet<Kisi>();
		hashSetKisi.add(k1);
		hashSetKisi.add(k2);
		hashSetKisi.add(new Kisi(3, "Çağrı"));

		for (Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		System.out.println("\n- - - - -\n");
		
		Kisi k4 = new Kisi(1, "Ali");
		hashSetKisi.add(k4);
		
		for (Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
//		System.out.println("\n- - - - -\n");
//		
//		Kisi k5 = new Kisi(1, "Veli");
//		hashSetKisi.add(k5);
//		
//		for (Kisi k : hashSetKisi) {
//			System.out.println(k);
//		}
		
		System.out.println("\n- - - - -\n");
		
		// contains test
		Kisi k6 = new Kisi(3, "Çağrı");
		System.out.println(hashSetKisi.contains(k6));
	}

}
