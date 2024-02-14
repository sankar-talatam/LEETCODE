class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int k=0,m=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[k]=nums[i];
                k+=2;
            }
            else
            {
                arr[m]=nums[i];
                m+=2;
            }
        }
        return arr;
    }
}