package com.sinemvarol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	private static void printArrayList(List<Kisi> list) {
		System.out.println("\n- - - - - -\n");
		for (Kisi kisi : list) {
			System.out.println(kisi.getAd() + " " + kisi.getSoyad()); // System.out.println(kisi); toString olmadığı
																		// için memorydeki adresini yazar
		}

	}
	
	private static void printList(List<String> list) {
		System.out.println();
		for (String name : list) {
			System.out.println(name); 
																	
		}

	}
	
	private static List<String> listeOlustur() {
//		List<String> lst = new ArrayList<>();
//		lst.add("Ali");
//		lst.add("Veli");
//		return lst;
		
		List<String> lst = new LinkedList<>();
		lst.add("Ali");
		lst.add("Veli");
		return lst;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<String> cars = new ArrayList<String>(); --> java 1.7'ye kadar böyle
		// yazılması gerekiyordu
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println(cars); // System.out.println(cars.toString()); aynı şey

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("- - - - ---------");
		// ArrayList içinde primitive veri tipleri yazılmaz. Bunların yerine onların
		// Wrapper classları yazılır
		// Örn. int yerine Integer, float yerine Float vb.
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(10);
		arrList.add(3);
		System.out.println(arrList);
		arrList.remove(new Integer(7));  // bu listedeki 7 sayısını böyle silebilirim ama deprecated olmuş
		System.out.println(arrList);
		arrList.remove(new Integer(3));
		System.out.println(arrList);

		// ArrayList'ler içinde kendi Nesnelerimizin kullanımı:
		System.out.println();
		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Robert");
		k2.setSoyad("Donovan");
		Kisi k3 = new Kisi("Ali", "Kaya");

		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		Main.printArrayList(list);
		
		// Remove : 2 remove yöntemi vardır. 1. nesne referansini göndeririz ve onu çıkarır. 2. çıkarmak istediğimiz elemanın 
		// indexini göndeririz ve onu çıkarır
		// list.remove(k2);
		list.remove(1);
		Main.printArrayList(list);
		
		// Aşağıdaki List bir interface
		List<Kisi> list2 = new ArrayList<>();
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);
		
		System.out.println();
		// ArrayList'lerde araya eleman ekleme:
		//
		List<String> l = Main.listeOlustur();
		for(String s : l) {
			System.out.println(s);
		}
		l.add(1, "Ayşe");
		System.out.println();
		for(String s : l) {
			System.out.println(s);
		}
		
		// LINKED LIST 
		//
		// ArrayList hızlı random(rastgele) erişim sağlar, dizinin içindeki herhangi bir elemanı sabit sürede getirir.
		// Ancak ArrayList'e araya eleman ekleme veya aradan eleman çıkarma gibi işlemler çok uzun vakit alır.
		
		// LinkedList'lerde ise araya eleman ekleme veya silme ArrayList'lere göre çok daha hızlı olur.
		// Ancak LinkedList'lerde belirli bir indexteki elemana erişim hızında ArrayList'e göre çok yavaş kalır.
		// ( Ancak dizinin içindeki herhangi bir elemanı bulup getirmesi uzun zaman alır.)
		
		System.out.println("\n- - - - - -\n");
		System.out.println(l.get(1));
		
		System.out.println("\n- - - - - -\n");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("John");
		linkedList.add("Barbara");
	//	System.out.println(linkedList);
		
		for (String name : linkedList) {
			System.out.println(name);
		}
		System.out.println("\n- - - - - -\n");
		Main.printList(linkedList);
		Main.printList(cars);
		
		linkedList.remove("John");
		Main.printList(linkedList);
		
		System.out.println(linkedList.get(0));
		
		// LinkedList'te araya eleman ekleme
		linkedList.add(0,"Robert");
		Main.printList(linkedList);
		
		
		
		

	}



}
