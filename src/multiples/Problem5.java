package multiples;


/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number = 0;

        boolean noResult = true;
        while (noResult) {
            number += 1;
            noResult = false;
            for (int i = 1; i <= 20; i++) {
                if (number % i != 0) {
                    noResult = true;
                    break;
                }
            }
        }

        System.out.println(number);

    }

}
