class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for(int i=1;i<n;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        return min;
    }
}