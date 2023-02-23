package _03ErisimBelirleyiciler.StringAnahtarSozcugu;

public class Player {
    public String name;
    public int idno;
    public static String game = "CS";
    public static int count =0;

    public Player(String name, int idno){
        this.name = name;
        this.idno = idno;
        count++;
    }
}
