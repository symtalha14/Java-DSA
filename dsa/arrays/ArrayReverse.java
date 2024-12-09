package dsa.arrays;
import dsa.Utils;
import jdk.jshell.execution.Util;

public class ArrayReverse {

    /**
     * Program to reverse an array
     */
    static int[] solve(int [] arr){

        // Using Two pointers: O(n) Time and O(1) Space

        int left=0, right = arr.length-1;

        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }

        return arr;

    }


    public static void main(String[] args) {
        int[] ans = solve(new int[]{1, 2, 3, 4});
        Utils.printArr(ans);
    }

}
