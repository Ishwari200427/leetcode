class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb=new StringBuffer("");
        while(columnNumber>0)
        {
            columnNumber--; //this is for decreasing columnNumber becoz columnNumber in excel sheets starts from 1 they are not 0 based
            sb.insert(0,(char)(columnNumber % 26 +'A'));//adds modulus value to ascii value of A so it will generate the exact columnName
            columnNumber/=26; //used to reach to condition of while loop
        }
        return sb.toString();
    }
}