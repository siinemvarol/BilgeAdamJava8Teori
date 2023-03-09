package com.sinemvarol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	// Iterator'ların en önemli kullanım alanı döngü içinde istediğimiz elemanı silebilmemizdir.

	public static void main(String[] args) {

		List<Otomobil> cars = new ArrayList<Otomobil>();
		cars.add(new Otomobil("Opel", "Astra", 2011));
		cars.add(new Otomobil("Audi", "A4", 2021));
		cars.add(new Otomobil("BMW", "1.18", 2014));
		cars.add(new Otomobil("Renault", "Megane", 2011));

		// Soru:
		//
		// Audi A4 otomobilini for each döngüsü içinde silmeye çalışalım

//		for (Otomobil oto : cars) {
//			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
//				cars.remove(oto);
//			}
//
//		}	
		
		// yukarıdaki ConcurrentModificationException hatası veriyor
		// yukarıdaki gibi bir for döngüsünde döndüğümüz listenin herhangi bir elemanını
		// silemeyiz
		
		// Iterator'ların en önemli kullanım alanı döngü içinde istediğimiz elemanı silebilmemizdir.
		
		for (Iterator<Otomobil> iterator = cars.iterator(); iterator.hasNext(); ) {
			Otomobil oto = (Otomobil) iterator.next();
			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
				iterator.remove();
			}
		}
		System.out.println(cars);

	}

}
