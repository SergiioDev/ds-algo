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


    public static int[] selectionSort(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            int smallest = numbers[i];
            int smallestIndex = -1;
            for (int j = i; j < numbers.length ; j++) {
                if (smallest > numbers[j]){
                    smallest = numbers[j];
                    smallestIndex = j;
                }

            }

            if (smallestIndex>=0){
                int temp = numbers[i];
                numbers[i] = smallest;
                numbers[smallestIndex] = temp;
            }

        }

        return numbers;
    }


    public static int[] insertionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1 ; i++) {

            if(numbers[i] > numbers[i+1]){
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }

            int j = i;

            while ( j>0 &&  numbers[j] < numbers[j-1] ){
                int temp = numbers[j-1];
                numbers[j-1] = numbers[j];
                numbers[j] = temp;
                j--;
            }
        }
        return numbers;
    }




}
