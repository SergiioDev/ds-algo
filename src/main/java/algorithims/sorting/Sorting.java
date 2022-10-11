package algorithims.sorting;

public class Sorting {

    public static int[] bubbleShort(int[] numbers){
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = 0; j < numbers.length -1; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

}
