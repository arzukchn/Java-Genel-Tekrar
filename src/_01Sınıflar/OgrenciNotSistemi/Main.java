package _01Sınıflar.OgrenciNotSistemi;

public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905000000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101","TRH",t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK",t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103","BIO",t3);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4",tarih, fizik, biyo);
        s1.addBulkExamNote(100, 78, 50);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "444"," 4", tarih, fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
    }
}
