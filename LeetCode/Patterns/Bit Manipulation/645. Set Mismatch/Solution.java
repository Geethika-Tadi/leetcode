import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int duplicate = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == nums[i]) {
                duplicate = nums[i];
                break;
            }
        }

        int n = nums.length;
        int expected = n * (n + 1) / 2;

        int actual = 0;

        for(int x : nums) {
            actual += x;
        }

        int missing = expected - actual + duplicate;

        return new int[]{duplicate, missing};
    }
}