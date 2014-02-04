import java.math.BigInteger;

/**
 * Created by jennynilsson on 2014-02-04.
 */
public class Problem34 {

    public static void main(String[] args) {

        int[] factors = new int[10];
        factors[0] = 1;

        for (int i = 1 ; i < 10 ; i ++) {
            factors[i] = i * factors[i - 1];
        }

        int sum = 0;

        for (int number = 3 ; number < 999999; number++ ){

            String digs = Integer.toString(number);
            int value = 0;

            for (int k = 0; k < digs.length(); k++) {
                value += factors[(digs.charAt(k)-'0')];

                if (value > number) {
                    break;
                }
            }

            if (value == number) {
                sum += value;
            }
        }

        System.out.println("Sum "  + sum);

    }
}
