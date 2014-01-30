/**
 * Created by jennynilsson on 2014-01-30.
 */
public class Problem9 {

    public static void main(String[] args){

        for (int a = 1 ; a <= 249 ; a++) {
            for (int b = 1 + a ; b <= 499 ; b++) {
                int c = 1000 - a - b;
                if ((a * a + b * b) == (c * c)){
                    System.out.println("a * b * c  =  " + (a * b * c));
                    return;
                }
            }
        }
    }
}
