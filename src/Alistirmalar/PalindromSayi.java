package Alistirmalar;

//iki taraftan da okunduğunda aynı sayi çıkan sayılar

import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom( int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            // sayının son basamağı bulunur. 10 a bölümünüp kalan alınarak bulunur.
            lastNumber = temp % 10;
            //bulunan son basamak reverseNumber eklenir. Eğer daha önce eklenmiş sayı varsa bu sayı 10 ile çarpılıp yeni sayı ile toplanır.
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //daha sonra sayı 10 a bölünür ve "bölüm" alınarak döngünün başına gidilir
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = input.nextInt();
            System.out.println(isPalindrom(sayi));
        }

}
