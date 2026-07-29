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
        ListNode current=head;
        int count=1;
        if(head == null || k ==0) return head;
        while(current.next != null){
            current=current.next;
            count++ ;
        }
        current.next=head;
        System.out.println(count);
        int rotate=k%count;
        System.out.println("rotate :"+rotate);
        int total=count-rotate;
        System.out.println("total :"+total);

        while(total>0){
           current=current.next;
           System.out.println("current :"+current.val);
           total--;
         }
        head=current.next;
        current.next=null;
        return head;
    }
}
