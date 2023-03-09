package com.sinemvarol;

public class Main {
	
	// GENERIC METODLAR
	public static <E> void myGenericMethod(E[] array) {
		 
		// Bu method array'in içindeki şekillerin toplam alanını hesaplasın
		System.out.println("\n- - - - - \n");
		
		int toplam = 0;
		for (E obj : array) {
			Sekil objSekil = (Sekil) obj;
			if (objSekil != null) {
				toplam += objSekil.alanHesapla();
			}
		}
		System.out.println("Arrayin toplam alanı: " + toplam);
	}

	public static void main(String[] args) {
		
		GeometricAlan <DikUcgen, Kare> alan1 = new GeometricAlan<DikUcgen, Kare>(new DikUcgen(10,10), new Kare(5));
		System.out.println("alan1 alanı: " + alan1.geometricSeklinAlaniniHesapla());
		
		GeometricAlan <Dikdortgen, DikUcgen> alan2 = new GeometricAlan<Dikdortgen, DikUcgen>(new Dikdortgen(8, 5), new DikUcgen(4,12));
		System.out.println("alan2 alanı: " + alan2.geometricSeklinAlaniniHesapla());
		
		GeometricAlan<Kare, Kare> alan3 = new GeometricAlan<Kare, Kare>(new Kare(7), new Kare(3));
		System.out.println("alan3 alanı: " + alan3.geometricSeklinAlaniniHesapla());
		
		GeometricAlan<Circle, Kare> alan4 = new GeometricAlan<Circle,Kare>(new Circle(10), new Kare(5));
		System.out.println("alan4 alanı: " + alan4.geometricSeklinAlaniniHesapla());
		
		System.out.println("- - - - - - - - - -");
		
		Kare[] kareArray = new Kare[3];		// {null, null, null}
		kareArray[0] = new Kare(3);
		kareArray[1] = new Kare(4);
		kareArray[2] = new Kare(5);			// kareArray -> { (Kare nesnesi(kenar:3), (Kare nesnesi(kenar:4), (Kare nesnesi(kenar:5) }
	
		myGenericMethod(kareArray);
		
		Dikdortgen[] dArr = new Dikdortgen[3];	
		dArr[0] = new Dikdortgen(3, 4);
		dArr[1] = new Dikdortgen(4, 5);
		dArr[2] = new Dikdortgen(5, 7);
		
		myGenericMethod(dArr);
		
		// Soru:
		//
		// İçinde 1 dikdortgen, 1 kare, 1 dikUcgen nesneleri olan bir array olusturun
		// myGenericMetgod'a parametre olarak gönderin ve alan hesaplayın
		
		Sekil[] karisikArray = new Sekil[3];
		karisikArray[0] = new Dikdortgen(5, 4);
		karisikArray[1] = new Kare(3);
		karisikArray[2] = new DikUcgen(10, 10);
		
		myGenericMethod(karisikArray);
					

	}

}
