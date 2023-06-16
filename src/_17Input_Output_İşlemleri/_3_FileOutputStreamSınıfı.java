package _17Input_Output_İşlemleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _3_FileOutputStreamSınıfı {
    public static void main(String[] args) throws IOException {
        String metin = "\nOutputStream ogreniyorum\nMutluyum";
        try {
            //Burda hata almamak için aynı FileInputStream'de olduğu gibi ya throws Exception yapıcaz ya da bu şekilde try catch kullanacağız
            //Başka bir nokta ise alttaki gibi dosya isminden sonra bir boolean ifade ekleme durumudur.
            //eğer true yazarsanız mevcut dosyada bulunan verilerin devamı olarak ekleme yapacaktır.
            //Aksi durumda ise verileri dosyanın içinde bulunan verilerin üstüne yazar yani onları siler yeni verileri ekler.
            FileOutputStream output = new FileOutputStream("patika.text", true);
            //metin içindeki verileri byte halinde başka bir yere gönderiyorum.
            byte[] metinByte = metin.getBytes();
            output.write(metinByte);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
