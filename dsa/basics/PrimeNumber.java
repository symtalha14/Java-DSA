package dsa.basics;

import java.util.*;

public class PrimeNumber {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;

        n = scanner.nextInt();

        /**
         * check up to square root of the number
         * as remaining numbers are repeated factors
         */

        for (int div = 2; div * div < n; div++) {
            if (n % div == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
