package com.sinemvarol;

public class Main {

	// Anonymous Inner Class'lar interface'ler kullanılarak da oluşturulabilir.

	public static void main(String[] args) {

		IUcabilir ucanKaz = new IUcabilir() {

			@Override
			public void uc() {
				System.out.println("Kaz uçuyor..");

			}
		};

		ucanKaz.uc();

		IUcabilir serce = new IUcabilir() {

			@Override
			public void uc() {
				System.out.println("Serçe uçuyor..");

			}
		};

		serce.uc();

	}

}
