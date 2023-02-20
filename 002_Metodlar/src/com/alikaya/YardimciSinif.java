package com.alikaya;

public class YardimciSinif {
	
	public static void hello() {
		System.out.println("hello from YardimciSinif");
	}
	
	protected static void hello2() {
		System.out.println("hello2");
		// hello3(); metodunu burada çağırsam da hata vermez
	}
	
	private static void hello3() {
		System.out.println("hello3");
		
	}
	
	public static void main(String[] args) {
		YardimciSinif.hello3();
	}

}
