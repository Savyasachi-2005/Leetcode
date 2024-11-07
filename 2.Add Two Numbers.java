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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head node to simplify adding nodes to the result list
        ListNode dummyHead = new ListNode(0);
        
        // Pointer to the current node in the result list
        ListNode currentHead = dummyHead;
        
        // Carry to handle sums greater than 9
        int carry = 0;
        
        // Traverse both lists until all digits are processed
        while (l1 != null || l2 != null) {
            int sum = carry; // Start with carry from previous step
            
            // Add the value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node in l1
            }
            
            // Add the value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node in l2
            }
            
            // Calculate carry for the next digit
            carry = sum / 10;
            
            // Create a new node with the current digit (sum % 10) and attach it to the result list
            currentHead.next = new ListNode(sum % 10);
            
            // Move to the next node in the result list
            currentHead = currentHead.next;
        }
        
        // If there is a carry left after the loop, add it as a new node
        if (carry > 0) {
            currentHead.next = new ListNode(carry);
        }
        
        // Return the head of the result list (skipping the dummy head node)
        return dummyHead.next;
    }
}
