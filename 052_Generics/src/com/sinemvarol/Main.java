package com.sinemvarol;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Generic'ler tasarladığımız sınıfların tek bi sınıf tipi için değil, bir
		// şablon yapısına uyan her tip sınıf için çalışmasını sağlayan yapılardır

		// Aslında biz Generics konusunu Collections framework'te uyguladık
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(5);
		listInteger.add(24);
		listInteger.add(120);
		
		
		List<String> listString = new ArrayList<String>();
		listString.add("Java");
		listString.add("C++");
		listString.add("C#");
		listString.add("Python");
		
		for (String s : listString) {
			System.out.println(s);
		}
			
		
		System.out.println("- - - - - - - - - -");
		
		GenericSinif<Integer> genericSinif = new GenericSinif<Integer>(25);
		System.out.println(genericSinif.getObj());
		
		GenericSinif<String> genericSinif2 = new GenericSinif<String>("Hello Java!");
		System.out.println(genericSinif2.getObj());
		
		Kare k  = new Kare(5);
		GenericSinif<Kare>genericSinif3 = new GenericSinif<Kare>(k);
		int alan = genericSinif3.getObj().alanHesapla();
		System.out.println("Karenin alanı: " + alan);
		
		
	}

}
