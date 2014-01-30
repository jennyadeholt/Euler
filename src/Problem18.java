/**
 * Created by jennynilsson on 2014-01-28.
 */
public class Problem18 {

    public static void main(String args[]){


        String[] numberString = new String(
                "75 " +
                        "95 64 " +
                        "17 47 82 " +
                        "18 35 87 10 " +
                        "20 04 82 47 65 " +
                        "19 01 23 75 03 34 " +
                        "88 02 77 73 07 63 67 " +
                        "99 65 04 28 06 16 70 92 " +
                        "41 41 26 56 83 40 80 70 33 " +
                        "41 48 72 33 47 32 37 16 94 29 " +
                        "53 71 44 65 25 43 91 52 97 51 14 " +
                        "70 11 33 28 77 73 17 78 39 68 17 57 " +
                        "91 71 52 38 17 14 91 43 58 50 27 29 48 " +
                        "63 66 04 68 89 53 67 30 73 16 69 87 40 31 " +
                        "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ")
                .split(" ");

        int count = 0;
        int[][] numbers = new int[15][15];

        for (int height = 0 ; height <= 14 ; height++) {
            for (int length = 0 ; length <= height ; length++) {
                numbers[height][length] = Integer.valueOf(numberString[count].startsWith("0")
                        ? numberString[count].replaceFirst("0", "")
                        : numberString[count]);
                count++;
            }
        }

        int sum = 75;
        count = 0;
        for (int height = 1 ; height <= 14 ; height++) {
            int temp = count;
            int one = numbers[height][temp];
            int two = numbers[height][temp + 1];

            if (two > one) {
                count++;
                sum = sum + two;
            } else {
                sum = sum + one;
            }
        }

        System.out.println(sum);
    }
}
