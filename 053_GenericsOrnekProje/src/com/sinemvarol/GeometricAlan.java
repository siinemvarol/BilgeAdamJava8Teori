package com.sinemvarol;

public class GeometricAlan <T, G> {
	
	T obj1;
	G obj2;
	
	public GeometricAlan(T object1, G object2) {
		this.obj1 = object1;
		this.obj2 = object2;
	}
	
	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public G getObj2() {
		return obj2;
	}

	public void setObj2(G obj2) {
		this.obj2 = obj2;
	}
	
	public int geometricSeklinAlaniniHesapla() {
		// Casting: 
//		Sekil sekil1 = (Sekil) this.obj1;
//		Sekil sekil2 = (Sekil) this.obj2;
//		int alan = sekil1.alanHesapla() + sekil2.alanHesapla();
//		
//		return alan;
		
		int alan = 0;
		
		if (this.obj1 instanceof Circle) {
			alan += ((Circle) this.obj1).getArea();
		}
		else if(this.obj1 instanceof Sekil) {
			alan += ((Sekil) this.obj1).alanHesapla();
		}
		
		if (this.obj2 instanceof Circle) {
			alan += ((Circle) this.obj2).getArea();
		}
		else if(this.obj2 instanceof Sekil) {
			alan += ((Sekil) this.obj2).alanHesapla();
		}
		
		return alan;
	}

}
