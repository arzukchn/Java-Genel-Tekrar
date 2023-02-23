package _02Diziler;

public class ForEachKullanımı {
    public static void main(String[] args) {

        //Normal döngü
        int[] list = {1,2,3,4};
        for (int i = 0; i< list.length;i++){
            //System.out.println(list[i]);
        }

        //ForEach döngüsü
        int sum = 0;
        for(double i: list){
            sum += i;
        }

        System.out.println(sum);
    }
}
