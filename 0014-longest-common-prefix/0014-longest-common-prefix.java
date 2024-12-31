class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s1,s2;
        Arrays.sort(strs);
        s1=strs[0];
        s2=strs[strs.length-1];
        int i=0;

        while(i<s1.length() && i<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                i++;
               
            }
            else
            {
                break;
            }
           
        }
        return s1.substring(0,i);
    }
}