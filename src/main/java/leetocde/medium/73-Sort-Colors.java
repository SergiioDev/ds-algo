package leetocde.medium;

class SortColors {
    // Bucket Sort Algorithm
    public void sortColors(int[] nums) {
        if (nums.length == 1) return;
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
    }
}
