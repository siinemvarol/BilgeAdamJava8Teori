package com.sinemvarol;

public class SinifStaticDegiskenlerTest {
	
	public static void aktifKullaniciSayisiniArtir() {
		SinifStaticDegiskenler.aktifKullaniciSayisi++;		//burda işlem yaptığım için return yok
	}
	
	public static int aktifKullaniciSayisiniGetir() {
		return SinifStaticDegiskenler.aktifKullaniciSayisi;
	}

	public static void main(String[] args) {
		
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		System.out.println(SinifStaticDegiskenler.aktifKullaniciSayisi);
		int z = aktifKullaniciSayisiniGetir();
		System.out.println(z);

	}

}
