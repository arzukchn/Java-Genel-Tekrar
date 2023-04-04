package _06GenericSınıflar;

public class Main {
    public static void main(String[] args) {

        Integer a = 10;
        String b = "patika";
        Double d = 3.14;
        Test<String, Integer, Double> t = new Test<>(b, a, d);
        t.showInfo();


        //Nullable<Integer> n = new Nullable<Integer>(10);
        //n.run();


       /*
        String str = null;
        Nullable n = new Nullable(str);
        n.run();
        */

        /*
        Integer a = null;
        NullableInteger n = new NullableInteger(a);
        n.run();
         */
    }
}
