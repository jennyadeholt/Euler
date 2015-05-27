package sum.powers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
 * <p/>
 * Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000
 */
public class Problem48 {


    public static void main(String[] args) {
        long sum = 0;

        for (int i = 1; i <= 1000; i++) {
            double factor = Math.pow(i, i);

            System.out.println(factor );


            sum +=  factor;

        }

        System.out.println("sum : " + sum );

    }
}



