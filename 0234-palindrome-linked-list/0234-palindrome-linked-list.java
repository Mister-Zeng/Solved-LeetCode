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
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode temp = null; 
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
        }
        
        while(slow != null) {
            temp = slow.next; 
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        fast = head;
        slow = prev; 
        while(slow != null) {
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        
        return true; 
    }

}