package com.sinemvarol;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner2 {
	
	public static void main(String[] args) {
		
		// Kullanıcıdan metinsel input girdi almak
		Scanner input = new Scanner (System.in);
		System.out.println("Lütfen adınızı yazın: ");
		String isim;
		isim = input.nextLine();
		System.out.println("İsminiz: " + isim);
		
		System.out.println("Lütfen soyadınızı yazın: ");
		String soyIsim;
		soyIsim = input.nextLine();
		
		System.out.println("Yaşınızı girin: ");
		int yas = input.nextInt();
		
		// nextInt()'ten sonra eğer kullanıcıdan String değer alacaksan araya boş bir nextLine(); satırı yazılmalı.
		input.nextLine();
		
		System.out.println("Lütfen yaşadığınız şehri girin: ");
		String sehir = input.nextLine();
		System.out.println("İsminiz: " + isim + " Soyadınız: " + soyIsim + " Yaşınız: " + yas + " Yaşadığınız il: " + sehir);
		
		// String'den int'e çevirmek için ilgili veri tipinin Wrapper class'ı kullanılır
		String yas2 = "30";
		int yasIntValue = Integer.valueOf(yas2);
		System.out.println(yas2);
	}

}
