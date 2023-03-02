package com.sinemvarol;

public class Ogrenci implements Comparable<Ogrenci> {

	private String ad;
	private int id;

	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}

	// Şu anki öğrencimizle parametre olarak gelen öğrenci nesnesinin karşılaştırması burda yapılır
	@Override
	public int compareTo(Ogrenci ogr) {			// bu yapıda id'si en küçükten büyüğe sıralar
		if (this.id < ogr.id) {					// > < işaretlerinin yerini değiştirisem id büyükten küçüğe sıralar
			return -1;
		}
		else if (this.id > ogr.id) {
			return 1;
		}
		else {
		return 0;
		}
	}

}
