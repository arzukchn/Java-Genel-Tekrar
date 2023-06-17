package _17Input_Output_İşlemleri;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class _8_BufferedOutputStreamSınıfı {
    public static void main(String[] args) {
        String data = "Java 102 patikasi";
        try {
            FileOutputStream file = new FileOutputStream("patika.txt");
            BufferedOutputStream buffFile = new BufferedOutputStream(file);

            byte[] byteArray = data.getBytes();

            buffFile.write(byteArray);
            buffFile.close();
            file.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
