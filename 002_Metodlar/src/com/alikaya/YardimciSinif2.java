package com.alikaya;

public class YardimciSinif2 {
	
	public static void main(String[] args) {
		YardimciSinif.hello();
		
		YardimciSinif.hello2();
		
		// YardimciSinif.hello3(); // aynı package içinde ama farklı classtan olduğu için çağırılamaz
		
		// System.out.println(randomNumber()); 	// public static veya protected static metodları başka sınıflardan
												// çağırırken mutlaka başına class (sınıf) ismi yazmamız gerekir.
	}

}
