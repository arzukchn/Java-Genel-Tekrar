package _04NesneyeYonelikProgramlama._01Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfRings = new Book("Lord Of Rings", -100);

        lordOfRings.changePageNumber(1000);
        System.out.println(lordOfRings.showPageNumber());
    }
}
