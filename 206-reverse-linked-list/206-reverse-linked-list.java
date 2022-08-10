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
    public ListNode reverseList(ListNode head) {
        return rec(head, null);
    }
    
    public ListNode rec (ListNode node, ListNode prev){
           if(node == null){
               return prev;
           }
           
           ListNode temp = node.next;
           node.next = prev;
           return rec(temp, node);
       } 
}