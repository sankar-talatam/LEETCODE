class Solution {
    public int missingNumber(int[] nums) {
        int s=0,c=0;
        for(int i=1;i<=nums.length;i++)
        {
            s+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
        }
        return s-c;
    }
}