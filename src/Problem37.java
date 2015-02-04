/**
 * Created by jennynilsson on 2014-02-04.
 */
public class Problem37 {

    private static boolean isPrime[];

    public static void main(String[] args){

        isPrime = PrimeHelper.generatePrimes(1000000);

        int count = 0;
        int value = 0;

        for (int i = 11; i <= isPrime.length; i++) {
            if (isPrime[i]) {
                if (isTruncatable(Integer.toString(i))){
                    value += i;
                    if (++count == 11) {
                        break;
                    }
                }
            }
        }

        System.out.println("We found " + count + " counts of truncatable with a value of " + value);
    }

    private static boolean isTruncatable(String digits){
        boolean result = true;
        for (int k = 0; k < digits.length(); k++) {
            if (!isPrime[Integer.valueOf(digits.substring(k))] ||
                    !isPrime[Integer.valueOf(digits.substring(0, k + 1 ))])  {
                result = false;
                break;
            }
        }
        return result;
    }
}
