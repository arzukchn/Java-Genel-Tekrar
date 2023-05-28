package _14FikstürOluşturmaÖdevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        addTeam(teams);
        addBayTeam(teams);
        ArrayList<String> matchlist = match(teams);
        printMatch(matchlist);

    }


    //Burada kullanıcı istediği kadar takım ekleyebilir. Eklemeyi bitirdikten sonra ise 0 veya exit yazarak ekleme işlemini sonlandırabilir.
    public static void addTeam(ArrayList arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz takımın adını giriniz.");
        System.out.println("Takim eklemeyi bitirmek istediğinizde '0' veya 'exit' giriniz!!!");
        String team;
        while (true){
            team = sc.nextLine();
            if(team.equals("0") || team.equals("exit")){
                break;
            }
            arrayList.add(team);
        }
    }

    //Eklenen takım sayısı tek ise "bay" adında bir takım ekliyoruz
    public static void addBayTeam(ArrayList arrayList){
        if(arrayList.size() %2 == 1){
            arrayList.add("Bay");
        }
    }

    public static void arrayPrint(ArrayList<String> arrayList){
        for (String str : arrayList){
            System.out.println(str);
        }
    }

    public static ArrayList<String> match(ArrayList<String> array) {
        ArrayList matchList = new ArrayList<>();
        Collections.shuffle(array); // Burada bir nevi random işi yaparak takımları rastgele eşleştiriyoruz.
        String str = "";
        String str2 = "";
        int size = array.size();
        for (int away = size / 2; away < size; away++) { // 4-5-6-7 takımlar away olarak oynar ligin ilk yarısını.(8 elemanlı bir lig için)
            for (int home = 0; home < size / 2; home++) { //0-1-2-3 takımlar home olarak oynar ligin ilk yarısını.(8 elemanlı bir lig için)
                if (home + away >= size) {
                    int ha = (home + away) % (size / 2);
                    str += array.get(home) + " vs " + array.get(ha) + "\n";
                    str2 += array.get(ha) + " vs " + array.get(home) + "\n";
                } else {
                    str += array.get(home) + " vs " + array.get(home + away) + "\n";
                    str2 += array.get(home + away) + " vs " + array.get(home) + "\n";
                }
            }
            matchList.add(str);
            matchList.add(str2);
            str = "";
            str2 = "";
        }

        return matchList;
    }

    //MatchListe ligin birinci yarısı tek sayılar 2. yarısı çift sayılar olarak tutuluyor.
    public static void printMatch(ArrayList<String> array){
        for(int i = 0; i<array.size(); i+=2){
            System.out.println(array.get(i));
            System.out.println("=================");
        }
        for(int i = 1; i<array.size(); i+=2){
            System.out.println(array.get(i));
            System.out.println("=================");
        }
    }

}

