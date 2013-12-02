import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-02-23
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem2 {


    public static void main(String[] args){

        long sum = 0;

        long first = 0;
        long second = 1;

        long result = 0;

        boolean run = true;

        while (run){

            sum = first + second;

            if (sum >= 4000000){
                run = false;
            } else {
                if ((sum) % 2 == 0){
                    result = result + sum;
                }

                first = second;
                second = sum;
            }
        }

        System.out.print("We got sum " + result);

    }
}
