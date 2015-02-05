/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * <p/>
 * That is, 3 + 7 + 4 + 9 = 23.
 * <p/>
 * Find the maximum total from top to bottom of the triangle below:
 * <p/>
 * 75
 * 95 64
 * 17 47 82
 * 18 35 87 10
 * 20 04 82 47 65
 * 19 01 23 75 03 34
 * 88 02 77 73 07 63 67
 * 99 65 04 28 06 16 70 92
 * 41 41 26 56 83 40 80 70 33
 * 41 48 72 33 47 32 37 16 94 29
 * 53 71 44 65 25 43 91 52 97 51 14
 * 70 11 33 28 77 73 17 78 39 68 17 57
 * 91 71 52 38 17 14 91 43 58 50 27 29 48
 * 63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 * <p/>
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route.
 * However, Problem 67, is the same challenge with a triangle containing one-hundred rows;
 * it cannot be solved by brute force, and requires a clever method! ;o)
 * <p/>
 * int sum = 0;
 * count = 0;
 * for (int height = 1; height <= 4; height++) {
 * int temp = count;
 * int one = numbers[height][temp];
 * int two = numbers[height][temp + 1];
 * <p/>
 * if (two > one) {
 * count++;
 * sum = sum + two;
 * } else {
 * sum = sum + one;
 * }
 * }
 */
public class Problem18 {

    public static void main(String args[]) {


        String[] numberString1 = new String(
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


        String[] numberString = new String(
                "3 " +
                        "7 4 " +
                        "2 4 6 " +
                        "8 5 9 3 ").split(" ");

        int rows = 4;
        int count = 0;
        int[][] numbers = new int[rows][rows];

        int height = 0;

        for (int h = 0; h < rows; h++) {
            for (int w = 0; w < rows; w++) {
                if (w <= h) {
                    numbers[h][w] = Integer.valueOf(numberString1[count]);
                    System.out.println(h + " " + w + " : " + Integer.valueOf(numberString[count]));
                    count++;

                } else {
                    numbers[h][w] = 0;
                    System.out.println(h + " " + w + " : 0");
                }
            }
        }

        int sum = 0;
        count = 0;
        for (int h = 0; h < rows; h++) {
            int temp = count;
            int one = numbers[h][temp];
            int two = numbers[h][temp + 1];
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
