class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            result=result*26;
            result=result+(columnTitle.charAt(i)-'A'+1); // in java A to Z value starts from 0 but in Excel sheet its starts from 1 so to do this we just subtract ascii value of A from current char and add so it will get exact number ex:columnTitle.charAt(i) = 'B' ,'B' - 'A' =66 - 65 = 1 then 1 + 1 = 2 
        }
        return result;
    }
}