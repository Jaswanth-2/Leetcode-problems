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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        int count=1;
        if(head == null || k==0) return head;
        while(curr.next != null){
            curr=curr.next;
            count++;
        }
        curr.next=head;
        int rotate=k%count;
        int total=count-rotate;
        
        while(total>0){
            curr=curr.next;
            total--;
        }

        head=curr.next;
        curr.next=null;
        return head;
    }
}
