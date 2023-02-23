package _03ErisimBelirleyiciler.StringAnahtarSozcugu;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT-101",70);
        Course fizik = new Course("Fizik", "FIZ-101",100);
        Course kimya = new Course("Kimya", "KIM-101",20);

        //int[] notlar = {mat.note, fizik.note , kimya.note};

        //Olay şu: Oluşturduğumuz calculate sınıfını çağırıken böyle yapıyoruz
        // yapıcı metod oluşturup ondan sonra hesaplamak için çağırıyoruz.
        //Ancak eğer sınıf ismini static yaparsak alttaki yapıcı metodu yazmaya gerek kalmıyor.
        // -- Calculate calc = new Calculate();-- static yaptığımız için buna gerek kalmadı

        Course[] dersler = {mat,fizik,kimya};
        Calculate.calcAvarage(dersler);
    }
}
