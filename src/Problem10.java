import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem10 {

    private static boolean isPrime[];
    private static int size = 2000000;

    public static void main(String[] args){

        isPrime = PrimeHelper.getPrimes(size);
        long result = 0;

        for (int i = 1 ; i < size ; i++ ){
            if (isPrime[i]){
                result += i;
            }
        }

        System.out.println("Total amount is " + result);
    }
}
