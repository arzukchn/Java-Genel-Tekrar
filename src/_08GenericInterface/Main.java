package _08GenericInterface;

public class Main {
    public static void main(String[] args) {
        Student<String> stu = new Student<>();
        stu.insert("ABC");


        //Görüldüğü gibi generic içine String yada integer yazarak kolayca türleri değiştirebiliyorum.
        Student<Integer> stu2 = new Student<>();
        stu2.insert(123);
    }
}
