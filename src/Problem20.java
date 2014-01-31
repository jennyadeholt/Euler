import java.math.BigInteger;

/**
 * Created by jennynilsson on 2014-01-31.
 */
public class Problem20 {

    public static void main(String[] args) {

        BigInteger sum = BigInteger.ONE;

        for (int i = 100 ; i > 1 ; i-- ){
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        int value = 0;
        for (char number : sum.toString().toCharArray()) {
            value += (number - '0');
        }

        System.out.println("Value " + value);
    }
}
