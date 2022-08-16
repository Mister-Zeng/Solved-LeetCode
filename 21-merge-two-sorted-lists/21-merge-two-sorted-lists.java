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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        // if no list, return null
        if(list1 == null && list2 == null) {
            return null;
        }
        // if there is only 1 list, return the other list
        if(list1 == null) {
            return list2;
        } 
        
        if(list2 == null) {
            return list1;
        }
        // compare the two list and add the smallest value to the next head of the new list
        if(list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        // recurison
        head.next = mergeTwoLists(list1, list2);
        
        return head;
    }
}