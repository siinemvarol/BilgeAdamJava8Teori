package com.sinemvarol;

public class OgrenciLise implements Comparable<OgrenciLise> {

	private String ad;
	private int id;
	private double notOrtalamasi;

	public OgrenciLise(String ad, int id, double notOrtalamasi) {
		super();
		this.ad = ad;
		this.id = id;
		this.notOrtalamasi = notOrtalamasi;
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

	public double getNotOrtalamasi() {
		return notOrtalamasi;
	}

	public void setNotOrtalamasi(double notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

	@Override
	public String toString() {
		return "OgrenciLise [ad=" + ad + ", id=" + id + ", notOrtalamasi=" + notOrtalamasi + "]";
	}

//	@Override
//	public int compareTo(OgrenciLise ogr) {			// notOrtalamasi değerlerine göre küçükten büyüğe sıralar
//		if (this.notOrtalamasi < ogr.notOrtalamasi) {
//			return -1;
//		} else if (this.notOrtalamasi > ogr.notOrtalamasi) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(OgrenciLise ogr) {			// notOrtalamasi değerlerine göre büyükten küçüğe sıralar
		if (this.notOrtalamasi < ogr.notOrtalamasi) {
			return 1;
		} else if (this.notOrtalamasi > ogr.notOrtalamasi) {
			return -1;
		} else {
			return 0;
		}
	}

}
