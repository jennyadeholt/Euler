package sum;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * <p/>
 * How many such routes are there through a 20×20 grid?
 */

public class Problem15 {

    public static void main(String[] args) {
        System.out.print(solve());
    }

    public static long solve() {
        long right[] = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long current[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 21; y++) {
                if (y == 0) {
                    current[y] = 1;
                } else {
                    current[y] = current[y - 1] + right[y];
                }
            }
            right = current;
        }
        return current[20];
    }

}
