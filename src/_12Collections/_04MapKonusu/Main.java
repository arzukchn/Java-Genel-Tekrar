package _12Collections._04MapKonusu;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();

        //Burdaki "put", "add" gibi çalışır. Diziye verilenleri ekler
        country.put("TR" , "Turkiye");
        country.put("GR", "Almanya");
        country.put("EN", "Ingiltere");

        //verilen parametreyi siler.
        country.remove("EN");

        //Eger aynı kısaltmaya sahip iki nesne varsa o zaman en son ekleneni getirir.
        System.out.println(country.get("TR"));

        //Boyut
        System.out.println(country.size());

        //Verileri değiştirmeye veya güncellemeye yarar
        country.replace("GR", "Alamanya");

        //Bu verilen anahtar daha önce girilmiş mi diye kontrol eder
        country.containsKey("TR");

        //Bu verilen value(object) daha önce girilmiş mi diye kontrol eder
        country.containsValue("Turkiye");

        //Bu anahtara karşılık gelen objeyi döndürür
        country.get("TR");

        //Burası anahtar kısım olan kısaltmaları verir
        for (String countryKey : country.keySet()){
            System.out.println(countryKey);
        }

        System.out.println("============");

        //Burası da anahtarların yani kısaltmaların karşılık geldiği değerleri verir
        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }
    }
}
