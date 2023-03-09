package com.sinemvarol;

public class GenericSinif <U>{
	
	private U obj;
	
	public GenericSinif(U object) {
		this.obj= object;
	}

	public U getObj() {
		return obj;
	}

	public void setObj(U obj) {
		this.obj = obj;
	}
	
	

}
