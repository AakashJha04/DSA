/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getLength(ListNode head){
        if(head==null)return 0;
        int cnt = 0;
        while(head!=null){
            head = head.next;
            cnt++;
        }
        return cnt;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthNodeA = getLength(headA);
        int lengthNodeB = getLength(headB);

        boolean nodeASkip = false;
        boolean nodeBSkip = false;

        int skipLengh = 0;

        if(lengthNodeA>lengthNodeB){
            skipLengh = lengthNodeA - lengthNodeB;
            nodeASkip = true;
        }
        else{
            skipLengh = lengthNodeB - lengthNodeA;
            nodeBSkip = true;
        }

        int tempLength = skipLengh;

        if(nodeASkip){
            while(tempLength>0){
                tempA = tempA.next;
                tempLength--;
            }
        }
        else{
            while(tempLength>0){
                tempB = tempB.next;
                tempLength--;
            }
        }

        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;


    }
}