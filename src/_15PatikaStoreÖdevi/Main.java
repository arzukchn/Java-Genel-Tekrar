package _15PatikaStoreÖdevi;

import _15PatikaStoreÖdevi.Objects.Brand;
import _15PatikaStoreÖdevi.Objects.Notebook;
import _15PatikaStoreÖdevi.Objects.Telephone;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Burada ArrayList'in ekleme sırasını koruyan bir yapısı olduğu için nasıl sıralanmasını istiyorsak o şekilde ekleme yapabiliriz.
        //Burada asList bir veri topluluğunu listeye dönüştürmek için kullanılır.
        List<String> brandNames = new ArrayList<>(Arrays.asList("Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"));
        List<Telephone> telephones = addTelephone();
        List<Notebook> notebooks = addNotebook();

        //Yapacağımız işlemi seçeceğimiz panel
        int select;
        boolean duration = true;
        while (duration) {
            System.out.print("\n 1 - Marka Listesi \n" +
                    " 2 - Telefon \n" +
                    " 3 - Notebook \n" +
                    " 4 - Ürün Ekle \n" +
                    " 5 - Ürün Sil \n" +
                    " 6 - Çıkış yap \n" +
                    "  Seçim yapınız: ");
            select = sc.nextInt();
            switch (select) {
                case 1 -> listedBrands(brandNames);
                case 2 -> listedTelephone(telephones);
                case 3 -> listedNotebook(notebooks);
                case 4 -> addProduct(brandNames, telephones, notebooks);
                case 5 -> delete(telephones, notebooks);
                default -> duration = false;
            }
        }
    }

    //Silme işlemi yaptığımız kısım
    private static void delete(List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.println("Lütfen silmek istediğiniz ürünü seçiniz : \n" +
                "1 - Telefon \n" +
                "2 - Notebook \n" +
                "Lütfen Seçiminizi Giriniz : ");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                listedTelephone(telephones);
                System.out.println("Lütfen silmek istediğiniz telefon id'sini giriniz: ");
                int id = sc.nextInt();
                telephones.removeIf(telephone -> {
                    if (telephone.getId() == id) {
                        System.out.println(id + "idsine sahip telefon silindi");
                    }
                    if (telephone.getId() != id) {
                        System.out.println("Geçersiz id lütfen tekrar deneyiniz.");
                    }
                    return true;
                });
            }
            case 2 -> {
                listedNotebook(notebooks);
                System.out.println("Silmek istediğiniz notebook id'sini giriniz: ");
                int id = sc.nextInt();
                notebooks.removeIf(notebook -> {
                    if (notebook.getId() == id) {
                        System.out.println(id + "idsine sahip notebook silindi");
                    }
                    if (notebook.getId() != id) {
                        System.out.println("Geçersiz id lütfen tekrar deneyiniz.");
                    }
                    return true;
                });
            }
        }
    }



    //ürün ekleme yaptığımız kısım
    private static void addProduct(List<String> brandNames, List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.println("Lütfen silmek istediğiniz ürünü seçiniz : \n" +
                "1 - Telefon \n" +
                "2 - Notebook \n" +
                "Lütfen Seçiminizi Giriniz : ");
        List<String> values = new ArrayList<>();
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                String[] brands = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Pil", "Ram", "Color"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    values.add(value);
                }
                telephones.add(new Telephone(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7)), Integer.parseInt(values.get(8)), values.get(9)));
            }
            case 2 -> {
                String[] brands = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Ram"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    values.add(value);
                }
                notebooks.add(new Notebook(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7))));
            }
        }
    }

    //Markaları listeleme işlemi yaptığımız kısım
    private static void listedBrands(List<String> brandNames){
        List<Brand> brands = new ArrayList<>();
        for (int i =0; i < brandNames.toArray().length;i++){
            brands.add(new Brand(brandNames.get(i)));
        }
        Collections.sort(brands);
        for (Brand b : brands){
            System.out.println(" - " + b.getName().toUpperCase());
        }
    }

    //Telefon Ekleme
    private static List<Telephone> addTelephone(){
        List<Telephone> telephones = new ArrayList<>();

        telephones.add(new Telephone("SAMSUNG", "S20", 5000, 10, 45, 64, 15.6, 4500, 8, "Siyah"));
        telephones.add(new Telephone("APPLE", "14", 5000, 10, 45, 64, 15.6, 4500, 8, "Pembe"));
        telephones.add(new Telephone("XIAOMI", "Red Mi Note 11", 5000, 10, 45, 64, 15.6, 4500, 8, "Kırmızı"));
        return telephones;
    }
    //Ekli olan telefonları listeleme
    private static void listedTelephone(List<Telephone> telephones){
        System.out.format("%-5s %-8s %-25s %-14s %-10s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|", "|Renk|");
        System.out.println("___________________________________________________________________________________________");
        for (Telephone t : telephones) {
            System.out.format(" %-4s %-10s %-23s %-15s %-10s %-10s %-10s %-10s\n", t.getId(), t.getBrand(), t.getDescription(), t.getUnitPrice() + " TL", t.getMemory() + " GB", t.getRam() + " GB", t.getSize()+"`", t.getColor());
        }
    }

    //Notebook ekleme
    private static List<Notebook> addNotebook(){
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("LENOVO", "Thinkpad 3", 15000, 10, 45, 512, 13.2, 24));
        notebooks.add(new Notebook("APPLE", "M2", 35000, 10, 45, 128, 16.6, 8));
        notebooks.add(new Notebook("HUAWEI", "D16", 25000, 10, 45, 1024, 15.6, 16));
        return notebooks;
    }

    //Ekli olan notebookları listeleme
    private static void listedNotebook(List<Notebook> notebooks) {
        System.out.format("%-5s %-8s %-22s %-11s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|");
        System.out.println("______________________________________________________________________________________________");
        for (Notebook n : notebooks) {
            System.out.format(" %-4s %-8s %-21s %-13s %-10s %-10s %-10s\n", n.getId(), n.getBrand(), n.getDescription(), n.getUnitPrice() + " TL", n.getMemory() + " GB", n.getRam() + " GB", n.getSize() + "`");
        }
    }
}
