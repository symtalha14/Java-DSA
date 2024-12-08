import java.math.BigInteger;
import java.util.*;

public class NumberReversal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger r = BigInteger.valueOf(0), n, temp, z = BigInteger.valueOf(0), b = BigInteger.valueOf(10);
        int d = 0;
        n = scanner.nextBigInteger();
        temp = n;
        while (temp != z) {
            d++;
            temp = temp.divide(b);
        }

        while (n != z) {
            BigInteger l = n.mod(b);
            r = r.add(l.multiply(b.pow(d - 1)));
            d--;
            n = n.divide(b);
        }

        System.out.println(r);
    }

}