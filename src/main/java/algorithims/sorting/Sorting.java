package algorithims.sorting;

import java.util.Random;

public class Sorting {

    public static int[] bubbleShort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }


    public static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int smallest = numbers[i];
            int smallestIndex = -1;
            for (int j = i; j < numbers.length; j++) {
                if (smallest > numbers[j]) {
                    smallest = numbers[j];
                    smallestIndex = j;
                }

            }

            if (smallestIndex >= 0) {
                int temp = numbers[i];
                numbers[i] = smallest;
                numbers[smallestIndex] = temp;
            }

        }

        return numbers;
    }


    public static int[] insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }

            int j = i;

            while (j > 0 && numbers[j] < numbers[j - 1]) {
                int temp = numbers[j - 1];
                numbers[j - 1] = numbers[j];
                numbers[j] = temp;
                j--;
            }
        }
        return numbers;
    }

    public static void mergeSort(int[] numbers) {
        int n = numbers.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = numbers[i];
        }

        for (int i = mid; i < numbers.length; i++) {
            right[i - mid] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(numbers, left, right);

    }

    private static void merge(int[] numbers, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                numbers[k] = left[i];
                i++;
            } else {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }


        while (i < left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }

    }



    public static void quickSort(int[] array, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){
            return;
        }

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swapElements(array, pivotIndex, highIndex);

        while (leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swapElements(array,leftPointer,rightPointer);

        }

        if(array[leftPointer] > pivot){
            swapElements(array,leftPointer,highIndex);
        }else{
            leftPointer = highIndex;
        }

        quickSort(array,lowIndex,leftPointer - 1);

        quickSort(array,leftPointer + 1,highIndex);

    }

    private static void swapElements(int[] array, int element1, int element2){
        int temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }

}


