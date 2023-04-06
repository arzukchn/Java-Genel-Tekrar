package _11ExceptionHandling;

import java.util.Scanner;

public class ThrowKullanimi {

    public static void checkAge(int age){
        if(age < 18){
            throw new IndexOutOfBoundsException("Yasiniz tutmuyor!");
        }
        System.out.println("Yasi uygundur '");
    }


    //Burada throwdan sonra sadece Exception yazdığımızda hata veriyor
    //ArithmeticException veya bu türde hatanın cinsini yazmamızı istiyor.
    //Bu hatadan kurtulmak için metodun başına aşağıdaki eklemeyi yazıyoruz
    public static void ornekGosterim(int age) throws Exception{
        if (age < 18 ){
            throw new Exception("Yasiniz tutmuyor ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz : ");
        int age = input.nextInt();

        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yasi uymadi");
            System.out.println(e.toString());
        }

        System.out.println("Program Bitti !");
    }
}
