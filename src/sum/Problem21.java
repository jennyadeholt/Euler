package sum;

import java.util.Arrays;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem21 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int totalSum = 0;
        int firstSum;

        for (int firstCandidate = 1; firstCandidate <= 10000; firstCandidate++) {
            firstSum = getSum(firstCandidate);
            if (firstSum != firstCandidate && firstCandidate == getSum(firstSum)) {
                totalSum += firstSum;
            }
        }

        System.out.println("Total " + totalSum + " in " + (System.currentTimeMillis() - time) + "ms");
    }

    private static int getSum(int amicableCandidate) {
        int sum = 0;
        int divider = amicableCandidate / 2;

        for (int i = 1; i <= divider; i++) {
            if (amicableCandidate % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
