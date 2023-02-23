package _02Diziler;

public class Main {

    /*
    static void printArray( int[] arr){
        for(int i=0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
    }
    */


    static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for (int i = 0 , j = list.length-1; i < list.length; i++,j--){
            reverse[i] = list[j];
        }
        return reverse;
    }

    static void printArray(int[] list){
        for (int i =0; i< list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        //int list2[] = new int[20];
        int[] list = {1,2,3};

        //printArray(list);

        int[] newListe = reverse(list);
        printArray(newListe);


    }
}
