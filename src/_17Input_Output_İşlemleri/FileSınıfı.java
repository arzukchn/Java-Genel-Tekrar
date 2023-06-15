package _17Input_Output_İşlemleri;

import java.io.File;
import java.io.IOException;

public class FileSınıfı {
    public static void main(String[] args) {
        //Burda pathname kısmına "src/patika.txt" gibi bişey yazarsanız src içinde oluşturulur.
        //Yani bu şekilde dosyanın nerede oluşturulacağını seçebiliriz.
        File dosya = new File("patika.text");

        File dizin = new File("test");
        //burada mkdir metodu dizin oluşturmak için kullanılır. Oluşturulan dizin ilk kez oluşturuluyorsa true döner
        // eğer oluşturulan dizin zaten varsa false döner
        dizin.mkdir();

        File yeniDizin = new File("patika/dev");
        // Bu şekilde bir kullanım yaparsanız patika dosyası oluşturur onun içine de dev dosyası oluşturur
        yeniDizin.mkdirs();

        //Aşağıdaki şekilde de elemanları listeleriz
        String[] listele = yeniDizin.list();

        for (String str : listele){
            System.out.println(str);
        }

        try {
            //burada createNewFile() kullanabilmek için ya throws kullanmalıyız ya da bu şekilde try catch içine almalıyız
            if (dosya.createNewFile()){
                System.out.println(dosya.getName() + "Dosyasi olusturuldu.");
            }else {
                System.out.println(dosya.getName() + "Dosyası zaten mevcut.");
            }
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
        //Oluşturduğumu dosyayı sileriz.
        dosya.delete();
        //Eğer bu şekilde yazarsak çıktı olarak true ya da false olarak dönecektir.
        System.out.println(dosya.delete());
    }
}
