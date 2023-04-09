package _12Collections._01SetInterface;

import java.util.HashSet;
import java.util.TreeSet;

public class _TreeSet {
    public static void main(String[] args) {

        // Şuan alttaki öğrencileri değişkenlerine göre sıralamak için alttaki kodu kullanıyoruz.
        //TreeSet<>() parantez içine hangi değişkenin sıralanmasını istiyorsak onun için oluşturduğumuz class ı yazıyoruz
        //OrderNoteComparator sonuna reverse koyarsak tam tersini yapar

        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());


        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Behlul",45));
        students.add(new Student("Damla",60));
        students.add(new Student("Cemre",60));

        for (Student stu : students){
            System.out.println(stu.getName());
        }

    }
}
