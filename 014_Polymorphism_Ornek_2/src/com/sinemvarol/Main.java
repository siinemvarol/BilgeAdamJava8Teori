package com.sinemvarol;

public class Main {
	
	// use of polymorphism in methods
	public static void hayvani3KezKonustur(Hayvan h) {
		System.out.println("\nHayvan 3 kez konusuyor...");
		for (int i = 0; i < 3; i++) {
			h.sesCikar();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kedi tekir = new Kedi("Tekir", 3, 32);
		System.out.println(tekir); 		// tekirin objesi olduğu Kedi sınıfında toString olmadığı için parent classı
										// Hayvan'dan toString aldı ve Hayvan sınıfından yazdırdı
		tekir.sesCikar();

		Kopek karabas = new Kopek("Karabas", 7, 75);
		karabas.sesCikar();

		Kus tweety = new Kus("tweety", 1, 10);
		tweety.sesCikar();

		System.out.println("--------------");

		// Polymorphism
		Hayvan hayvan;
		hayvan = new Kedi("Sylvester", 4, 50); // hayvan nesnesi burda kedi oldu
		hayvan.sesCikar();

		hayvan = new Kopek("Lassie", 5, 71); // hayvan nesnesi burda kopek oldu
		hayvan.sesCikar();

		hayvan = tweety; // hayvan nesnesi burda kus oldu
		hayvan.sesCikar();
		
		Main.hayvani3KezKonustur(tekir);
		Main.hayvani3KezKonustur(hayvan);
		Main.hayvani3KezKonustur(karabas);
	}

}
