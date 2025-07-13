class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>h1=new HashSet<>();
        for(int num:nums)
        {
            if(!h1.add(num))//add method return false if element is already present
            {
                return true;
            }
        }
        return false;
    }
}