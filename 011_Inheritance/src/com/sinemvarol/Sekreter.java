package com.sinemvarol;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;
	
	// Hiçbir constructor yazmasak da aşağıdaki constructor Java tarafından otomatik oluşturulur
	public Sekreter() {
		//super();			// biz super() yazmasak da java otomatik olarak görünmez bir super() çağrısı ekler.
	}
	
	// Alt sınıfın constructor'ları mutlaka 1 tane üst sınıf constructor'ı çağırmak zorundadır. Ekstra constructor otomatik çağrılmaz.
	// biz üst sınıf constructor'ı çağırmazsak Java super()'ı çağırır, biz özel bir constructor yazarsak onu kullanır ve kendisi super() çağırmaz
	public Sekreter(long tel1SeriNo) {
		super("Test stringi", 7);					// üst sınıfın belirli bir constructorını çağırdığımda super() boş constructorını çağırmaz
 		this.tel1SeriNo = tel1SeriNo;
		System.out.println("public Sekreter(long tel1SeriNo) çağrıldı...");
	}

	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

}
