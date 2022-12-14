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
            int j = i;
            while (j >= 0 && numbers[j +1] < numbers[j]) {
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
        if (n <= 1) {
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
            if (left[i] <= right[j]) {
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

    public static int[] quickSort(int[]nums, int l, int r) {
        if (l - r + 1 <= 1) {
            return nums;
        }

        int pivot = nums[r];
        int left = l;

        for (int i = 0; i < r; i++) {
            if (nums[i] < pivot) {
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
                left++;
            }
        }
        nums[r] = nums[left];
        nums[left] = pivot;

        quickSort(nums, l, left - 1);
        quickSort(nums, left + 1, r);

        return nums;
    }


    public static int[] bucketSort(int[]nums){
        int[] counts = {0,0,0};
        for(int i =0; i< nums.length; i++){
            counts[nums[i]]++;
        }

        int i = 0;
        for(int n = 0; n < counts.length; n++){
            for(int j = 0; j < counts[n]; j++){
                nums[i++] = n;
            }
        }
        return nums;
    }

}


