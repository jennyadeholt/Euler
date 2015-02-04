/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-12-02
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem7 {

    public static void main(String[] args){

        long time = System.currentTimeMillis();

        int nbrOfPrimes = 0;
        int nbr = 0;
        int size = 1000000;
        boolean isPrime[] = PrimeHelper.generatePrimes(size);

        for (int i = 1; i < size ; i++) {
            nbrOfPrimes = isPrime[i] ? nbrOfPrimes + 1 : nbrOfPrimes;

            if (nbrOfPrimes == 10001) {
                nbr = i;
                break;
            }
        }

        System.out.println(nbr + " : " + (System.currentTimeMillis() - time) + " millis");
    }
}
