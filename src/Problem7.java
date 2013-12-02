/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem7 {

    public static void main(String[] args){

        int nbrOfPrimes = 10001;
        int nbr = 17;
        int isPrime[] = new int[nbrOfPrimes];


        isPrime[0] = 2;
        isPrime[1] = 3;
        isPrime[2] = 5;
        isPrime[3] = 7;
        isPrime[4] = 11;
        isPrime[5] = 13;

        int primesFound = 6;
        boolean prime = true;

        boolean run = true;
        while(run) {

            prime = true;
            for (int n = 1 ; n < primesFound - 1 ; n++) {
                if (nbr % isPrime[n] == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println("Nbr " + nbr + " is a prime");
                isPrime[primesFound++] = nbr;
            }

            nbr+=2;
            if (primesFound == nbrOfPrimes) {
                run = false;
            }
        }
    }
}
