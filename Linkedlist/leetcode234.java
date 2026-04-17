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
    public boolean isPalindrome(ListNode head) {
        ListNode dup = null;
        ListNode first = head;
        ListNode current = head;
        while (current != null) {
            ListNode newNode = new ListNode(current.val); 
            newNode.next=dup;
            dup=newNode;
            current=current.next;

        }
        while (first != null && dup != null) {
            if (first.val != dup.val) {
                return false;
            }
            first = first.next;
            dup = dup.next;
        }

        return true;
    }
}
