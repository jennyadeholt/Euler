/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem10 {

    public static void main(String[] args){

        long time = System.currentTimeMillis();
        System.out.println(time);


        int nbrOfPrimes = 2000000;
        int nbr = 17;
        int isPrime[] = new int[nbrOfPrimes];


        isPrime[0] = 2;
        isPrime[1] = 3;
        isPrime[2] = 5;
        isPrime[3] = 7;
        isPrime[4] = 11;
        isPrime[5] = 13;

        int primesFound = 6;
        long result = 2 + 3 + 5 + 7 + 11 + 13;

        while(true) {
            boolean prime = true;
            for (int n = 1 ; n < primesFound ; n++) {
                if (nbr % isPrime[n] == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                isPrime[primesFound++] = nbr;
                result += nbr;
            }

            nbr+=2;

            if (nbr >= 2000000) {
                break;
            }
        }

        time = System.currentTimeMillis() - time;
        System.out.println("Total amount is " + result + " and it took " + time);
    }
}
