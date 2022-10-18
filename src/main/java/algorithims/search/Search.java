package algorithims.search;

public class Search {

    public static int binarySearch(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return nums[mid];
            }

        }
        return -1;
    }

    public static boolean binarySearchRecursive(int[] nums, int left, int right, int target) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;

        if (target > nums[mid]) {
            return binarySearchRecursive(nums, mid + 1, right, target);
        } else if (target < nums[mid]) {
            return binarySearchRecursive(nums, left, mid - 1, target);
        } else {
            return true;
        }
    }
}
