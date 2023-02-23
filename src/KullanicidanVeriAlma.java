import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String args[]){
        Scanner value = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz:");
        String adSoyad = value.nextLine();

        System.out.println("Lutfen yasinizi giriniz:");
        int yas = value.nextInt();

        System.out.printf("Lutfen maasinizi giriniz:");
        int maas = value.nextInt();


        System.out.printf("Ad Soyad:" + ' '+ adSoyad + '\n');
        System.out.printf("Yas:" +' '+ yas + '\n');
        System.out.printf("Maas:"+ ' ' + maas + '\n');
    }


}
