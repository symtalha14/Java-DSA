package dsa.basics;

import java.util.*;

public class RotateANumber {

    /**
     * Program to rotate a number by a given factor
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, k;

        n = scanner.nextInt();

        // rotate by
        k = scanner.nextInt();

        int rotatedNumber = 0;

        int d = 0;
        int temp = n;

        // count number of digits
        while (temp != 0) {
            d++;
            temp = temp / 10;
        }

        // multiple of the number of digits will result in 0 rotations
        // therefore taking mod of the number of rotations with d
        k = k % d;

        // in case of negative rotations, add number of digits
        // to make it a positive rotation
        if(k < 0){
            k = k + d;
        }

        // extracting last and first digits based on k
        int lastDigits = n % (int) (Math.pow(10, k));
        int firstDigits = n / (int) (Math.pow(10, k));


        /**
         * Multiplying lastDigits to 10 raised to the power of d-k
         * and then adding firstDigits to get the rotated number
         */
        rotatedNumber = (lastDigits * (int) Math.pow(10, d - k)) + firstDigits;
        System.out.println(rotatedNumber);
    }

}
