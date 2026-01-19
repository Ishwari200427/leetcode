class Solution {
    public int[] countBits(int n) {
      int answer[]=new int[n+1];
      
        for(int i=0;i<=n;i++)
        {
            int ones=0;
            String binary=Integer.toBinaryString(i);
            for(int j=0;j<binary.length();j++)
            {
               
                if(binary.charAt(j)=='1')
                {
                    ones++;
                }
            }
            answer[i]=ones;
        }
        return answer;
    }
   
    
}