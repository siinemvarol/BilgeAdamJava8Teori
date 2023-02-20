package com.alikaya;

public class Ucgen {

	public int kenar1;
	public int kenar2;
	public int kenar3;

	public int ucgenCevresi() {
		return (kenar1 + kenar2 + kenar3);
	}
	
	// protected bir metod olduğu için sadeced Ali'nin com.alikaya paketi içindeki sınıflar erişebilir bu metoda
	protected void kenarlariUzat(int uzatmaMiktari) {
		kenar1 += uzatmaMiktari;         // kenar1 = kenar1 + uzatmaMiktari;
		kenar2 += uzatmaMiktari; 
		kenar3 += uzatmaMiktari; 
	}
	
	// proxy metod. kenarlariUzat protected iken kereminMetodu public olduğu için başka paketlerden erişiliyor ve çalışıyor
	public void kereminMetodu(int uzatmaMiktari) {
		kenarlariUzat(uzatmaMiktari);
	}

}
