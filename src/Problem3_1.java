import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 15:00
 * To change this template use File | Settings | File Templates.
 */
public class Problem3_1 {

    private static boolean isPrime[];

    public static void main(String[] args) {
        long it = 600851475143L;
        int n = ((int) Math.sqrt(it)) + 1;

        isPrime = PrimeHelper.getPrimes(n);

        long out = 0;
        for (int i = 1; i < n; ++i) {
            if (isPrime[i] && (it % i) == 0) {
                out = Math.max(i, out);
            }
        }

        System.out.println(out);
    }

}
