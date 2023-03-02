package com.sinemvarol;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	// Multi-threading
	// (Bir programın aynı anda birçok işlemi yapabilmesi)
	// multi threading applicationlarda ArrayList'ler safe kabul edilmez.

	// Multi threading uygulamalarda ArrayList yerine Vector kullanılmalıdır.

	// Vector sınıfı thread-safe bir yapıdır.

	// Multi-threadlerde önce bir işlemin bitmesini bekler, sonra diğer işlemi
	// yapar.

	// Vector'lerin dezavantajı vectorlere göre daha yavaş çalışmalarıdır.

	public static void main(String[] args) {

		List<String> vector = new Vector<String>();

		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Aslan");
		vector.add("Kaplan");

		for (String s : vector) {
			System.out.println(s);
		}

		// Iterator tekrar:
		System.out.println();

		ListIterator<String> iterator = vector.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
