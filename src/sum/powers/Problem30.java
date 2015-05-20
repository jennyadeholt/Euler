package sum.powers;

/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * <p/>
 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * <p/>
 * As 1 = 14 is not a sum it is not included.
 * <p/>
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * <p/>
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Problem30 {

    public static void main(String[] args) {

        int factor = 5;

        int[] sums = new int[10];
        for (int i = 0; i < 10; i++) {
            sums[i] = (int) (Math.pow(i, factor));
        }

        int numbers = 1;
        while (((int) Math.pow(9, factor) * numbers) > 9 * numbers) {
            numbers++;
        }

        int digits = 1;
        while ((numbers / digits) % 10 != 0) {
            digits *= 10;
        }

        int count = 0;
        int sum = 0;

        for (int i = 2; i < numbers * 9; i++) {
            int value = 0;
            for (int k = 1; k < digits; k *= 10) {
                value += sums[(i / k) % 10];
            }

            if (value == i) {
                System.out.println("Number " + i);
                count++;
                sum += i;
            }

        }
        System.out.println("Count " + count);
        System.out.println("Sum   " + sum);
    }
}
