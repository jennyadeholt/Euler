package prime;

import helper.PrimeHelper;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p/>
 * Find the sum of all the primes below two million.
 */
public class Problem10 {

    private static boolean isPrime[];
    private static int size = 2000000;

    public static void main(String[] args) {

        isPrime = PrimeHelper.generatePrimes(size);
        long result = 0;

        for (int i = 1; i < size; i++) {
            if (isPrime[i]) {
                result += i;
            }
        }

        System.out.println("Total amount is " + result);
    }
}
