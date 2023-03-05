package com.sinemvarol;

public class Main {

	public static void ucusBilgileriniGoster(UcusTipi ucusTipi) {
		System.out.println("Uçuş tipi: " + ucusTipi.getTip() + " Uçuş tip açıklaması: " + ucusTipi.getMetin());
	}

	public static void main(String[] args) {

		// ENUM olduğu için toString() olmadan yazdırabiliyorum
		Main.ucusBilgileriniGoster(UcusTipi.EKONOMIK);

	}

}
