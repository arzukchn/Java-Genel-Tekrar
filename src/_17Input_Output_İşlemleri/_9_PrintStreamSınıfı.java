package _17Input_Output_İşlemleri;


import java.io.PrintStream;

public class _9_PrintStreamSınıfı {
    public static void main(String[] args) {
        //PrintStream sınıfı, çıktı verilerini bayt yerine yaygın olarak okunabilir biçimde (metin) yazmak için kullanılabilir.
        try {
            PrintStream output = new PrintStream("print.text");
            //bu şekilde de yazılabilir
            output.print("123"+123);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
