class Solution {
    private static boolean isVowel(char c)
    {
        return "aeiouAEIOU".indexOf(c)!=-1;//here -1 is used when index not found means it returns false
    }
    public String reverseVowels(String s) {
        int low=0;
        int high=s.length()-1;
        char []str=s.toCharArray();
        while(low<high)
        {
            while(low<high &&!isVowel(str[low]))
            {
                low++;
            }
            while(low<high &&!isVowel(str[high]))
            {
                high--;
            }
            if(low<high)
            {
                char temp=str[low];
                str[low]=str[high];
                str[high]=temp;
                low++;
                high--;
            }
        }
        return new String(str); //here we call String constuctor
    }
}