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
        // if(head == null){
        //     return null; 
        // }
        // int length = 0;
        // ListNode curr = head;
        // while(curr != null){
        //     //calculation of linked list length
        //     length++;
        //     curr = curr.next;
        // }
        // int position = length - n + 1;  //to get position from the end of the list 
        // if(position == 1){
        //     head = head.next;
        //     return head;
        // }
        // ListNode temp = head;
        // int cnt = 1;
        // while(temp != null){
        //     cnt++;
        //     if(cnt == position){
        //         temp.next = temp.next.next;
        //         temp = null; //optional
        //         break;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        ListNode temp = head;

        ListNode fast = head;
        for(int i = 0; i < n;i++){
            fast = fast.next;
        }
        ListNode slow = head;
        if(fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        return head;
    }
}