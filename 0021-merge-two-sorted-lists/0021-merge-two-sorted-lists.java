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
        ListNode merged = new ListNode();
        
        if(list1 == null && list2 == null){
            return null;
        }
        
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        if(list1.val < list2.val){
            merged = list1;
            list1 = list1.next;
        } else {
            merged = list2;
            list2 = list2.next;
        }
        
        merged.next = mergeTwoLists(list1, list2);
        
        return merged;
    }
}