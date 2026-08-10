class Solution {
    public int missingNumber(int[] nums) {
        int newArr[]=new int[nums.length+1];
        Arrays.sort(nums);
        if(nums[0]!=0)return 0;
        if(nums[nums.length-1]!=nums.length)return nums.length;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=i)return i;
        }
      return 0;
    }
}