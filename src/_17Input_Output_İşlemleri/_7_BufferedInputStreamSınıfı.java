package _17Input_Output_İşlemleri;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class _7_BufferedInputStreamSınıfı {

    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            //BufferedInputStream byteların daha hızlı okunmasına olanak sağlar
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while (i != -1){
                //Burda eğer char kullanmazsak int değeri olarak dönüş alırız yani sadece rakamlar görürüz.
                System.out.print((char) i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
