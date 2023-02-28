package com.sinemvarol.ornek2;

import java.util.Objects;

// Eğer bir sınıfı hashSet ile kullanacaksanız equals() ve hashCode()
// metodlarını implement etmemiz gerekir.

public class Kisi {

	private int id;
	private String ad;

	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		Kisi other = (Kisi) object;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + "]";
	}
	
	
}
