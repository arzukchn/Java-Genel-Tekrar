package _12Collections._03QueueKonusu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


//Queue arayüzü Java Collections Framework ‘un bir üyesidir. İşlemlerden geçmeden önce öğeleri depolanmasını sağlar.
// Collection arayüzünün bir altarayüzü olduğundan, onun bütün metotlarını kullanır. Onlara ek olarak,
// kuyruk yapısındaki ekleme, silme gibi işlemleri kolaylaştıran metotlara sahiptir.

public class QueueLinkedListKonusu {
    public static void main(String[] args) {

        //Polimorfizm (Çok biçimlilik)
        Queue<String> q = new LinkedList<>();
        q.add("Muhammet");
        q.add("Ali");

        //Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda null döner.
        q.offer("Patika");

        //Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
        System.out.println(q.element());

        //Kuyruğun başındaki elemanı kuyruktan çıkartır.
        System.out.println(q.poll());

        //Kuyrukta sıradaki elemana ulaşmak için kullanılır.
        System.out.println(q.peek());

        System.out.println("==========================================");

        Iterator<String > itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
