/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p/>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3_1 {

    private static boolean isPrime[];

    public static void main(String[] args) {
        long it = 600851475143L;
        int n = ((int) Math.sqrt(it)) + 1;

        isPrime = PrimeHelper.generatePrimes(n);

        long out = 0;
        for (int i = 1; i < n; ++i) {
            if (isPrime[i] && (it % i) == 0) {
                out = Math.max(i, out);
            }
        }
        System.out.println(out);
    }
}
