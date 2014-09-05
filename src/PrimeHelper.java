import java.util.Arrays;

public class PrimeHelper {


    static boolean[] getPrimes(int size) {
        boolean[] isPrime = new boolean[size+1];
        Arrays.fill(isPrime, true);

        isPrime[1] = false;
        for (int i = 4; i <= size; i += 2){
            isPrime[i] = false;
        }

        for (int i = 3; i <= size; i += 2) {
            for (int j = i+i; j < size; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
