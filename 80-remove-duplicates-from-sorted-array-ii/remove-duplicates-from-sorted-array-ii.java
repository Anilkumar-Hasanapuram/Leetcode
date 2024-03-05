class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        if(nums.length<=k)
        {
            return nums.length;
        }
        int count=1;
        int index=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=k)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;

    }
}