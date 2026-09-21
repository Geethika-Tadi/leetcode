class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            target.add(index[i],nums[i]);
        }
        int[] arr= new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            arr[i] = target.get(i);
        }
        return arr;
        
        
    }
}