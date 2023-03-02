package com.sinemvarol.repository;

import java.util.List;

import com.sinemvarol.repository.entity.Ogrenci;
import com.sinemvarol.utility.DataBase;

public class OgrenciRepository {

	public void save(Ogrenci ogrenci) {
		DataBase.ogrenciListesi.add(ogrenci);

	}

	public void delete(int id) {
		Ogrenci silinecekOgrenci = null;

		for (Ogrenci ogrenci : DataBase.ogrenciListesi) {
			if (ogrenci.getId() == id) {
				silinecekOgrenci = ogrenci;
				break;
			}
		}
		if (silinecekOgrenci != null) {
			DataBase.ogrenciListesi.remove(silinecekOgrenci);
		}

	}

	public void update(Ogrenci ogrenci) {

		for (int i = 0; i < DataBase.ogrenciListesi.size(); i++) {
			if (DataBase.ogrenciListesi.get(i).getId() == ogrenci.getId()) {
				DataBase.ogrenciListesi.get(i).setAdi(ogrenci.getAdi());
				DataBase.ogrenciListesi.get(i).setSoyadi(ogrenci.getSoyadi());
			}
		}

	}

	public Ogrenci findById(int id) {
		Ogrenci tempOgrenci = null;

		for (Ogrenci ogrenci : DataBase.ogrenciListesi) {
			if (ogrenci.getId() == id) {
				tempOgrenci = ogrenci;
				break;
			}
		}

		return tempOgrenci;
	}

	public List<Ogrenci> findAll() {
				
		return DataBase.ogrenciListesi;
	}

}
