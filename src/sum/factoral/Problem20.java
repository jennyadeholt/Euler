package sum.factoral;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * <p/>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p/>
 * Find the sum of the digits in the number 100!
 */
public class Problem20 {

    public static void main(String[] args) {

        BigInteger sum = BigInteger.ONE;

        for (int i = 100; i > 1; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        int value = 0;
        for (char number : sum.toString().toCharArray()) {
            value += (number - '0');
        }

        System.out.println("Value " + value);
    }
}
