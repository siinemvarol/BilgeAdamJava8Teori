package com.sinemvarol;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		
		// break
		// Döngünün akışını durdurur ve } sonrasındaki koda gider.
		
		for (int i=0; i < 10; i++) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("exit for loop\n\n");
		
		// continue 
		// Döngünün dışına çıakrmaz ancak bir sonraki indekse devam ettirir. döngü içinde skip etmek (atlamak için) kullanıyoruz
		
		for (int i=0;i<10;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\n-----------\n");
		
		int counter = 0;
		while (counter < 10) {
			if (counter == 7)
				break;
			counter++;
			System.out.println(counter);
		}
	}

}
