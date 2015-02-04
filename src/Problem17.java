import java.util.HashMap;
import java.util.Map;

/**
 * Created by jennynilsson on 15-02-04.
 */
public class Problem17 {

    static Map<Integer, String> letters = new HashMap<Integer, String>();
    static StringBuffer buffer = new StringBuffer();

    public static void main(String[] args) {

        letters.put(1, "one");
        letters.put(2, "two");
        letters.put(3, "three");
        letters.put(4, "four");
        letters.put(5, "five");
        letters.put(6, "six");
        letters.put(7, "seven");
        letters.put(8, "eight");
        letters.put(9, "nine");
        letters.put(10, "ten");
        letters.put(11, "eleven");
        letters.put(12, "twelve");
        letters.put(13, "thirteen");
        letters.put(14, "fourteen");
        letters.put(15, "fifteen");
        letters.put(16, "sixteen");
        letters.put(17, "seventeen");
        letters.put(18, "eighteen");
        letters.put(19, "nineteen");
        letters.put(20, "twenty");
        letters.put(30, "thirty");
        letters.put(40, "forty");
        letters.put(50, "fifty");
        letters.put(60, "sixty");
        letters.put(70, "seventy");
        letters.put(80, "eighty");
        letters.put(90, "ninety");
        letters.put(100, "hundred");
        letters.put(1000, "thousand");

        int stop = 345;

        for (int i = stop; i <= stop; i++) {
            if (i < 10) {
                oneDigits(i);
            } else if (i < 100) {
                twoDigits(i);
            } else if (i < 1000) {
                threeDigits(i);
            } else {
                getThousand(i);
            }
            newLine();
        }
        System.out.println(buffer.toString());
        System.out.println(buffer.length());
    }

    private static void oneDigits(int ones) {
        append(letters.get(ones));
    }

    private static void twoDigits(int teens) {
        if (teens < 20) {
            append(letters.get(teens));
        } else {
            int ones = teens % 10;
            append(letters.get(teens - ones));
            if (ones != 0) {
                oneDigits(ones);
            }
        }
    }

    private static void threeDigits(int hundreds) {
        append(letters.get(hundreds / 100));
        append(letters.get(100));

        int teens = hundreds % 100;
        if (teens != 0) {
            append("and");
            twoDigits(teens);
        }
    }

    private static void getThousand(int thousands) {
        append(letters.get(thousands / 1000));
        append(letters.get(1000));

        int hundred = thousands % 1000;
        if (hundred != 0) {
            threeDigits(hundred);
        }
    }

    private static void append(String text) {
        buffer.append(text);
    }

    private static void newLine() {
        //buffer.append("\n");
        //22124
    }
}
