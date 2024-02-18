package sorting;

import util.ArrayUtils;

public class BubbleSort {
    // O(n^2)
    // 효율성이 떨어지며 대규모 데이터에 대해서는 비효율 적임
    private static void sort(int arr[]) {
        // arr.length - 1 인 이유는 1회 패스를 성공 하면 맨 마지막 요소는 가장 큰 값으로 교체되어 있음.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = ArrayUtils.ARRAY;
        ArrayUtils.print(array);
        sort(array);
        ArrayUtils.print(array);
    }
}
