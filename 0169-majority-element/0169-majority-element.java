class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int major=0;

        for(int n:nums)
        {
             if(major==0)
             {
                res=n;
             }
             major+=n==res?1:-1;
        }
        return res;
    }
}