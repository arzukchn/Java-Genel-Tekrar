public class Recursivee {

    //Döngü kullanmadan karmaşık olayları yapabiliyoruz.
    static int f(int n){
        System.out.println(n);
        if(n==1){
            return 1;
        }
        return f(n-1) + n;
    }

    public static void main(String[] args){
       f(10);
        //f(1)= 1
        //f(2)= f(1) + 2
        //f(3)= f(2) + 3
        //f(4)= f(3) + 4
        //f(n)= f(n-1) + n

    }
}
