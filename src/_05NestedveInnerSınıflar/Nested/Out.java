package _05NestedveInnerSınıflar.Nested;


//Outher Class
public class Out {
    public int a = 5;

    //Inner Class
    public static class In{
        public int a =10;

        public static void run(){
            System.out.println("In sinifina ait run metodu calisti");
            int a = 1;
            System.out.println(a); // 1
            //System.out.println(this.a); // 10
            //System.out.println(Out.this.a); // 5
        }
    }

    public void run(){
        In.run();
    }

    /*
    public In getIn(){
        In in = new In();
        return in;
    }
    */


}
