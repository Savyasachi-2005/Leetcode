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
    // Method to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Base case: If both lists are non-null, compare their values
        if (list1 != null && list2 != null) {
            // If the value of list1 node is smaller, select it as the next node in the merged list
            if (list1.val < list2.val) {
                // Recurse to merge the remaining nodes of list1 and list2
                list1.next = mergeTwoLists(list1.next, list2);
                return list1; // Return the current node of list1
            } else {
                // Otherwise, select list2's node as the next node in the merged list
                list2.next = mergeTwoLists(list1, list2.next);
                return list2; // Return the current node of list2
            }
        }

        // Base case: If list1 is null, return list2
        if (list1 == null) {
            return list2;
        }
        
        // Base case: If list2 is null, return list1
        return list1;
    }
}
