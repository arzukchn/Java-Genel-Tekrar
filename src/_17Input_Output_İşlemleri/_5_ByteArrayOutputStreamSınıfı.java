package _17Input_Output_İşlemleri;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class _5_ByteArrayOutputStreamSınıfı {
    public static void main(String[] args) {
        String data = "Java 102 dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();


        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Cıkıs akısı : " + newData);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
