
public class Problem5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int number =  0;

        boolean noResult = true;
        while (noResult){
            number += 1;
            noResult = false;
            for (int i = 1 ; i <= 20 ; i++){
                if (number % i != 0){
                    noResult = true;
                    break;
                }
            }
        }

        System.out.println(number);

    }

}
