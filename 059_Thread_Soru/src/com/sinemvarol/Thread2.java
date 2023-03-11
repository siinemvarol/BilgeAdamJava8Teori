package com.sinemvarol;

public class Thread2 implements Runnable {

	private String name;

	public Thread2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + " isimli thread çalışıyor..");
		for (int i = 0; i <= 50; i+=5) {
			System.out.println(this.name + " yazıyor.. " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name + " isimli thread işini bitirdi, çıkıyor..");

	}

}
