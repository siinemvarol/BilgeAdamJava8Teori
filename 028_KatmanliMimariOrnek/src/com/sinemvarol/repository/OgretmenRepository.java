package com.sinemvarol.repository;

import java.util.List;

import com.sinemvarol.repository.entity.Ogrenci;
import com.sinemvarol.repository.entity.Ogretmen;
import com.sinemvarol.utility.DataBase;

public class OgretmenRepository {

	public void save(Ogretmen ogretmen) {
		DataBase.ogretmenListesi.add(ogretmen);

	}

	public void delete(int tcKimlikNo) {
		Ogretmen silinecekOgretmen = null;

		for (Ogretmen ogretmen : DataBase.ogretmenListesi) {
			if (ogretmen.getTcKimlikNo() == tcKimlikNo) {
				silinecekOgretmen = ogretmen;
				break;
			}
		}
		if (silinecekOgretmen != null) {
			DataBase.ogretmenListesi.remove(silinecekOgretmen);
		}

	}

	public void update(Ogretmen ogretmen) {

		for (int i = 0; i < DataBase.ogretmenListesi.size(); i++) {
			if (DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo()) {
				DataBase.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
				DataBase.ogretmenListesi.get(i).setSoyadi(ogretmen.getSoyadi());
			}
		}

	}

	public Ogretmen findById(int tcKimlikNo) {
		Ogretmen tempOgretmen = null;

		for (Ogretmen ogretmen : DataBase.ogretmenListesi) {
			if (ogretmen.getTcKimlikNo() == tcKimlikNo) {
				tempOgretmen = ogretmen;
				break;
			}
		}

		return tempOgretmen;

	}

	public List<Ogretmen> findAll() {
		return DataBase.ogretmenListesi;
	}

}
