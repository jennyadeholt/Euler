import java.math.BigInteger;

/**
 * Created by jennynilsson on 2014-01-31.
 */
public class Problem25 {

    public static void main(String[] args){

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
