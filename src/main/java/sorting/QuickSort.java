package sorting;

import util.ArrayUtils;

public class QuickSort {

    private static void sort(int[] array) {
//        partitioning(array, 0, array.length - 1);
        partition(array, 0, array.length - 1);
    }

    private static void partition(int[] array, int start, int end){
        int pivot = array[(start + end) / 2];
        System.out.println("pivot == " + pivot);
        int temp1 = start;
        int temp2 = end;
        if(start < end){
            while(start < end){
                while(array[start] < pivot) start++;
                while(array[end] > pivot) end--;
                ArrayUtils.swap(array, start, end);
                start++;
                end--;
            }
            partition(array, temp1, end);
            partition(array, start, temp2);
        }
        ArrayUtils.print(array);
    }

    private static void partitioning(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];
        int left = start;
        int right = end;
        /**
         * pivot == 4
         *
         * 1.
         * left == 0, 3 < 4 ? true
         * left == 1, 5 < 4 ? false
         * right == 9, 5 > 4 > true
         * right == 8, 2 > 4 > false
         * swap 1, 8
         *     *                    *
         * [3, 5, 7, 8, 4, 9, 0, 1, 2, 5]
         * [3, 2, 7, 8, 4, 9, 0, 1, 5, 5]
         * left++, right--
         *
         * 2.
         * left == 1, 2 < 4 ? true
         * left == 2, 2 < 4 ? false
         * right == 8, 5 > 4 ? true
         * right == 7, 1 > 4 ? false
         * swap 2, 7
         *        *              *
         * [3, 2, 7, 8, 4, 9, 0, 1, 5, 5]
         * [3, 2, 1, 8, 4, 9, 0, 7, 5, 5]
         * left++, right--
         *
         * 3.
         * left == 3, 8 < 4 ? false
         * right == 6, 0 > 4 ? false
         * swap 3, 6
         *           *        *
         * [3, 2, 1, 8, 4, 9, 0, 7, 5, 5]
         * [3, 2, 7, 0, 4, 9, 8, 1, 5, 5]
         * left++, right--
         *
         * 4.
         * left == 4, 4 < 4 ? false
         * right == 5, 9 > 4 ? true
         * right == 4, 4 > 4 ? false
         * swap 4, 4
         *              *
         * [3, 2, 7, 0, 4, 9, 8, 1, 5, 5]
         * [3, 2, 7, 0, 4, 9, 8, 1, 5, 5]
         * left++, right--
         * end
         *
         * 5, 3 으로 시작점과 끝점이 교차됨
         * 파티션함수 재귀 start = left, end = right;
         */
        if (left < right) {


            while (left < right) {
                while (array[left] < pivot) {
                    left++;
                }
                while (array[right] > pivot) {
                    right--;
                }
                ArrayUtils.swap(array, left, right);
                left++;
                right--;
            }
            partitioning(array, start, right);
            partitioning(array, left, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 3};
        ArrayUtils.print(array);
        sort(array);
        ArrayUtils.print(array);
    }
}
