package com.sinemvarol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	// HashSet'ler Java'da elemanlara random olarak çok hızlı bir şekilde erişmek
	// için kullanılan veri yapılarıdır. (indexing yok)
	// Hızlı olmasının nedeni elemanlara erişirken hash kodlarının kullanılmasıdır.
	// Hash code sayesinde herhangi bir input elemanı unique olarak tanımlanabilir.
	// ÖNEMLİ !!
	// HashSet aynı elemanı barındırmaz.

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>(); // sondaki üçgen parantez içine String yazmam gerekmiyor artık
		hashSet.add("Kus");
		hashSet.add("Kedi");
		hashSet.add("Kopek");
		hashSet.add("Kus"); // aynı elemandan iki tane olamaz ! Bunu hashSet'e ayrı bir eleman olarak
							// almıyor

		System.out.println("HashSet: ");
		for (String s : hashSet) {
			System.out.println(s);
		}

		// ARRAYLIST'DEN FARKI
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Kus");
		arrayList.add("Kedi");
		arrayList.add("Kopek");
		arrayList.add("Kus");

		System.out.println("\nArrayList: ");
		for (String s : arrayList) {
			System.out.println(s);
		}

		if (hashSet.contains("Kus")) { 				// milyonlarca veri olduğunda hashSet'te arama daha hızlı yapılır
			System.out.println("\nKuş hashSet içinde mevcut");
		} else {
			System.out.println("\nKuş hashSet içinde mevcut değil");
		}

		
		// Aşağıdaki ifadeyi içinde milyonlarca kayıt olan bir ArrayList'de yaparsak
		// HashSet'e göre çok daha uzun süre alabilir.
		// HashSet'de ise çok kısa sürede aradığınız değere ulaşabilirsiniz.
		
		if (arrayList.contains("Kus")) { 			// milyonlarca veri olduğunda arrayList'de arama, hashSet'e göre daha yavaş
													// yapılır
			System.out.println("\nKuş arrayList içinde mevcut");
		} else {
			System.out.println("\nKuş arrayList içinde mevcut değil");
		}
		
		// HashSet'ler arası fark bulma:
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		System.out.println();
		
		// Fark 2 adımda bulunur
		// 1. adım:
		HashSet<String> fark = new HashSet<>(hashSet2);			// 2. hashSet'in elemanlarıyla yeni bir fark hashSet'i oluşturdum
		
		// 2. adım:
		fark.removeAll(hashSet);			// hashSet'te bu elemanların aynısı varsa bunları fark hashSet'inden çıkardım
											// fark isimli hashSet'te ilk hashSet'imin aynı olan elemanlarını çıkardım. 
											// geriye farklı olan elemanlar kaldı
		System.out.println(fark);
		
		

	}

}
