import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a = 0, b = 1, c = 0;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }
    }
}
