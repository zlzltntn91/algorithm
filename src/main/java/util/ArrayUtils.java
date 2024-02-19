package util;

public class ArrayUtils {

    public static int[] ARRAY = {3, 5, 7, 8, 4, 9, 0, 1, 2, 5};

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(arr.length -1 != i){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
