
public class Problem6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int sumOfSquare = 0;
        int squareOfSum = 0;

        for (int i = 1 ; i<= 100 ; i++ ){
            sumOfSquare += i * i;
            squareOfSum += i;
        }

        squareOfSum = squareOfSum * squareOfSum;

        System.out.println(sumOfSquare);
        System.out.println(squareOfSum);
        System.out.println(squareOfSum - sumOfSquare);



    }

}
