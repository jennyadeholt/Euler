package sum;

import java.util.HashMap;
import java.util.Map;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains
 * 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing
 * out numbers is in compliance with British usage.
 */
public class Problem17 {

    static Map<Integer, String> letters = new HashMap<Integer, String>();
    static StringBuffer buffer = new StringBuffer();

    public static void main(String[] args) {
        long time = System.currentTimeMillis();

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

        int start = 1;
        int stop = 1000;

        for (int i = start; i <= stop; i++) {
            if (i < 10) {
                append(i);
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
        System.out.println(System.currentTimeMillis() - time + " millis");
    }

    private static void twoDigits(int teens) {
        if (teens < 20) {
            append(teens);
        } else {
            int ones = teens % 10;
            append(teens - ones);
            if (ones != 0) {
                append(ones);
            }
        }
    }

    private static void threeDigits(int hundreds) {
        append(hundreds / 100);
        append(100);

        int teens = hundreds % 100;
        if (teens != 0) {
            append("and");
            twoDigits(teens);
        }
    }

    private static void getThousand(int thousands) {
        append(thousands / 1000);
        append(1000);

        int hundred = thousands % 1000;
        if (hundred != 0) {
            threeDigits(hundred);
        }
    }

    private static void append(int number) {
        append(letters.get(number));
    }

    private static void append(String text) {
        buffer.append(text);
    }

    private static void newLine() {
        buffer.append("\n");
    }
}
