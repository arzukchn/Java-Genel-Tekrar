package _03ErisimBelirleyiciler.StringKodBlokları;

public class User {
    public String name;
    public static int counter = 0;

    static {
        int random =(int) (Math.random()*10);
        System.out.println("Random sayi : " + random);
        counter = random;

    }

    public User(String name){
        this.name = name;
        counter++;
    }
}
