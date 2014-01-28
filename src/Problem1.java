/**
 * Created with IntelliJ IDEA.
 * User: jennynilsson
 * Date: 2013-02-23
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 {


    public static void main(String[] args){

        int sum = 0;
        for (int i = 0; i <1000 ; i++){
            if (i % 5 == 0 || i % 3 == 0){
                sum = sum + i;
            }

        }

        System.out.print("We got sum " + sum);
    }
}
