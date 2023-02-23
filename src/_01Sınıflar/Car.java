package _01Sınıflar;

public class Car {
    //Sınıfımıza Nitelikler tanımlıyoruz.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //Constructor Metod
    Car(String model, int speed, String color){
        this.model=model;
        this.speed =speed;
        this.color=color;
        this.type="sedan";
        this.speedLimit=180;
    }

    //Hız artışı
    void increaseSpeed(int increment){

        this.speed += increment;

    }
    //Hız azaltmak
    void decreaseSpeed(int decrease){
        if(this.speed>0){
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hiziniz: " + speed);
    }

    // \t çıktıları hizalamak için kullanılıyor
    void printInfo(){
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t" + this.color);
        System.out.println("Type :\t" + this.type);
        System.out.println("Speed :\t" + this.speed);
    }
}
