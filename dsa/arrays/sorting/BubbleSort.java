package dsa.arrays.sorting;

import dsa.Utils;

public class BubbleSort {

    static int[] solve(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            boolean swapped = false;
            // j --> l - i - 1 : reducing the array
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // if no swap, that means array is sorted, no need to go to next iteration
                    Utils.printArr(arr);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] ans = solve(new int[]{9, 8, 7, 0, 10, 6, 4, 1});
        Utils.printArr(ans);
    }


}


