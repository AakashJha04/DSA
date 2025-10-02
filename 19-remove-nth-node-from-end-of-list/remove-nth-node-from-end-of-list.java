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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        // First pass: get length
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // If we need to remove the head node
        if (n == len) {
            return head.next;
        }

        // Second pass: find the node just before the one to remove
        int operationTodo = len - n;
        temp = head;
        for (int i = 1; i < operationTodo; i++) {
            temp = temp.next;
        }

        // Remove the node
        temp.next = temp.next.next;
        return head;


    }
}