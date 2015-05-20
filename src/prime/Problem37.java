package prime;

import helper.PrimeHelper;

/**
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously
 * remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 * <p/>
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 * <p/>
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
public class Problem37 {

    private static boolean isPrime[];

    public static void main(String[] args) {

        isPrime = PrimeHelper.generatePrimes(1000000);

        int count = 0;
        int value = 0;

        for (int i = 11; i <= isPrime.length; i++) {
            if (isPrime[i]) {
                if (isTruncatable(Integer.toString(i))) {
                    value += i;
                    if (++count == 11) {
                        break;
                    }
                }
            }
        }

        System.out.println("We found " + count + " counts of truncatable with a value of " + value);
    }

    private static boolean isTruncatable(String digits) {
        boolean result = true;
        for (int k = 0; k < digits.length(); k++) {
            if (!isPrime[Integer.valueOf(digits.substring(k))] ||
                    !isPrime[Integer.valueOf(digits.substring(0, k + 1))]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
