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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> s=new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode n:lists){
            if(n != null){s.add(n);}
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(!s.isEmpty()){
            ListNode temp=s.poll();
            curr.next=temp;
            curr=curr.next;
            if(temp.next!=null){
                s.add(temp.next);
            }
        }
        return dummy.next;
    }
}
