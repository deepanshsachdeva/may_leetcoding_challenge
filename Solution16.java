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
        ListNode oddHead = new ListNode(-1);
        ListNode odd = oddHead;
        ListNode evenHead = new ListNode(-1);
        ListNode even = evenHead;
        
        boolean flag=false;
        
        while(head != null) {
            if (flag) {
                even.next = head;
                even = head;
                
            } else {
                odd.next = head;
                odd = head;
            }
            
            head = head.next;
            
            flag = !flag;
        }
        even.next = null;
        
        odd.next = evenHead.next;
        
        return oddHead.next;
    }
}