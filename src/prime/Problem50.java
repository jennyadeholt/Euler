package prime;

import helper.PrimeHelper;

/**
 * The prime 41, can be written as the sum of six consecutive primes:
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 * <p/>
 * This is the longest sum of consecutive primes that adds to a prime below one-hundred.
 * <p/>
 * The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
 * <p/>
 * Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */
public class Problem50 {

    private static boolean isPrime[];
    private static int size = 1000000;

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        isPrime = PrimeHelper.generatePrimes(size);
        System.out.println((System.currentTimeMillis() - time) + " millis");

        int max = 0;
        int sum = 0;

        for (int i = 2; i <= size; i++) {
            int value = 0;
            int count = 0;

            for (int k = i; k <= size; k++) {
                if (isPrime[k]) {
                    value += k;
                    count++;
                    if (value > size) {
                        break;
                    } else if (isPrime[value] && count > max) {
                        max = count;
                        sum = value;
                    }
                }
            }
        }
        System.out.println("Prime " + sum + " : " + (System.currentTimeMillis() - time) + " millis");
    }
}
