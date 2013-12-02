import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 15:00
 * To change this template use File | Settings | File Templates.
 */
public class Problem3_1 {


    public static void main(String[] args) {
        long it = 600851475143L;
        int n = ((int) Math.sqrt(it)) + 1;
        boolean isprime[] = new boolean[n+1];

        Arrays.fill(isprime, true);

        isprime[2] = true;
        isprime[3] = true;

        for (int i = 4; i < n; i += 2){
            isprime[i] = false;
        }

        for (int i = 3; i < n; i += 2) {
            for (int j = i+i; j < n; j += i) {
                isprime[j] = false;
            }
        }
        long out = 0;
        for (int i = 2; i < n; ++i) {
            if (isprime[i] && (it % i) == 0) {
                out = Math.max(i, out);
            }
        }

        System.out.println(out);
    }

}
