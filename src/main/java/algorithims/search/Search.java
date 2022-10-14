package algorithims.search;

public class Search {

    public static int binarySearch(int[] nums, int left, int right, int target){
        if (left > right){
            return -1;
        }
        int mid = left + (right - 1)/2;

        if (target > nums[mid]){
          return  binarySearch(nums,mid + 1, right, target);
        }else if(target < nums[mid]){
           return binarySearch(nums,left, mid - 1, target);
        }else{
            return mid;
        }

    }

}
