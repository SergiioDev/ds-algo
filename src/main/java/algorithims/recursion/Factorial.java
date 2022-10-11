package algorithims.recursion;

public class Factorial {
    public static int findFactorial(int number){
        if (number <= 2){
            return number;
        }

        return number * findFactorial(number - 1);

    }

}
