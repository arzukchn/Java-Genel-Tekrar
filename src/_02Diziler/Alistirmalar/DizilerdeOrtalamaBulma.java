package _02Diziler.Alistirmalar;

public class DizilerdeOrtalamaBulma {

    public static void main(String[] args) {
        int[] number ={1, 2, 3, 4, 5};
        int sum =0;
        double avarage = 0.0;
        for(int i =0; i< number.length;i++){
            sum += number[i];
        }
        avarage = sum/ number.length;
        System.out.println("Dizinin ortalamasi: "+ avarage);
    }
}

