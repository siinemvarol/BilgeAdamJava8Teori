package com.sinemvarol;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;

	// OtoGaleri constructor
	public OtoGaleri(String galeriAdi, int kapasite) {
		this.otomobilDizisi = new Otomobil[kapasite];
		this.galeridekiOtomobilSayisi = 0;
		this.setGaleriAdi(galeriAdi); // this.galeriAdi = galeriAdi;

	}

	public void galeriyeOtomobilEkle(Otomobil otomobil) {
		if (galeridekiOtomobilSayisi < otomobilDizisi.length) { // galeride boş yer varsa otomobil eklensin
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;
		} else { // galeride yer yoksa ekleme işlemi yapılmasın
			System.err.println("Galeri kapasitesi full, araç eklenemedi !");
		}
	}

	public void galeridekiOtomobilleriListele() {
		System.out.println("\n" + this.galeriAdi + " galerisindeki otomobiller listesi: " + " (kapasite: "
				+ this.otomobilDizisi.length + ")  " + " (Galerideki anlık otomobil sayısı: "
				+ this.galeridekiOtomobilSayisi + ")");
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			// System.out.println(otomobilDizisi[i].getMarka() + " " +
			// otomobilDizisi[i].getModel());
			System.out.println(otomobilDizisi[i]);
		}

	}

	public int findCount(String marka) {
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}

	public Otomobil[] search(String marka) {
		int count = findCount(marka);			// count: aranan marka otomobil sayısı
		Otomobil[] aramaSonuclari = new Otomobil[count];
		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = otomobilDizisi[i];
				sayac++;
			}
		}

		return aramaSonuclari;
	}
	
	// dizinin kapasitesini değiştirmeden silme işlemi yapıyoruz
	public void galeridenOtomobilSil(int siraNo) {
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length];      // length-1 yapılarak kapasitesini değiştiririz
		System.out.println(siraNo + ". indexte bulunan otomobil " + galeriAdi + " galerisinden siliniyor...");
		int j = 0;
		for (int i = 0; i < otomobilDizisi.length; i++) {
			if (i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
			}
		}
		this.galeridekiOtomobilSayisi--;
		otomobilDizisi = otomobilDizisiTemp;
	}

	public String getGaleriAdi() {
		return galeriAdi;
	}

	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

}
