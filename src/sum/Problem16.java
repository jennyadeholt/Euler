package sum;

import java.math.BigInteger;

/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * <p/>
 * What is the sum of the digits of the number 21000?
 */
public class Problem16 {


    public static void main(String[] args) {
        int value = 0;

        for (char number : new BigInteger("2").pow(1000).toString().toCharArray()) {
            value += (number - '0');
        }

        System.out.println(value);
    }
}
