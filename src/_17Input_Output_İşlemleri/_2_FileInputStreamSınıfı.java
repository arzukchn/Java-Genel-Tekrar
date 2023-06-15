package _17Input_Output_İşlemleri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _2_FileInputStreamSınıfı {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("patika.text");

            //Belirtilen byte sayısını atlamak için kullanılır.
            input.skip(5);

            //burdaki input.read harfleri byte cinsinden yazıyor
            //Okunan dosya boş ise -1 döndürür
            int i = input.read();

            System.out.println("Kullanılabilir byte sayisi : " + input.available());

            //yani dosya boş değil ise
            while (i != -1){
                //burda byteları karaktere dönüştürüyoruz.
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
