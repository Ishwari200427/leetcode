class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        return rev.equals(s);
    }
}