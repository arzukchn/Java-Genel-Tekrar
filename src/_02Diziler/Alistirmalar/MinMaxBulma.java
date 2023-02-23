package _02Diziler.Alistirmalar;

public class MinMaxBulma {
    public static void main(String[] args) {
        int[] list = {5, 7, 38, 1, 100, 69};
        int max = list[0];
        int max2= list[0];
        int min = list.length-1;
        int min2 = list.length-1;
        int sayac=0;
        for(int i =0 , j = list.length-1; i< list.length; i++ ,j--){
            sayac+=1;
            if (list[i]> max){
                max2 = max;
                max = list[i];
            }if(min>list[i]){
                min2 = min;
                min = list[i];
            }
        }
        System.out.println("Girilen sayi adeti: " + sayac);
        System.out.println("En buyuk deger: " +max);
        System.out.println("En buyuk 2. sayi: " + max2);
        System.out.println("En kucuk deger : " + min);
        System.out.println("En kucuk 2. sayi: "+ min2);

    }
}
