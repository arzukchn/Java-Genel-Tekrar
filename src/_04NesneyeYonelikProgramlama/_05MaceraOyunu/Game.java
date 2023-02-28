package _04NesneyeYonelikProgramlama._05MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner  input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hosgeldiniz !");
        System.out.println("Lutfen bir isim giriniz : ");

        //Scannerden aldığımız ismi kullanıcı ismi olarak kullanıyoruz.
        //String playerName = input.nextLine();
        Player player = new Player("Muhammet");
        System.out.println("Sayin " + player.getName() + " Bu karanlik ve sisli adaya hosgeldiniz !");
        System.out.println("Lutfen bir karakter seciniz !");
        player.selectChar();

    }
}
