package _12Collections._02ArrayListKonusu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(5);

        //Burda ilk girilen değer indis numarası yani nereye ekleyeceksin. İkinci değer ise eklenecek değerdir.
        liste.add(2, 15);

        //Contains içindeki değerin dizide olup olmadığını kontrol etmek için kullanılır. Varsa true yoksa false döner
        System.out.println(liste.contains(10));


        //Listenin Boyutu
        System.out.println(liste.size());

        //İndisi girilen elemanı getirir. İndexOf ise içine girilen değerin dizideki indis numarasını getirir. Eğer yoksa -1 döner
        System.out.println(liste.get(0));
        System.out.println(liste.indexOf(1));

        // Aşağıdaki iki döngü şeklinde de listedeki elemanları yazdırabiliriz
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
        for (Integer element : liste){
            System.out.println(element);
        }
         */

        //====================================================================

        List<String> liste2 = new ArrayList<>();
        liste2.add("Ankara");
        liste2.add("İstanbul");
        liste2.add("Amasya");
        liste2.add("Bolu");
        liste2.add("Siirt");

        //indexi girilen değerler arasında olan verileri alır. Alt ve üst sınır da dahil olmak üzere
        liste2.subList(2,5);

        List<String> liste3 = new ArrayList<>();
        liste3.addAll(liste2);
        System.out.println(liste3);

    }
}

