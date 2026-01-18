class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>range=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int j=i;
            int start=nums[i];
            
            while(j+1<nums.length && nums[j+1]==nums[j]+1)
            {
                j++;
            }

            if(start==nums[j])
            {
                range.add(String.valueOf(start));
            }
            else
            {
                range.add(start +"->" +nums[j]);
            }
            i=j+1;
        }
        return range;
    }
}