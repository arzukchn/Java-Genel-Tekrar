package _09GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {
        //Integer, Double , Float extends Number

        Integer a = null;
        String str = "abc";
        Nullable<Integer> n1 = new Nullable<>(12);
        n1.run();

        //Burada String yazamıyoruz çünkü nullable sınıfında nullable'yi number sınıfına kalıtsal olarak bağladık.
        //Yani sadece sayılsa değerler yazılabilir
        // --> Nullable<String> str1 = new Nullable<String>("abc");
    }
}
