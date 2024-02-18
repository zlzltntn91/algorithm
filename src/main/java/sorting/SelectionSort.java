package sorting;

import util.ArrayUtils;

public class SelectionSort {
    // O(n^2)
    // 불안정성
    // https://www.youtube.com/watch?v=19YOpMMtLx8
    // [2a, 4, 3, 2b, 1]
    // [1, 4, 3, 2b, 2a] 불안정
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            ArrayUtils.swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 9, 0, 1, 4, 5};
        ArrayUtils.print(array);
        sort(array);
        ArrayUtils.print(array);
    }
}
