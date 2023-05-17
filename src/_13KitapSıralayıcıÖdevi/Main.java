package _13KitapSıralayıcıÖdevi;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Savas Ve Baris", 1225, "Tolstoy", 1869);
        Book book2 = new Book("Suc ve Ceza", 705, "Dostoyevski", 1866);
        Book book3 = new Book("Sefiller", 1724,"Victor Hugo", 1862);
        Book book4 = new Book("Anna Karenina",864, "Tolstoy", 864);
        Book book5 = new Book("Ucurtma Avcisi" ,375, "Khaled Hosseini", 2003);


        TreeSet<Book> booksSortedByName = new TreeSet<>();

        booksSortedByName.add(book1);
        booksSortedByName.add(book2);
        booksSortedByName.add(book3);
        booksSortedByName.add(book4);
        booksSortedByName.add(book5);

        System.out.println("\nBooks sorted by name : \n");
        System.out.println(booksSortedByName);


        TreeSet<Book> booksSortedByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getNumOfPage() - book2.getNumOfPage();
            }
        });

        booksSortedByPage.add(book1);
        booksSortedByPage.add(book2);
        booksSortedByPage.add(book3);
        booksSortedByPage.add(book4);
        booksSortedByPage.add(book5);

        System.out.println("\nBooks sorted by page : \n");
        System.out.println(booksSortedByPage);
    }
}
