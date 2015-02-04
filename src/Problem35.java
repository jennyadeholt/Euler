/**
 * Created by jennynilsson on 2014-02-04.
 */
public class Problem35 {

    public static void main(String[] args){

        int n = 1000000;
        boolean isPrime[] = PrimeHelper.generatePrimes(n);

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                String number = String.valueOf(i);

                boolean circularPrime = true;
                for (int k = 0; k < number.length() ; k ++){
                    if (!isPrime[Integer.valueOf(number.substring(k) + number.substring(0, k))]) {
                        circularPrime = false;
                        break;
                    }
                }

                if (circularPrime) {
                    count++;
                }
            }
        }

        System.out.println("We found " + count + " counts of circular primes below " + n);
    }
}
