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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode coe=even;// to connect odd and even
        while(odd!=null && odd.next!=null  && even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            //System.out.println("odd"+odd.val);
            even.next=odd.next;
            even=even.next;
           // System.out.println("even"+even.val);
        }
        odd.next=coe; //connecting odd and even 
        return head;
    }
}
