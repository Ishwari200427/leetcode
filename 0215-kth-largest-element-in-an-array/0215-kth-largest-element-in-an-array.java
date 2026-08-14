class Solution {
    public int findKthLargest(int[] nums, int k) {
        int large=0;
     
        PriorityQueue pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
           pq.add(nums[i]);
        }
        for(int i=0;i<k;i++)
        {
           large=(int)pq.poll();
        }

      return large;
    }
}