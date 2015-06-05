package square;

/**
 * A number chain is created by continuously adding the square of the digits in a number to form a new number until it
 * has been seen before.
 * <p/>
 * For example,
 * <p/>
 * 44 → 32 → 13 → 10 → 1 → 1
 * 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
 * <p/>
 * Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY
 * starting number will eventually arrive at 1 or 89.
 * <p/>
 * How many starting numbers below ten million will arrive at 89?
 */
public class Problem92 {

    static int numbers = 10000000;

    static int table[] = new int[numbers];

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        table[1] = 1;
        table[89] = 89;

        int count = 0;
        int currentSum;

        for (int number = 1; number < numbers; number++) {
            currentSum = getArrival(number);
            if (currentSum == 89) {
                count++;
            }
            table[number] = currentSum;
        }
        System.out.println("Result " + count + " in " + (System.currentTimeMillis() - time) / 1000 + "s");
    }

    private static int getArrival(int number) {
        if (table[number] != 0) {
            return table[number];
        } else {
            int sum = 0;
            while (number > 0) {
                sum += Math.pow(number % 10, 2);
                number /= 10;
            }

            return getArrival(sum);
        }
    }
}
