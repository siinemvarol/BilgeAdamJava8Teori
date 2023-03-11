package com.sinemvarol;

import java.time.LocalDate;
import java.time.LocalTime;

public class SporKayit {
	
	private String yapilanSpor;
	private int harcananKalori;
	private LocalDate tarih;
	private LocalTime zaman;

	public SporKayit(String yapilacakHareket, int harcananKalori, LocalDate tarih, LocalTime zaman) {
		this.yapilanSpor = yapilacakHareket;
		this.harcananKalori = harcananKalori;
		this.tarih = tarih;
		this.zaman = zaman;
		
	}

	@Override
	public String toString() {
		return "SporKayit [yapilanSpor=" + yapilanSpor + ", harcananKalori=" + harcananKalori + ", tarih=" + tarih
				+ ", zaman=" + zaman + "]";
	}
	

}
