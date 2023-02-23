package _04NesneyeYonelikProgramlama._03Kalıtım;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Muhammet Karaguzel", "5555555555", "muhammet@ali.com");

        Akademisyen a1 = new Akademisyen("Ali Karaguzel", "1111111111","ali.kara@guzel.com", "MAT", "PROFF");

        Memur m1 = new Memur("Mukaddes Karaguzel", "0000000000", "mukaddes@gmail.com", "Cocuk gelisimi", "09:00 - 15:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Sercan Demirci","1111000", "sercan@demirci.com","Bilisim Teknolojileri", "Docent", "2");

        o1.giris();

    }
}
