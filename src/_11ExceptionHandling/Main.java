package _11ExceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Program basladi !");
        Scanner input = new Scanner(System.in);

        int a =1;
        int b =20;
        int c;
        int[] arr = new int[2];
        try {
            System.out.println("Bolme islemi");
            System.out.println(b / a);
            System.out.println("Bolme islemi bitti !");
        }catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Aritmetik hata alindi!");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Yanlis Veri Girildi!");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Hatasi alindi !");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kisim kesinlikle calisacak !!!");
        }


        System.out.println("Program Bitti  !");

    }
}
