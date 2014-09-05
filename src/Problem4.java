import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Problem4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int m1 = 999;
        int m2 = 100;

        int sum = 0;
        System.out.println("Starting at:  " + m1 * m2);

        List<Integer> palindroms = new ArrayList<Integer>();


        for (int i = m1 ; i > 10000 ; i--){
            System.out.println("Sum ");
            for (int j = m2 ; j > 10000; j--){
                if (j <= i){
                    sum = i * j;
                    int num = sum;
                    int rev = 0;
                    int dig = 0;

                    while (num > 0){
                        dig = num % 10;
                        rev = rev * 10 + dig;
                        num /= 10;
                    }

                    if (rev == sum){
                        System.out.println("Sum " + rev  + " m1: " + i + " m2:" + j);
                        palindroms.add(rev);

                    }
                }
            }
        }
        Collections.sort(palindroms);
        for (int p : palindroms){
            System.out.println(p);
        }
    }
}
