package com.sinemvarol;

/*    Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır.
 * 
 *    Bu özellik, kodun nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.
 * 
 *    Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi
 *    için bazı işlemler birleştirilerek tek bir işlem gibi gösterilir. Bu birleştirme işlemine kapsülleme denir.
 * 
 *    Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.
 *    Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan
 *    anahtar kelimeler grubuna verilen isimdir (public, private, protected). 
 * 
 *    Metotlar ve değişkenler bir anahtar sözcük ile önceden belirlenen sınırlar dahilinde kullanılabilir.
 *    Bu anahtar kelimeler şu şekilde sıralanabilir : public, private, protected.*/

public class Motor {
	
	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi;  // lt/100 km
	
	public int getMotorHacmi() {
		return motorHacmi;			// --> this.motorHacmi; aynısı
	}
	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi >= 800 && motorHacmi<=10000) {
		this.motorHacmi = motorHacmi;
		}
		else {
			System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için otomatik olarak 800 değerinde ayarlanmıştır!");
			this.motorHacmi = 800;
		}
	}
	public int getYakitTuketimi() {
		return yakitTuketimi;
	}
	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}
	public String getSaseNo() {
		return saseNo;
	}
	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}
	

}
