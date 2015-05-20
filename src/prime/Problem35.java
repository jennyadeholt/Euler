package prime;

import helper.PrimeHelper;

/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
 * <p/>
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 * <p/>
 * How many circular primes are there below one million?
 */
public class Problem35 {

    public static void main(String[] args) {

        int n = 1000000;
        boolean isPrime[] = PrimeHelper.generatePrimes(n);

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                String number = String.valueOf(i);

                boolean circularPrime = true;
                for (int k = 0; k < number.length(); k++) {
                    if (!isPrime[Integer.valueOf(number.substring(k) + number.substring(0, k))]) {
                        circularPrime = false;
                        break;
                    }
                }

                if (circularPrime) {
                    count++;
                }
            }
        }

        System.out.println("We found " + count + " counts of circular primes below " + n);
    }
}
