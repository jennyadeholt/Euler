package triangle;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * <p/>
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p/>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {

    public static void main(String[] args) {

        for (int a = 1; a <= 249; a++) {
            for (int b = 1 + a; b <= 499; b++) {
                int c = 1000 - a - b;
                if ((a * a + b * b) == (c * c)) {
                    System.out.println("a * b * c  =  " + (a * b * c));
                    return;
                }
            }
        }
    }
}
