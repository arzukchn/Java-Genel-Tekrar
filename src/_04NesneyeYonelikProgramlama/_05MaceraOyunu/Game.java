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

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("************* Bolgeler *************");
            System.out.println();
            System.out.println("1 - Guvenli Ev --> Burasi sizin icin guvenlidir.");
            System.out.println("2 - Magaza --> Silah veya zirh satin alabilirisiniz.");
            System.out.println("0 - Cikis Yap --> Oyunu Sonlandir.");
            System.out.print("Lutfen gitmek istediginiz bolgeyi seciniz!");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;

                default:
                    location = new SafeHouse(player);
            }
            if(location == null){
                System.out.println("Bu karanlik ve sisli adadan cabuk vazgectin...");
                break;
            }
            //Basta ! olması kosulun "false" döndüğünde çalışacağını gösteriyor.
            if (!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
