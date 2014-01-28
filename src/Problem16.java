import java.math.BigInteger;

/**
 * Created by jennynilsson on 2014-01-28.
 */
public class Problem16 {


    public static void main(String[] args){
        int value = 0;

        for (char number : new BigInteger("2").pow(1000).toString().toCharArray()) {
            value += (number - '0');
        }

        System.out.println(value);
    }
}
