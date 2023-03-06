package com.sinemvarol;

public class Main {

	// Java Anonymous Inner Class sınıf ismi olmayan ve sadece 1 nesnesi olan sınıf
	// türleridir.

	// Anonymous Inner Class'lar ne zaman faydalıdır?
	// Bir sınıfın bir metodunu override edip tek bir nesne oluşturmak istediğimiz
	// zaman kullanılabilir.

	public static void main(String[] args) {

		// Anonymous Inner Class:

		Insan vejeteryanInsan = new Insan() {
			public void yemekYe() {
				System.out.println("sadece sebze ve meyve yiyor..");
			}
		};

		vejeteryanInsan.yemekYe();
		vejeteryanInsan.suIc();

		Insan insan = new Insan();
		insan.yemekYe();

	}

}
