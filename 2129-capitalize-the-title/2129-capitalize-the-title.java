class Solution {
    public String capitalizeTitle(String title) {
        String words[]=title.split(" ");
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<words.length;i++)
        {
            words[i]=words[i].toLowerCase();
            if(words[i].length()<=2)
            {
                sb.append(words[i]);
            }
            else
            {
                sb.append(
                    String.valueOf(Character.toUpperCase(words[i].charAt(0))+ words[i].substring(1))  );
            }
            if(i<words.length-1) // this is for adding space except last word
            {
                sb.append(" "); 
            }
        }
        return sb.toString();
    }
}