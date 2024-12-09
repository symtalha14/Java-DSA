package dsa.arrays;

import dsa.Utils;
import jdk.jshell.execution.Util;

public class ArrayCyclicRotation {

    /**
     * Program to do cyclic rotation in an array by 1
     */
    static int[] solve(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left != right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] ans = solve(new int[]{1, 2, 3, 4, 5, 6});
        Utils.printArr(ans);
    }
}
