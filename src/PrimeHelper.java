import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class PrimeHelper {

    static boolean[] generatePrimes(int size) {
        boolean[] isPrime = new boolean[size + 1];
        Arrays.fill(isPrime, true);

        isPrime[1] = false;
        for (int i = 4; i <= size; i += 2) {
            isPrime[i] = false;
        }

        for (int i = 3; i <= size; i += 2) {
            for (int j = i + i; j < size; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

    public static List<Integer> generatePrimesIntegerList(int max) {
        int sieveSize = (max + 1) / 2 - 1;
        List<Integer> primes = new ArrayList<Integer>();
        boolean[] sieve = new boolean[sieveSize];

        primes.add(2);
        int n = 0;

        do {
            int prime = n * 2 + 3;
            primes.add(prime);
            for (int i = n; i < sieveSize; i += prime) {
                sieve[i] = true;
            }

            for (n++; n < sieveSize && sieve[n]; n++) {
            }
        } while (n < sieveSize);

        return primes;
    }
}
