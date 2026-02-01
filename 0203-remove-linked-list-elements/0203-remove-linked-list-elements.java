/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        dummy.next=head; //here we use dmmy to handle head deletion if we not take dummy variable then we need to write seperate logic for head deletion
        ListNode curr=dummy;
        while(curr.next!=null)
        {
            if(curr.next.val==val)
            {
                curr.next=curr.next.next;
           
            }
            else
            {
                curr=curr.next;
            }
        }
        return dummy.next; // here we return dummy.next which points to head and when head is present all list is present
    }
}