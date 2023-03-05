package com.sinemvarol;

public class Main {

	public void function3() {
		int x = 25 / 0;
		System.out.println("function3 sonu..");
	}

	public void function2() {
		try {
			function3();
		} catch (Exception e) {
			System.out.println("function2'de exception satırı");
		}
		System.out.println("function2 sonu..");
	}

	public void function1() {
		try {
			function2();
		} catch (Exception e) {
			System.out.println("function1'de exception satırı..");
		}
		System.out.println("function1 sonu..");
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.function1();
	}

}
