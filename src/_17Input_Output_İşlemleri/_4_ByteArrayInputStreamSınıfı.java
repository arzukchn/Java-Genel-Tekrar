package _17Input_Output_İşlemleri;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class _4_ByteArrayInputStreamSınıfı {
    public static void main(String[] args) {
        byte[] dizi = {1,2,3,4,5,6};
        //Alttaki kısımda offset ile dizinin nerden başlanacağı, length ile de başladıktan sonra kaç adet eleman ile devam edeceği seçilir.
        //Bizim dizimize göre 0 indexinden yani 1 den başlayıp 4de bitecektir.
        ByteArrayInputStream input = new ByteArrayInputStream(dizi , 0, 4);
        System.out.println("Kullanılabilen byte sayisi : " + input.available());
        //input.skip(2); --> Atlamak amacıyla kullanılır.
        int i = input.read();
        while (i != -1){
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
