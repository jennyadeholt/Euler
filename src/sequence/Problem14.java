package sequence;

import java.util.HashMap;
import java.util.Map;


/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p/>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p/>
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * <p/>
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p/>
 * Which starting number, under one million, produces the longest chain?
 * <p/>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {

    public static void main(String[] args) {

        Map<Integer, Integer> numbers = new HashMap<>();

        int result_count = 0;
        int result_number = 0;

        int count;
        long number;
        int value = 1;

        while (value < 1000000) {
            count = 0;
            number = value;
            while (number != 1) {
                if (numbers.containsKey(number)) {
                    count += numbers.get(number);
                    break;
                } else {
                    number = (number % 2 == 0) ? number / 2 : 3 * number + 1;
                    count++;
                }
            }

            if (count > result_count) {
                result_count = count;
                result_number = value;
            }
            value++;
        }

        System.out.println("Count " + result_count + " for number " + result_number);
    }
}
