package prime;

import helper.PrimeHelper;

/**
 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330,
 * is unusual in two ways:
 * (i) each of the three terms are prime, and,
 * (ii) each of the 4-digit numbers are permutations of one another.
 * <p/>
 * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property,
 * but there is one other 4-digit increasing sequence.
 * <p/>
 * What 12-digit number do you form by concatenating the three terms in this sequence?
 */
public class Problem49 {

    private static int add = 3330;

    public static void main(String[] args) {
        for (int value = 1000; value < (10000 - 2 * add); value++) {
            int value2 = value + add;
            int value3 = value2 + add;
            if (PrimeHelper.isPrime(value) && PrimeHelper.isPrime(value2) && PrimeHelper.isPrime(value3)) {
                boolean result = true;

                String two = Integer.toString(value2);
                String three = Integer.toString(value3);

                for (String s : Integer.toString(value).split("")) {
                    if (!two.contains(s) || !three.contains(s)) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    System.out.println(value + "" + value2 + "" + value3);
                }
            }
        }
    }
}
