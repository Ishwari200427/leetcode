class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>h1=new HashSet<>();//used HashSet to track whether we’ve seen a number before (to detect cycles).
        while(n!=1 && !h1.contains(n))
        {
            h1.add(n);
            n=squareSum(n);
        }
        return n==1;
    }
    private int squareSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}