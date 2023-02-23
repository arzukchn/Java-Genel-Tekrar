package Alistirmalar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //double number = Math.random() *100;

        Scanner value = new Scanner(System.in);
        int right =0;
        int selected;
        int[] wrong = new int[5];

        while (right<5){
            System.out.println("lutfen bir sayi giriniz!");
            selected = value.nextInt();

            if(selected < 0 || selected >99){
                System.out.println("Luten 0 - 100 arasi bir deger giriniz!");
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler dogru tahmin :)");
                break;
            }else {

                System.out.println("Hatali bir sayi girdiniz!");
                if (selected > number){
                    System.out.println(selected + " sayisi gizli sayidan buyuk");
                }else {
                    System.out.println(selected + " sayisi gizli sayidan kucuk");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkiniz: " + (5-right));
            }

        }


        System.out.println("Gizli numara: " + number);
        System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
    }
}
