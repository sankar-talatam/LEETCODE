class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(nums[n-1]<target)
        {
            return n;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        for(int i=0;i<n-1;i++)
        {
           
            if(target>nums[i] && target<nums[i+1] )
            {
                return i+1;
            }
        }
        return 0;
    }
}