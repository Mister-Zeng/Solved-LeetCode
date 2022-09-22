/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // declare a fast and slow pointer
        ListNode fast = head;
        ListNode slow = head;
        
        // Floy'd fast and slow pointer technique
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // check if there is a cycle
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}