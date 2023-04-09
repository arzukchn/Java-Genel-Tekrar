package _12Collections._01SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //Aynı sayıları tek sefer yazıyor.
        //Tekrar etmiyor
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

        //Boyut
        System.out.println(hSet.size());

        //Boş ise true dolu ise false döner
        System.out.println(hSet.isEmpty());

        //contains içinde girilen sayı listemizde varsa true yoksa false döner
        System.out.println(hSet.contains(50));

        //Verilen sayıyı silme
        hSet.remove(10);

        //Listeyi temizleme
        //hSet.clear();

        //Iterator yaparak sırayla listenin elemanlarını geziyoruz.
        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
