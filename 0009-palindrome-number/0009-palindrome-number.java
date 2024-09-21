class Solution {
    public boolean isPalindrome(int x) {
        int real,rev=0;
        int rem;
        real=x;
        while(x>0)
        {
            rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        return (real==rev);
    }
}
