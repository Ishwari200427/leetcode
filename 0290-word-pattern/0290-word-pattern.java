class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Object,Integer>p=new HashMap<>();
       
        String word[]=s.split(" ");
        if(pattern.length()!=word.length)
        {
            return false;
        }
        for(int i=0;i<word.length;i++)
        {
            char pchar=pattern.charAt(i);
            String w=word[i];

            Integer pattern_index=p.put(pchar,i);
            Integer word_index=p.put(w,i);
            if(!Objects.equals(pattern_index,word_index))
            {
                return false;
            }
        }

        return true;
    }
}