import java.util.HashMap;
import java.util.Map;

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
