package leetocde.easy;

class RecursiveSolution {
    public int search(int[] nums, int target) {

        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int first, int last, int target) {
        if (first > last) {
            return -1;
        }

        int mid = (first + last) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, last, target);
        } else {
            return binarySearch(nums, first, mid - 1, target);
        }
    }
}
