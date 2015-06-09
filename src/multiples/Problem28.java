package multiples;

/**
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 * <p/>
 * 192 × 1 = 192
 * 192 × 2 = 384
 * 192 × 3 = 576
 * <p/>
 * By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
 * <p/>
 * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
 * <p/>
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?
 */
public class Problem28 {


    public static void main(String[] args) {

        long result = 0;
        String number;
        long counter = 9000;

        while (counter < 10000) {
            counter++;
            int n = 1;
            number = "";
            while (number.length() < 9) {
                number = number + Long.toString(n++ * counter);
            }

            if (checkPandigital(number)) {
                if (Long.valueOf(number) >= result) {
                    result = Long.valueOf(number);
                }
            }
        }

        System.out.println("We got " + result);
    }

    private static  boolean checkPandigital(String checkPan) {
        if(checkPan.length() != 9) {
            return false;
        } else {
            for (int i = 1; i <= 9; i++) {
                if (checkPan.contains(Integer.toString(i)) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
