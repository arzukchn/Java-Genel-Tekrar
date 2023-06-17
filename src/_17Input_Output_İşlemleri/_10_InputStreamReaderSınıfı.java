package _17Input_Output_İşlemleri;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class _10_InputStreamReaderSınıfı {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");

            //InputStreamReader byte kodlarının direkt olarak karakter olarak okunmasını sağlar. İngilizcede olmayan ü,ö,ğ gibi harfleri doğrudan görebiliyoruz.
            //Charset.forName ile de alfabeyi değiştirebiliyoruz. Mesela Big5 ile çin haflerini kullanabiliyoruz.
            InputStreamReader inputReader = new InputStreamReader(fileInput, Charset.forName("Big5"));
            //Utf-8
            System.out.println(inputReader.getEncoding());

            int i = fileInput.read();
            while (i != -1) {
                System.out.println((char) i);
                i = fileInput.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
