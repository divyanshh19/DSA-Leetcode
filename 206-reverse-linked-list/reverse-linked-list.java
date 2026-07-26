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

        //Iterative -----
        // ListNode temp = head;
        // ListNode prev = null;
        // while(temp != null){
        //     ListNode front = temp.next; //assign the front next to temp
        //     temp.next = prev;   //temp will point to prev
        //     prev = temp;    //prev is reached to temp place
        //     temp = front;//temp will move to the front place
        // }
        // return prev;

        //Recursive approach --

        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
}