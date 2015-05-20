package square;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * <p/>
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * <p/>
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640.
 * <p/>
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */

public class Problem6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int sumOfSquare = 0;
        int squareOfSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquare += i * i;
            squareOfSum += i;
        }

        squareOfSum = squareOfSum * squareOfSum;

        System.out.println(sumOfSquare);
        System.out.println(squareOfSum);
        System.out.println(squareOfSum - sumOfSquare);


    }

}
