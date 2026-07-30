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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null ||head.next == null || k < 0) return head;

        int len = 1;
        ListNode tail = head;

        while(tail.next !=null){
            len++;
            tail = tail.next;
        }
        if(k % len == 0) return head;

        k = k % len;//for larger k values
        tail.next = head;
        ListNode newLastNode = findNthNode(head , len - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }

    public ListNode findNthNode(ListNode head , int k){
        int cnt = 1;
        ListNode tail = head;
        while(tail != null){
            if(cnt == k) return tail;
            cnt++;
            tail = tail.next;
        }
        return tail;
    }
}