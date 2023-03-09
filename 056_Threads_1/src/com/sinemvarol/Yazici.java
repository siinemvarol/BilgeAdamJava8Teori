package com.sinemvarol;

// Bir class'ı Thread sınıfından extend ederseniz (türetirseniz), türettiğimiz yeni class da bir Thread olur.

public class Yazici extends Thread {

	private String isim;

	public Yazici(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Yazici [isim=" + isim + "]";
	}

	// Dikkat !
	//
	// Thread, start() ettirildiğinde (çalıştırıldığında) çalışacak kodlar run()
	// metodunun içine yazılmalıdır.

	@Override
	public void run() {
		
		System.out.println(this.isim + " isimli thread çalışıyor...");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(this.isim + " yazıyor: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		System.out.println(this.isim + " isimli thread işini bitirdi..");
	}

}
