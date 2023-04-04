package _07GenericMetodlar;

public class Print {
    public static <T> void printArray(T[] arr){
        for(T i : arr){
            System.out.println(i);
        }
    }

    //Bu şekilde birden fazla değer yazdırabiliriz.
    public static <T, U> void printArray2(T[] arr, U[] arr2){

        for(T i : arr){
            System.out.println(i);
        }

        for(U i : arr2){
            System.out.println(i);
        }
    }
}
