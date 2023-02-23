package _04NesneyeYonelikProgramlama._02SınıflarArasıİliskiler;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Muhamemt", "Karaguzel", "1", "Hosarlı",85);
        Student st2 = new Student("Mukaddes", "Karaguzel", "2", "Tonya", 85);
        Student st3 = new Student("Ahmet", "Mehmet", "3", "Trabzon", 85);

        Instructor teacher = new Instructor("Mahmut", "Hoca", "TRH");

        //Composition , Aggretation (Birleştirme)
        //Course has a Instructor (Sınıfın bir öğretmeni vardır)
        Course mat = new Course("MAT101", "MAT", teacher);
        System.out.println(mat.getInstructor().getName());

        //Student[] stu = {st1, st2, st3};
        //System.out.println("Ortalamaniz : " + mat.calcAvarage(stu));
    }
}
