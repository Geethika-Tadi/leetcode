class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Step 1
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4
        reverse(nums, i + 1, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}