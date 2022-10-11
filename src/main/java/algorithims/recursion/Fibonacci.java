package algorithims.recursion;

public class Fibonacci {
    public static int findFibonacci(int number){
        if (number < 2){
            return number;
        }

        return findFibonacci(number - 1) + findFibonacci(number-2) ;
    }

}
