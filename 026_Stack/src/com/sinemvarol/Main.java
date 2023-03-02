package com.sinemvarol;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		// Stack içinde synchronized metodlar (aynı anda birden fazla threadin
		// çalıştırabileceği metodlar) bulunur,
		// Vector sınıfı gibi thread'lerde kullanılabilir.

		Stack<String> stack = new Stack<String>();
		stack.add("Kedi");				// add veya push kullanılır
		stack.add("Kopek");
		stack.add("Aslan");
		stack.add("Kuş");
		
		for(String hayvan : stack) {
			System.out.println(hayvan);
		}
		System.out.println("- - - - - \n");
		
		// LIFO uygulaması
		
		// peek() : stack'e son giren elemanı göster (getir)
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		// pop() : stack'e son giren elemanı çıkarır
		System.out.println("\n - - pop - - \n");
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		// isEmpty() : stack boş mu kontrolü
		System.out.println("\nStack boş mu? : " + stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println("\nStack boş mu? : " + stack.isEmpty());
		
		if(stack.isEmpty() == false) {				// stack boş olduğu için pop yapmaya çalıştığımda exception hatası veriyordu
			stack.pop();							// stack boş mu kontrolü yapıp pop yapınca exception hatasını önlemiş oluyorum
		}
	
	}

}
