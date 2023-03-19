package _05NestedveInnerSınıflar.Nested;

public class Main {
    public static void main(String[] args) {

        // Nested Class (İç içe Sınıflar)
        //  - Inner Class(İç Sınıflar)
        //      - static
        //      - non-static
        //  - Local Class(Yerel Sınıflar)
        //  - Anonymus Class(Anonim Sınıflar)

        //==============================================

        //Out o = new Out();
        //Out.In inNesnesi = o.new In();
        //Out.In inNesnesi = o.getIn();
        //inNesnesi.run();


        //In clasını static yaptığımızda bu şekilde çağırdık
        //Out o = new Out();
        //Out.In.run();

        //=================================================

        //Local l = new Local();
        //l.run();

        //=================================================

        Anonim a = new Anonim(){
            //burdaki a değerini yazar
            public int a =20;
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazilmis run metodu");
            }

            public void print(){
                System.out.println("Print metodu");
            }
        };
        a.run();

        //Bu şekilde çağırılmıyor
        //a.print();
    }
}
