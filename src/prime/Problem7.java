package prime;

import helper.PrimeHelper;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p/>
 * What is the 10 001st prime number?
 */
public class Problem7 {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        int nbrOfPrimes = 0;
        int nbr = 0;
        int size = 1000000;
        boolean isPrime[] = PrimeHelper.generatePrimes(size);

        for (int i = 1; i < size; i++) {
            nbrOfPrimes = isPrime[i] ? nbrOfPrimes + 1 : nbrOfPrimes;

            if (nbrOfPrimes == 10001) {
                nbr = i;
                break;
            }
        }

        System.out.println(nbr + " : " + (System.currentTimeMillis() - time) + " millis");
    }
}
