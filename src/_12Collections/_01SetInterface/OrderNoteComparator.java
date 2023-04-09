package _12Collections._01SetInterface;

import java.util.Comparator;

//Notları sıralayacaktır.
public class OrderNoteComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
