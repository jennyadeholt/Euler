import java.util.Arrays;

/**
 * Created by jennynilsson on 2014-02-05.
 */
public class Problem50 {

    private static boolean isPrime[];
    private static int size = 1000000;

    public static void main(String[] args){

        isPrime = PrimeHelper.getPrimes(size);

        int max = 0;
        int sum = 0;

        for (int i = 2; i <= size; i ++){
            int value = 0;
            int count = 0;

            for (int k = i ; k <= size; k++) {
                if (isPrime[k]) {
                    value += k;
                    count++;
                    if (value > size){
                        break;
                    } else if (isPrime[value] && count > max){
                        max = count;
                        sum = value;
                    }
                }
            }
        }
        System.out.println("Prime " + sum );
    }
}
