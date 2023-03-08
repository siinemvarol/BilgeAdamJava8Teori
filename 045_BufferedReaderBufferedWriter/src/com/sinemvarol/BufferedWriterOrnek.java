package com.sinemvarol;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {

	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {

			writer.write("Özgür Öz, 443\n");
			writer.write("Ali Kaya, 333\n");
			writer.write("Şafak Kaya, 123\n");
			writer.write("Ömer Altın, 332\n");
			writer.flush(); // flush kullanımı opsiyonel. Biz flush() yazarsak, buffer'da o ana kadar
							// biriken veriler stream'e yazılır. Biz eğer flush kullanmazsak, buffer belli
							// bir doluluğa ulaşınca ya da belli bir zaman periyodunda otomatik olarak Java
							// tarafından flush()'lanır.
							//

			writer.write("Zeynep Altın, 132\n");
			writer.write("Bartu Altın, 372\n");
			writer.write("Kaan Altın, 382\n");

		} catch (FileNotFoundException e) {
			System.out.println("Dosya yazma hatası");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O exception - hatası");
			e.printStackTrace();
		}

	}

}
