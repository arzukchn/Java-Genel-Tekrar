package _02Diziler.Alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz!");
        int boyut = value.nextInt();

        int[] list = new int[boyut];

        System.out.println("Lutfen bir sayi giriniz!");

        for(int i =0; i< list.length;i++){
            System.out.println((i+1) + ". Eleman: ");
            list[i] = value.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Siralama: " + Arrays.toString(list));
    }
}
