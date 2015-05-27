package prime;

import helper.PrimeHelper;

/**
 * It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.
 * <p/>
 * 9 = 7 + 2×12
 * 15 = 7 + 2×22
 * 21 = 3 + 2×32
 * 25 = 7 + 2×32
 * 27 = 19 + 2×22
 * 33 = 31 + 2×12
 * <p/>
 * It turns out that the conjecture was false.
 * <p/>
 * What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
 */
public class Problem46 {


    public static void main(String[] args) {

        boolean[] primes = PrimeHelper.generatePrimes(10000);

        int sum = 0;


        for (int c = 33; c <= 6000; c = c + 2) {
            if (!primes[c]) {
                for (int p = 2; p < primes.length; p++) {
                    boolean found = false;
                    if (primes[p]) {
                        int number = 1;
                        if (c > p) {
                            while (true) {
                                sum = p + 2 * number * number;
                                if (sum == c) {
                                    found = true;
                                    break;
                                } else if (sum > c) {
                                    break;
                                }
                                number++;
                            }
                        } else {
                            System.out.println("NOT Conjecture : " + c + " =  " + p + " +  2 * " + number + " * " + number + " = " + sum);
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
            }
        }
    }
}
