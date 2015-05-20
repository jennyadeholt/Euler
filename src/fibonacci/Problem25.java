package fibonacci;

import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * <p/>
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * <p/>
 * Hence the first 12 terms will be:
 * <p/>
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * <p/>
 * The 12th term, F12, is the first term to contain three digits.
 * <p/>
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 {

    public static void main(String[] args) {

        BigInteger fN2 = BigInteger.ONE;
        BigInteger fN1 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;

        int term = 2;

        while (fibonacci.toString().length() < 1000) {
            fibonacci = fN2.add(fN1);
            fN2 = fN1;
            fN1 = fibonacci;
            term++;
        }

        System.out.println("Term: " + term);
    }
}
